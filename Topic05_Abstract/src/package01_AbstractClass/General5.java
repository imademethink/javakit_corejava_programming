package package01_AbstractClass;

// abstract class with all types of data members/ variables
abstract class Child5{
	int           defaultInt    = 10;
	protected int protectedInt  = 20;
	public int    publicInt     = 30;
	@SuppressWarnings("unused")
	private int   privateInt    = 40;
	static int    staticInt     = 50;
	final int     finalInt      = 60;
}

public class General5 extends Child5{

	public static void main(String[] args) {
		General5 g5 = new General5();
		System.out.println(g5.defaultInt++);
		
		System.out.println(g5.protectedInt++);
		
		System.out.println(g5.publicInt++);

//		Private members are not visible in derived class
//		System.out.println(g5.privateInt);

//     Incorrect way to access static members from base class
//		System.out.println(g5.staticInt);
		System.out.println(Child5.staticInt++);
		
		System.out.println(g5.finalInt);
//		Final variables can not be re-assigned any value
//		g5.finalInt = 61;

		System.out.println("Inside General5 class");
	}
}
