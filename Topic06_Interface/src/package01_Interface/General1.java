package package01_Interface;

// empty interface
interface Child1{
	
}

public class General1 implements Child1{

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		General1 g1 = new General1();
		System.out.println("Inside General1 class");
	}
}
