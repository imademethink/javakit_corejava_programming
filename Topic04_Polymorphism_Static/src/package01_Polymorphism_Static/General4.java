package package01_Polymorphism_Static;

public class General4{

	// An overloaded method can throw different exceptions 
	// (even if none of the other method throws exception).
	public void tryMe(String str){
		System.out.println("tryMe - " + str);
	}
	public void tryMe(String str1,String str2) throws NullPointerException{
		if(null == str1) throw new NullPointerException(); 
		System.out.println("tryMe - " + str1);
	}
	
	public static void main(String[] args) {
		General4 g4 = new General4();
		g4.tryMe("non null string");
		g4.tryMe(null,"null string");

		System.out.println("Inside General4 class");
	}
}
