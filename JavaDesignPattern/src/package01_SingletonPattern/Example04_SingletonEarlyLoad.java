package package01_SingletonPattern;

class SingletonEarlyLoad {

    private static SingletonEarlyLoad singletonInstance = new SingletonEarlyLoad();
    private SingletonEarlyLoad() {
    	System.out.println("... Creating fresh instance during class loading.");
    }
    public static SingletonEarlyLoad  getInstance() {
        return singletonInstance;
    }
}

public class Example04_SingletonEarlyLoad {

	public static void main(String[] args) {

//    	// preventing from object creation using private constructor
//    	SingletonEarlyLoad basic0 = new SingletonEarlyLoad();
//    	System.out.println("Created instance basic0 " + basic0.hashCode());

		// get object using getInstance() static method
		SingletonEarlyLoad basic1 = SingletonEarlyLoad.getInstance();
    	System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
    	SingletonEarlyLoad basic2 = SingletonEarlyLoad.getInstance();
    	System.out.println("Created instance basic2 , it's hashCode : " + basic2.hashCode());
    	SingletonEarlyLoad basic3 = SingletonEarlyLoad.getInstance();
    	System.out.println("Created instance basic3 , it's hashCode : " + basic3.hashCode());
	}
}
