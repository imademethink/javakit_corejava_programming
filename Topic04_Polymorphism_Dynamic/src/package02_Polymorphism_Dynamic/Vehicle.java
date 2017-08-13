package package02_Polymorphism_Dynamic;

class Car{
	
	public boolean chechFuelLevel(){
		System.out.println("chechFuelLevel");
		return true;
	}
	public boolean checkEngineIgnition(){
		System.out.println("checkEngineIgnition");
		return true;
	}
	public boolean checkGearPosition(){
		System.out.println("checkGearPosition");
		return true;
	}
	public boolean driveCar(){
		System.out.println("driveCar");
		return true;
	}
}

class SportsCar extends Car{

	public float fuelLevel         = 0.0f;
	public boolean ignitionStatus  = false;
	public String gearPosition     = "neutral";
	
	public SportsCar(){
		fuelLevel= 10.5f; // 10.5 liter fuel present
		ignitionStatus = false;
		gearPosition   = "neutral";
	}
	
	@Override
	public boolean chechFuelLevel(){
		System.out.println("Checking fuel level indicator.");
		if(fuelLevel < 1.0f) return false;
		return true;
	};

	@Override
	public boolean checkEngineIgnition(){
		if(! ignitionStatus){ignitionStatus = true;}
		System.out.println("Ignition status is On.");
		return true;
	}

	@Override
	public boolean checkGearPosition(){
		if(!gearPosition.contains("neutral")){return false;}
			gearPosition = "first gear";
		return true;
	}

	@Override
	public boolean driveCar(){
		System.out.println("Raising speed gradually!");
		return true;
	}	
}

public class Vehicle {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.chechFuelLevel();
		sc.checkEngineIgnition();
		sc.checkGearPosition();
		sc.driveCar();
		System.out.println("Inside Vehicle example");
	}
}
