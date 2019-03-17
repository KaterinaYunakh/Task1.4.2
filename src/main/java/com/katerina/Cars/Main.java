import com.katerina.Cars.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
		
		Wheel[] wheelsCar1 = new Wheel[4];
		wheelsCar1[0]= new Wheel("Continental", 18);
		wheelsCar1[1] = new Wheel("Continental", 18);
		wheelsCar1[2] = new Wheel("Continental", 18);
		wheelsCar1[3] = new Wheel("Continental", 18);
		
		Car car1  = new Car("Audi", 60, 3, wheelsCar1);
		System.out.println(car1);
			
		Wheel[] wheelsCar2 = new Wheel[4];
		wheelsCar2[0]= new Wheel("Continental", 18);
		wheelsCar2[1] = new Wheel("Continental", 18);
		wheelsCar2[2] = new Wheel("Continental", 18);
		wheelsCar2[3] = new Wheel("Continental", 18);
		
		Car car2  = new Car("Audi", 60, 3, wheelsCar2);
		System.out.println(car2);
			
		if (car1.equals(car2)){
			System.out.println("Cars are equal");
		} else {
			System.out.println("Cars are not equal");
		}
	
		car1.getCarBrand();
		
		car1.refuel(10);
		car1.go(5);
		System.out.println(car1);
		
		car1.refuel(70);
		car1.go(7);
		
		Wheel newWheel = new Wheel("Nokia", 17);
		car1.changeWheel(newWheel, 4);
		car1.changeWheel(newWheel, 0);
		
		System.out.println(car1);
		
		
		if (car1.equals(car2)){
			System.out.println("Cars are equal");
		} else {
			System.out.println("Cars are not equal");
		}
			
	}

}