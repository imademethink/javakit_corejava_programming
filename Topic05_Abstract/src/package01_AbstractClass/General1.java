package package01_AbstractClass;

// empty abstract class
abstract class Child1{
	
}

public class General1 extends Child1{

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		General1 g1 = new General1();
		System.out.println("Inside General1 class");
	}
}
