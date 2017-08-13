package package01_AbstractClass;

// abstract class with all types of methods
abstract class Child6{
    		  void defaultMethod(){System.out.println("defaultMethod()");}
	protected void protectedMethod(){System.out.println("protectedMethod()");}
	public    void publicMethod(){System.out.println("publicMethod()");}
	@SuppressWarnings("unused")
	private   void privateMethod(){System.out.println("privateMethod()");}
	static    void staticMethod(){System.out.println("staticMethod()");}
	final     void finalMethod(){System.out.println("finalMethod()");}
}

public class General6 extends Child6{

	public static void main(String[] args) {
		General6 g6 = new General6();
		
		g6.defaultMethod();
		
		g6.protectedMethod();
		
		g6.publicMethod();
		
//		g6.privateMethod();
		
//		g6.staticMethod();
		General6.staticMethod();
		
		g6.finalMethod();
		
		System.out.println("Inside General6 class");
	}
}
