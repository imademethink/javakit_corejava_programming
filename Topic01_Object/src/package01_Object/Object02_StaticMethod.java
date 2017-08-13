package package01_Object;

class StaticNonStaticMethod {
	// static variable
	static int staticInt              = 100;
	static String staticString   = "Paris";
	// static method
	static void staticMethod(){
		System.out.println("inside staticMethod()");
	}
	
	// non static variable
	int nonStaticInt             = 5;
	String nonStaticString   = "London";
	// non static method
	void nonStaticMethod(){
		System.out.println("inside nonStaticMethod()");
	}
}







public class Object02_StaticMethod {

	public static void main(String[] args) {

		// access static method using Classname.methodName
		System.out.println("Calling static method - ");
		StaticNonStaticMethod.staticMethod();

		// access non static method using ObjectOfClass.methodName
		System.out.println("Calling non static method - ");
		StaticNonStaticMethod obj = new StaticNonStaticMethod();
		obj.nonStaticMethod();		
	}
}
