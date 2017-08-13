package package01_Polymorphism_Dynamic;

class Base8{
	public void generalMethod (String str){
		System.out.println("base class general method : " + str);
	}
}

class Derived8 extends Base8{

//  compile time error if over ridden method throws any checked exception	
//	@Override
//	public void generalMethod (String str) throws Exception{
//		// calling base class method which is over ridden
//		super.generalMethod(str);
//		System.out.println("derived class general method : " + str);
//	}

//  no error if over ridden method throws any un-checked exception	
	@Override
	public void generalMethod (String str) throws NullPointerException{
		// calling base class method which is over ridden
		super.generalMethod(str);
		System.out.println("derived class general method : " + str);
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

public class General8{
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Derived8 d8 = new Derived8();

		System.out.println("Inside General8 class");
	}
}
