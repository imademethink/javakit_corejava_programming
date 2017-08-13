package package01_Polymorphism_Dynamic;

class Base2{
	public void tryMe(String str1,String str2) throws NullPointerException{
		if(null == str1) throw new NullPointerException(); 
		System.out.println("tryMe - " + str1);
	}
}

//throwing exception can be removed or low hierarchy in exception
class Derived2 extends Base2{
	@Override
	public void tryMe(String str1,String str2){
		System.out.println("tryMe - " + str1);
		System.out.println("tryMe - " + str2);
	}
}

public class General2{
	
	public static void main(String[] args) {
		Derived2 d2 = new Derived2();
		d2.tryMe(null,"null string");

		System.out.println("Inside General2 class");
	}
}
