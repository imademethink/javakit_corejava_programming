package package01_AbstractClass;

// abstract class with unimplemented methods
abstract class Child8{
	public int a;
	public abstract void unimplementedMethod();
}

// chained abstract class with additional unimplemented methods
abstract class Parent8 extends Child8{
	public abstract void additionalUnimplementedMethod();
}

public class GeneralExtend2{

	public static void main(String[] args) {
		
		System.out.println("Inside GeneralExtend2 class");
	}
}
