package package02_InheritanceMultilevel;

class Car{
	int wheelCount       = 0;
	int maxSpeed         = 0;
	int engineCapacityCC = 0;
	int seatCapacity     = 0;
}

class SportsCar extends Car{
	String gearType = "";
	String brand    = "";
}


public class Vehicle {

	public static void main(String[] args) {
		SportsCar objSportsCar = new SportsCar();
		objSportsCar.wheelCount  	    = 4;
		objSportsCar.maxSpeed  	        = 100;
		objSportsCar.engineCapacityCC 	= 400;
		objSportsCar.seatCapacity  	    = 2;
		objSportsCar.gearType  	        = "automatic";
		objSportsCar.brand  	        = "Bugati";
		System.out.println("Inheritance for Vehicle type");
	}

}


