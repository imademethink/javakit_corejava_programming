package package01_Polymorphism_Dynamic;

// If the parent class method declares an exception, 
// derived class overridden method can declare 
//  ==== same (checked/ unchecked) exception

class Base91{
	public void generalMethodUncheckedException (String str) throws NullPointerException{
		System.out.println("base class general method : " + str);
	}
	public void generalMethodCheckedException (String str) throws Exception{
		System.out.println("base class general method : " + str);
	}
}

class Derived91 extends Base91{

	@Override
	public void generalMethodUncheckedException (String str) throws NullPointerException{
		System.out.println("derived class generalMethodUncheckedException method : " + str);
	}

	@Override
	public void generalMethodCheckedException (String str) throws Exception{
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

public class General91{
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Derived91 d91 = new Derived91();

		System.out.println("Inside General91 class");
	}
}
