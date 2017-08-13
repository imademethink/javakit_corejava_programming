package package01_AbstractClass;

// abstract class with unimplemented methods
// another concrete method can invoke abstract method
abstract class Child10{
	public abstract void unimplementedMethod();
	public void callUmimplementedMethod(){
		unimplementedMethod();
	}
}

// derived (abstract) class can invoke abstract method from parent class
abstract class Parent10 extends Child10{
	public void invokeMe(){
		unimplementedMethod();
		System.out.println("Ok, here is the implementation.");
	}
}

public class GeneralExtend4{
	public static void main(String[] args) {
		System.out.println("Inside GeneralExtend4 class");
	}
}
