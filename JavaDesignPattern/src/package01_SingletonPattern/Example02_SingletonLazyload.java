package package01_SingletonPattern;

class SingletonLazyLoad {

    private static SingletonLazyLoad singletonInstance = null;
    private SingletonLazyLoad() {}
    public static SingletonLazyLoad  getInstance() {
        if (null == singletonInstance) {
        	System.out.println("... Creating fresh instance.");
            singletonInstance = new SingletonLazyLoad();
        }
        return singletonInstance;
    }
}

public class Example02_SingletonLazyload {

	public static void main(String[] args) {
		
//    	// preventing from object creation using private constructor
//    	SingletonLazyLoad basic0 = new SingletonLazyLoad();
//    	System.out.println("Created instance basic0 " + basic0.hashCode());

		// get object using getInstance() static method
		SingletonLazyLoad basic1 = SingletonLazyLoad.getInstance();
    	System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
    	SingletonLazyLoad basic2 = SingletonLazyLoad.getInstance();
    	System.out.println("Created instance basic2 , it's hashCode : " + basic2.hashCode());
    	SingletonLazyLoad basic3 = SingletonLazyLoad.getInstance();
    	System.out.println("Created instance basic3 , it's hashCode : " + basic3.hashCode());
	}
}
