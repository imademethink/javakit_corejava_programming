package package02_Polymorphism_Static;

abstract class Car{
	public String name    = "";
	public int price      = 0;
	public String category= "";
	
	public Car(){
		price    = 550;
		name     = "Aston Martin";
		category = "Sports";
	}
	
	public void DriveCar(){
		System.out.println("Check fuel level.");
		System.out.println("Check engine ignition.");
		System.out.println("Check gear position.");
		System.out.println("Start engine and adjust gear.");
		return;
	}

}

class SportsCar extends Car{
	@Override
	public void DriveCar(){
		System.out.println("Check fuel level.");
		System.out.println("Check engine ignition.");
		// since this car is gear-less
//		System.out.println("Check gear position.");
		System.out.println("Start engine and raise accelarator.");
		return;
	}
}

public class Vehicle {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.DriveCar();
	}
}
