package package01_Polymorphism_Dynamic;

// If the parent class method declares an exception, 
// derived class overridden method can declare 
//  ==== sub class same (checked/ unchecked) exception

class Base92{
	public void generalMethodUncheckedException (String str) throws RuntimeException {
		System.out.println("base class general method : " + str);
	}
	public void generalMethodCheckedException (String str) throws Exception{
		System.out.println("base class general method : " + str);
	}
}

class Derived92 extends Base92{

	@Override
	public void generalMethodUncheckedException (String str) throws ArithmeticException {
		System.out.println("derived class generalMethodUncheckedException method : " + str);
	}

	@Override
	public void generalMethodCheckedException (String str) throws AssertionError{
		System.out.println("derived class generalMethodCheckedException method : " + str);
	}
	
//	 ====  Checked Exception List ==== 
//	Exception
//	IOException
//	FileNotFoundException
//	ParseException
//	ClassNotFoundException
//	CloneNotSupportedException
//	InstantiationException
//	InterruptedException
//	NoSuchMethodException
//	NoSuchFieldException
	
	
//	 ====  Un-checked Exception List ====
//  RuntimeException
//  ArithmeticException	
//	ArrayIndexOutOfBoundsException
//	ClassCastException
//	IllegalArgumentException
//	IllegalStateException
//	NullPointerException
//	NumberFormatException
//	AssertionError
//	ExceptionInInitializerError
//	StackOverflowError
//	NoClassDefFoundError
}

public class General92{
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Derived92 d92 = new Derived92();

		System.out.println("Inside General92 class");
	}
}
