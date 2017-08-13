package package01_Polymorphism_Dynamic;

class Base5{
	// private method
	@SuppressWarnings("unused")
	private void privateMethod(){
		
	}
	public void generalMethod(String str){
		System.out.println("general method : " + str);
	}
}

class Derived5 extends Base5{
	// private method can not be over ridden
	// but is re-defined below
//	@SuppressWarnings("unused")
//	private void privateMethod(){
//		System.out.println("empty argument list");
//	}
	
	@Override
	public void generalMethod(String strOverride){
		System.out.println("here is over ridden text : " + strOverride);
	}
}

public class General5{
	public static void main(String[] args) {
		Derived5 d5 = new Derived5();
		d5.generalMethod("blah blah blah");
//		d4.privateMethod();

		System.out.println("Inside General5 class");
	}
}
