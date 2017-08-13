package package01_Object;

class FinalVariableNonPrimitiveType {
	// final variables non primitive type
	int nonPrimitiveTypeInt              = 200;
	String nonPrimitiveTypeString   = "Tokyo";
}

public class Object03_FinalVariable {

	public static void main(String[] args) {

		// access final variables of non-primitive type
		final FinalVariableNonPrimitiveType obj = new FinalVariableNonPrimitiveType();
		System.out.println("Non primitive type final variable before - " + obj.nonPrimitiveTypeInt);
		System.out.println("Non primitive type final variable before - " + obj.nonPrimitiveTypeString);
		obj.nonPrimitiveTypeInt      = 150;                       // works
		obj.nonPrimitiveTypeString = "London Bridge"; // works
		System.out.println("Non primitive type final variable after  - " + obj.nonPrimitiveTypeInt);
		System.out.println("Non primitive type final variable after  - " + obj.nonPrimitiveTypeString);

		
		
		
		// final variables of primitive type
		final int finalPrimitiveTypeInt;
		finalPrimitiveTypeInt      = 5;   // can be initialized only once
		final String finalPrimitiveTypeString = "London";

		// access final variables of primitive type
		System.out.println("Primitive type final variable - " + finalPrimitiveTypeInt);
		System.out.println("Primitive type final variable - " + finalPrimitiveTypeString + "\n");
		// value of the variable can NOT be changed, compilation error is shown
//		finalPrimitiveTypeInt    = 6;
//		finalPrimitiveTypeString = "London Bridge";		
	}
}
