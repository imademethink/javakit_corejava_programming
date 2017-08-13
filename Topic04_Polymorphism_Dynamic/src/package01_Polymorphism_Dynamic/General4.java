package package01_Polymorphism_Dynamic;

class Base41{
	// static method
	public static void staticMethod(){
		
	}
	public void generalMethod(String str){
		System.out.println("general method : " + str);
	}
}

class Derived4 extends Base41{
	// static method can not be over ridden
	// compilation error
//	@Override
//	public void staticMethod(){
//		System.out.println("empty argument list");
//	}
	
	@Override
	public void generalMethod(String strOverride){
		System.out.println("here is over ridden text : " + strOverride);
	}
}

public class General4{
	public static void main(String[] args) {
		Derived4 d4 = new Derived4();
		d4.generalMethod("blah blah blah");
//		d4.staticMethod();

		System.out.println("Inside General4 class");
	}
}
