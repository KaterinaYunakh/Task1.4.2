package com.katerina.Cars;


public class Car{
	private String carBrand;
	private int tankCapacity;
	private int fuelComsumption;
	private int fuelAmount = 0;
	private Wheel[] arrWheels;
	
	public Car(String carBrand, int tankCapacity, int fuelComsumption, Wheel[] arrWheels){
		this.carBrand = carBrand;
		this.tankCapacity = tankCapacity;
		this.fuelComsumption = fuelComsumption;
		this.arrWheels = arrWheels;
	}
	
	public void changeWheel(Wheel newWheel, int index){
		if (index<arrWheels.length){
			this.arrWheels[index] = newWheel;
		} else {
			System.out.println("The car doesn't have a wheel with index: " + index);
		}
		
	}
	
	public void getCarBrand(){
		System.out.println("Car Brand:" + this.carBrand);
	}
	
	public void go(int distanceKm){
		if (this.fuelAmount >= distanceKm * this.fuelComsumption){
			this.fuelAmount -= distanceKm * this.fuelComsumption;
			System.out.println("The car rode " + distanceKm + " km, fuel left " + this.fuelAmount + " liters");
		} else {
			System.out.println("Not enough fuel to ride " + distanceKm + " km, fuel left " + this.fuelAmount + " liters"); 
		}
	}
	
	public void refuel(int newFuel){
		if (newFuel > this.tankCapacity - this.fuelAmount){
			this.fuelAmount = this.tankCapacity;
			System.out.println("Re-fuel: fuel tank is full");
		}else {
			this.fuelAmount += newFuel;
			System.out.println("Re-fuel: fuel amount is " + this.fuelAmount + " liters");
		}
	}
		
	public String toString(){
		String carString = "Car Brand: " + this.carBrand + "\n";
		carString += "Tank Capacity: " + this.tankCapacity + "\n";
		carString += "Fuel Consumption: " + this.fuelComsumption + "\n";
		carString += "Fuel Amount: " + this.fuelAmount + "\nWheels: ";
		for (Wheel wheel:arrWheels){
			carString += wheel.toString() + "\n\t";
		}
		return carString;
	}
	
	public int hashCode(){
		return this.toString().hashCode();
	}
	
	public boolean equals(Car obj){
		return this.hashCode() == obj.hashCode();
	}
	
}