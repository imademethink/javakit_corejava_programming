package package01_Polymorphism_Static;

public class General1{

	// simple method overloading
	public void commonMethod(){
		System.out.println("empty argument list");
	}
	public void commonMethod(int a){
		System.out.println("only single int argument");
	}
	public void commonMethod(String s, int b){
		System.out.println("two arguments with following sequence String and int");
	}
	public void commonMethod(int b, String s){
		System.out.println("two arguments with following sequence int and String");
	}
	public final void commonMethod(float f){
		System.out.println("final method with single float argument");
	}
	public static void commonMethod(boolean g){
		System.out.println("static method with single boolean argument");
	}

	public static void main(String[] args) {
		General1 g1 = new General1();
		g1.commonMethod();
		g1.commonMethod(20);
		g1.commonMethod("Kitkat", 30);
		g1.commonMethod(40, "Kitkat");
		g1.commonMethod(0.0f);
		General1.commonMethod(true);
		
		System.out.println("Inside General1 class");
	}
}
