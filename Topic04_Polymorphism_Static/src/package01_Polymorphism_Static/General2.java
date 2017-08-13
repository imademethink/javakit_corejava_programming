package package01_Polymorphism_Static;

public class General2{

	// example of two methods with same signature but return type is different
	public void commonMethod(int a){
		System.out.println("return type is void");
		return;
	}

	// example of two methods with same signature but return type is different
	// compilation error
//	public boolean commonMethod(int a){
//	System.out.println("return type is boolean");
//		return true;
//	}

	public static void main(String[] args) {
		System.out.println("Inside General2 class");
	}
}
