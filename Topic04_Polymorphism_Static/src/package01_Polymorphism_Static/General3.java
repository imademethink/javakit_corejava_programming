package package01_Polymorphism_Static;

public class General3{

	// example of constructor overloading
	public General3()         {System.out.println("Empty constructor");}
	public General3(int n)    {System.out.println("Constructor with single int parameter");}
	public General3(String s) {System.out.println("Constructor with single String parameter");}
	public General3(String s2, int n2) 
	                          {System.out.println("Constructor with two parameters");}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		General3 g31 = new General3();
		General3 g32 = new General3(99);
		General3 g33 = new General3("Hello");
		General3 g34 = new General3("Java Kitkat", 150);

		System.out.println("Inside General3 class");
	}
}
