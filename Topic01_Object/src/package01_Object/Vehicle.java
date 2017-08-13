package package01_Object;

public class Vehicle {

	public int nSpeed = 0;
	public void drive(){
		System.out.println("drive() method invoked");
	}
	
	public static void main(String[] args) {
		Vehicle objVehicle = new Vehicle();
		objVehicle.nSpeed  = 40;
		System.out.println("setting speed variable to " + objVehicle.nSpeed);

		objVehicle.drive();
	}

}
