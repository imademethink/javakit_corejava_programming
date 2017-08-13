package package01_SingletonPattern;

// Using synchronized makes sure that only one thread at a time can execute getInstance()
// Disadvantage of this method is that using synchronized every time while
// creating the singleton object is expensive and may decrease the performance of your program.
class Google {
	 private static Google google = null;
	 private Google(){}
	 float dd;
	 
	 public boolean chk(float tt){
	     if (google==null)  { return false;}
		 dd = tt;
		 System.out.println(dd);
		 return true;
	 }
	 public boolean chk2(float tt){
	     if (google==null)  { return false;}
		 dd += tt;
		 System.out.println(dd);
		 return true;
	 }
	 public boolean chk3(float tt){
	     if (google==null)  { return false;}
		 dd -= tt;
		 System.out.println(dd);
		 return true;
	 }
	 
	// Only one thread can execute this at a time
    public static synchronized Google getInstance(){
        if (google==null)  {google = new Google();}
        return google;
    }
}

public class Example05_SingletonSynchronized {

	public static void main(String[] args) {
//		// preventing from object creation using private constructor
//		Google basic0 = new Google();
//		System.out.println("Created instance basic0 " + basic0.hashCode());

		// get object using getInstance() static method
		Google basic1 = Google.getInstance();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		basic1.chk(50000.0f);
		basic1.chk2(25000.0f);
		basic1.chk3(5000.0f);
		basic1.chk2(750.0f);
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		Google basic2 = Google.getInstance();
		System.out.println("Created instance basic2 , it's hashCode : " + basic2.hashCode());
		Google basic3 = Google.getInstance();
		System.out.println("Created instance basic3 , it's hashCode : " + basic3.hashCode());		
	}
}
