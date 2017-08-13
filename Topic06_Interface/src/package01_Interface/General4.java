package package01_Interface;

// interface with all types of methods
interface Child4{
    void defaultMethod();

    default void defaultMethod2(){
    	System.out.println("Java 1.8 onwards, default method is allowed body.");
    }

//  protected methods are not allowed
//  protected void protectedMethod();

	public void publicMethod();

//  private methods are not allowed
//	private   void privateMethod();

	static void staticMethod(){
    	System.out.println("Java 1.8 onwards, static method is allowed body.");
	};
    default void defaultMethod3(){
    	System.out.println("Default method calls static method - ");
    	staticMethod();
    }

//  final methods are not allowed
//	final     void finalMethod();
}

public class General4 implements Child4{

	@Override
	public void defaultMethod() {
		System.out.println("defaultMethod() implemented");
	}

	@Override
	public void publicMethod() {
		System.out.println("publicMethod() implemented");
	}
	
	public static void main(String[] args) {
		General4 g4 = new General4();
		
		g4.defaultMethod();
		
		g4.defaultMethod2();
		
		g4.publicMethod();
		
		System.out.println("Inside General4 class");
	}

}
