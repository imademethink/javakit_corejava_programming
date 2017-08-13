package package01_Polymorphism_Static;

public class General5{

	// an overloaded method calling another overloaded method
	public void tryInterchange(String str){
		System.out.println("tryInterchange - " + str);
	}
	public void tryInterchange(String str1,String str2){
		System.out.println("calling overloaded tryInterchange method");
		tryInterchange(str2);
	}

	public static void main(String[] args) {
		General5 g5 = new General5();
		g5.tryInterchange("single","double");
		System.out.println("Inside General5 class");
	}
}
