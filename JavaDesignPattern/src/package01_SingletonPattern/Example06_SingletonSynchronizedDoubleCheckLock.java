package package01_SingletonPattern;

// Once an object is created synchronization is no longer useful because 
// now amazon object will not be null and any sequence of operations will lead to consistent results.
// So we will only acquire lock on the getInstance() once, when the obj is null.
// This way we only synchronize the first way through, just what we want.

// When declared the amazon object volatile 
// it  ensures that multiple threads offer the amazon object variable correctly 
// when it is being initialized to Amazon() instance. 
// This method drastically reduces the overhead of calling the synchronized method every time.

class Amazon {
	 private volatile static Amazon amazon = null;
	 private Amazon(){}
	 
   public static Amazon getInstance()
   {
       if (amazon==null)  {
    	   		// To make thread safe
    	   		synchronized(Amazon.class){
    	   			// double check locking mechanism as multiple thread may reach upto this step
    	   			if (amazon==null) amazon = new Amazon();    	   			
    	   		}
    	   }
       return amazon;
   }
}

public class Example06_SingletonSynchronizedDoubleCheckLock {

	public static void main(String[] args) {
//		// preventing from object creation using private constructor
//		Amazon basic0 = new Google();
//		System.out.println("Created instance basic0 " + basic0.hashCode());

		// get object using getInstance() static method
		Amazon basic1 = Amazon.getInstance();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		Amazon basic2 = Amazon.getInstance();
		System.out.println("Created instance basic2 , it's hashCode : " + basic2.hashCode());
		Amazon basic3 = Amazon.getInstance();
		System.out.println("Created instance basic3 , it's hashCode : " + basic3.hashCode());		
	}
}
