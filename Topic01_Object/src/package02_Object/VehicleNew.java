package package02_Object;

import package01_Object.Vehicle;

public class VehicleNew {

	public void driveNew(){
		System.out.println("driveNew() method invoked");
	}

	public static void main(String[] args) {
		// creating object for class belongs to other package
		Vehicle objVehicle3 = new Vehicle();
		objVehicle3.nSpeed  = 45;
		System.out.println("setting speed variable to " + objVehicle3.nSpeed);
		objVehicle3.drive();
	}

}
