package package01_Interface;

// interface with unimplemented methods
interface Child7{
	public int a = 100;
	public void unimplementedMethod();
}

//chained interface with unimplemented methods
interface Parent7 extends Child7{

}

public class GeneralImplement1{

	public static void main(String[] args) {
		
		System.out.println("Inside GeneralImplement1 class");
	}
}
