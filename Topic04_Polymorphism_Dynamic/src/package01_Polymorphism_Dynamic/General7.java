package package01_Polymorphism_Dynamic;

class Base7{
	public void generalMethod(String str){
		System.out.println("general method : " + str);
	}
}

class Derived7 extends Base7{

	@Override
	public void generalMethod(String strOverride){
		System.out.println("simple over ridden text : " + strOverride);
	}
}

// multilevel over riding
class Derived7Again extends Derived7{

	@Override
	public void generalMethod(String strOverride){
		System.out.println("here is double over ridden text : " + strOverride);
	}
}

public class General7{
	public static void main(String[] args) {
		Derived7Again d7Again = new Derived7Again();
		d7Again.generalMethod("blah blah blah");

		System.out.println("Inside General7 class");
	}
}
