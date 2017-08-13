package package01_Object;

class StaticNonStaticVariable {
	// static variables
	static int staticInt              = 100;
	static String staticString   = "Paris";
	
	// non static variables
	int nonStaticInt                 = 5;
	String nonStaticString       = "London";
}















public class Object01_StaticVariable {

	public static void main(String[] args) {

		// access static variables using Classname.variableName
		System.out.println("Static variable - " + StaticNonStaticVariable.staticInt);
		System.out.println("Static variable - " + StaticNonStaticVariable.staticString + "\n");

		// access non static variables using ObjectOfClass.variableName
		StaticNonStaticVariable obj = new StaticNonStaticVariable();
		System.out.println("Non static variable before - " + obj.nonStaticInt);
		System.out.println("Non static variable before - " + obj.nonStaticString + "\n");
		obj.nonStaticInt    = 51;
		obj.nonStaticString = "London Bridge";
		System.out.println("Non static variable after - " + obj.nonStaticInt);
		System.out.println("Non static variable after - " + obj.nonStaticString);
		
	}
}
