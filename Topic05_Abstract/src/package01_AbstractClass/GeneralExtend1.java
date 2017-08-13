package package01_AbstractClass;

// abstract class with unimplemented methods
abstract class Child7{
	public int a;
	public abstract void unimplementedMethod();
}

abstract class Parent7 extends Child7{

}

public class GeneralExtend1{

	public static void main(String[] args) {
		
		System.out.println("Inside GeneralExtend1 class");
	}
}
