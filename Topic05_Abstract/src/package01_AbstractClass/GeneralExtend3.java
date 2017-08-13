package package01_AbstractClass;

// abstract class with unimplemented methods
abstract class Child9{
	public abstract void implementMe();
}

// derived class which implements unimplemented method from base class
// notice abstract word is removed from class and method
// so now derived class can be instantiated
class Parent9 extends Child9{	
	public void implementMe(){
		System.out.println("Ok, here is the implementation.");
	}
	public void createInstance(){
		@SuppressWarnings("unused")
		Parent9 p9Temp = new Parent9();
		System.out.println("Able to create an instance.");
	}
}

public class GeneralExtend3{

	public static void main(String[] args) {
		Parent9 p9 = new Parent9();
		p9.implementMe();
		p9.createInstance();
		System.out.println("Inside GeneralExtend3 class");
	}
}
