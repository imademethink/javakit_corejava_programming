package package01_Polymorphism_Dynamic;

class Base1{
	public void commonMethod(){
		
	}
	
	public void commonMethodInt(int a){
		System.out.println("only single int argument");
	}
}

class Derived1 extends Base1{
	// simple method over riding
	// over ridden signature should remain same
	@Override
	public void commonMethod(){
		System.out.println("empty argument list");
	}
	@Override
	public void commonMethodInt(int n){
		System.out.println("n = " + n);
	}
}

public class General1{
	public static void main(String[] args) {
		Derived1 d1 = new Derived1();
		d1.commonMethod();
		d1.commonMethodInt(88);

		System.out.println("Inside General1 class");
	}
}
