package package01_Object;

class FinalVariableNonPrimitiveType {
	int nonPrimitiveTypeInt              = 200;
	String nonPrimitiveTypeString   = "Tokyo";
}

public class Object03_FinalVariable {

	public static void main(String[] args) {
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
		
		
		
		
		
		
		

		// access final variables of non-primitive type from another class
		final FinalVariableNonPrimitiveType obj = new FinalVariableNonPrimitiveType();
		obj.nonPrimitiveTypeInt      = 150;                       
		obj.nonPrimitiveTypeString = "London Bridge"; 
		System.out.println("Non primitive type final variable before - " + obj.nonPrimitiveTypeInt);
		System.out.println("Non primitive type final variable before - " + obj.nonPrimitiveTypeString);
	}
}
