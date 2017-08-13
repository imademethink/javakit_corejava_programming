package package01_Polymorphism_Dynamic;

// If the parent class method declares an exception, 
// derived class overridden method can not declare 
//  ==== higher class same (checked/ unchecked) exception

class Base93{
	public void generalMethodUncheckedException (String str) throws ArithmeticException {
		System.out.println("base class general method : " + str);
	}
	public void generalMethodCheckedException (String str) throws NoSuchMethodException{
		System.out.println("base class general method : " + str);
	}
}

class Derived93 extends Base93{

//	@Override
//	public void generalMethodUncheckedException (String str) throws Exception{
//		System.out.println("derived class generalMethodUncheckedException method : " + str);
//	}
//
//	@Override
//	public void generalMethodCheckedException (String str) throws Exception{
//		System.out.println("derived class generalMethodCheckedException method : " + str);
//	}
	
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

public class General93{
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Derived93 d93 = new Derived93();

		System.out.println("Inside General93 class");
	}
}
