package package01_AbstractClass;

// abstract class with only constructor (Default and Parameterized)
abstract class Child2{
	public Child2(){System.out.println("Default constructor for Child2.");};
	public Child2(int n){System.out.println("Parameterized constructor for Child2.");};
}

public class General2 extends Child2{

	public General2() {
		System.out.println("Default constructor for General2.");
	}
	public General2(int i) {
		super(i);
		System.out.println("Parameterized constructor for General2.");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		General2 g21 = new General2();
		General2 g22 = new General2(99);
		System.out.println("Inside General2 class");
	}
}
