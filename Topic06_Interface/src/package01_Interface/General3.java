package package01_Interface;

// interface with all types of data members/ variables
interface Child3{
	int           defaultInt    = 10;

//  protected data member is not allowed
//	 protected int protectedInt  = 20;
	
	public int    publicInt     = 30;
	
//  private data member is not allowed
//	 private int   privateInt    = 40;
	
	static int    staticInt     = 50;
	
	final int     finalInt      = 60;
}

public class General3 implements Child3{

	public static void main(String[] args) {
//		General3 g3 = new General3();
//      data members should be accessed as static 
//		System.out.println(g3.defaultInt++);
		System.out.println(defaultInt);
		
//      data members should be accessed as static 
//		System.out.println(g5.publicInt++);
		System.out.println(publicInt);

//      data members should be accessed as static
//		System.out.println(Child5.staticInt++);
		System.out.println(staticInt);
		
//      data members should be accessed as static
//		System.out.println(g5.finalInt);
		System.out.println(finalInt);

		System.out.println("Inside General3 class");
	}
}
