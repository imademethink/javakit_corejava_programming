package package01_Polymorphism_Dynamic;

class Base3{
	// final method
	public final void finalMethod(){
		
	}
	public void generalMethod(String str){
		System.out.println("general method : " + str);
	}
}

class Derived3 extends Base3{
	// final method can not be over ridden
	// compilation error
//	@Override
//	public final void finalMethod(){
//		System.out.println("empty argument list");
//	}
	@Override
	public void generalMethod(String strOverride){
		System.out.println("here is over ridden text : " + strOverride);
	}
}

public class General3{
	public static void main(String[] args) {
		Derived3 d3 = new Derived3();
//		d3.finalMethod();
		d3.generalMethod("blah blah blah");

		System.out.println("Inside General3 class");
	}
}
