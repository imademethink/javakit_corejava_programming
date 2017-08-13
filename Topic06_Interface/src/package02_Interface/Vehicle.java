package package02_Interface;

interface Car{
	
	public boolean chechFuelLevel();
	public boolean checkEngineIgnition();
	public boolean checkGearPosition();
	public boolean driveCar();
}

class SportsCar implements Car{

	public float fuelLevel         = 0.0f;
	public boolean ignitionStatus  = false;
	public String gearPosition     = "neutral";
	
	public SportsCar(){
		fuelLevel= 10.5f; // 10.5 liter fuel present
		ignitionStatus = false;
		gearPosition   = "neutral";
	}
	
	public boolean chechFuelLevel(){
		System.out.println("Checking fuel level indicator.");
		if(fuelLevel < 1.0f) return false;
		return true;
	};

	public boolean checkEngineIgnition(){
		if(! ignitionStatus){ignitionStatus = true;}
		System.out.println("Ignition status is On.");
		return true;
	}

	public boolean checkGearPosition(){
		if(!gearPosition.contains("neutral")){return false;}
			gearPosition = "first gear";
		return true;
	}

	public boolean driveCar(){
		System.out.println("Raising speed gradually!");
		return true;
	}	
}

public class Vehicle {

	public static void main(String[] args) {
		Car sc = new SportsCar();
		sc.chechFuelLevel();
		sc.checkEngineIgnition();
		sc.checkGearPosition();
		sc.driveCar();
		System.out.println("Inside Vehicle example");
	}
}
