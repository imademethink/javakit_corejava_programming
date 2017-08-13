package package01_Inheritance;

class Base{

	int generalIntVar                    = 10;
	static int staticGeneralIntVar       = 20;
	final int finalGeneralIntVar         = 30;
	protected int protectedIntVar        = 40;
	@SuppressWarnings("unused")
	private int privateIntVar            = 50;

	public Base(){System.out.println("Base class constructor called.");}

	void defaultMethod(){System.out.println("defaultMethod()");}

	public void publicMethod(){System.out.println("generalMethod()");}
	
	public static void staticMethod(){System.out.println("staticMethod()");}
	
	public final void finalMethod(){System.out.println("finalMethod()");}

	protected void protectedMethod(){System.out.println("protectedMethod()");}

	@SuppressWarnings("unused")
	private void privateMethod(){System.out.println("privateMethod()");}

}

public class Derived extends Base{
	
	public Derived(){
		super();
		System.out.println("Derived class constructor called.");
	}	

	public static void main(String[] args) {
		Derived obj = new Derived();
		
		System.out.println(obj.generalIntVar);
//		System.out.println(obj.staticGeneralIntVar);
		System.out.println(Base.staticGeneralIntVar);
		System.out.println(obj.finalGeneralIntVar);
		System.out.println(obj.protectedIntVar);
//		System.out.println(obj.privateIntVar);
		
		// method with type default
		obj.defaultMethod();

		// method with type public
		obj.publicMethod();
		
		// method with type static
//		obj.staticMethod();
		Derived.staticMethod();
		
		// method with type final
		obj.finalMethod();

		// method with type protected
		obj.protectedMethod();

		// method with type private
//		obj.privateMethod();
	}

}
