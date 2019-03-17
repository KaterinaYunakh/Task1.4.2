package com.katerina.Cars;


public class Wheel{
	String wheelBrand;
	float wheelDiameter;
	
	public Wheel(String brand, float diameter){
		this.wheelBrand = brand;
		this.wheelDiameter = diameter;
	}
	
	public String toString(){
		String wheelString = "";
		if (this.wheelBrand != null){
			wheelString += "Brand: " + this.wheelBrand +" ";
		}
		wheelString += "Diameter: " + Float.toString(this.wheelDiameter) + "; ";
		
		return wheelString;
	}
	
	public int hashCode(){
		return this.toString().hashCode();
	}
	
	public boolean equals(Wheel obj){
		return this.hashCode() == obj.hashCode();
	}
}