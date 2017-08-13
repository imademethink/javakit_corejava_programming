package package01_SingletonPattern;

class SingletonBasic {

    private static SingletonBasic singletonInstance = null;

    private SingletonBasic() {}

    public static SingletonBasic  getInstance() {
        if (null == singletonInstance) {
        	System.out.println("... Creating fresh instance.");
            singletonInstance = new SingletonBasic();
        }
        return singletonInstance;
    }
}

public class Example01_SingletonBasic {

	public static void main(String[] args) {
		
//    	// preventing from object creation using private constructor
//    	SingletonBasic basic0 = new SingletonBasic();
//    	System.out.println("Created instance basic0 " + basic0.hashCode());

		// get object using getInstance() static method
		SingletonBasic basic1 = SingletonBasic.getInstance();
    	System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
    	SingletonBasic basic2 = SingletonBasic.getInstance();
    	System.out.println("Created instance basic2 , it's hashCode : " + basic2.hashCode());
    	SingletonBasic basic3 = SingletonBasic.getInstance();
    	System.out.println("Created instance basic3 , it's hashCode : " + basic3.hashCode());
	}
}
