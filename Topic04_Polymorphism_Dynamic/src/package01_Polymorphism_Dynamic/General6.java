package package01_Polymorphism_Dynamic;

class Base_61{
	public Base_61(){
		System.out.println("Base_61 constructor");
	}

	public void generalMethod(String str){
		System.out.println("general method : " + str);
	}
}

class Derived61 extends Base_61{

	public Derived61(){
		System.out.println("Derived61 constructor");
	}
	
//	@Override
//	public Base_61(){
//		System.out.println("Base_61 constructor overridden");
//	}

	@Override
	public void generalMethod(String strOverride){
		System.out.println("here is over ridden text : " + strOverride);
	}
}

public class General6{
	public static void main(String[] args) {
		Derived61 d61 = new Derived61();
		d61.generalMethod("blah blah blah");

		System.out.println("Inside General6 class");
	}
}
