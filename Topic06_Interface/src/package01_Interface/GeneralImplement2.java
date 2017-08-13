package package01_Interface;

// interface with unimplemented methods
interface Child8{
	public int a = 200;
	public void unimplementedMethod();
}

// chained interface with additional unimplemented methods
interface Parent8 extends Child8{
	public void additionalUnimplementedMethod();
}

public class GeneralImplement2{

	public static void main(String[] args) {

		System.out.println("Inside GeneralImplement2 class");
	}
}
