package package01_AbstractClass;

// abstract class with only implemented method
abstract class Child3{
	public void dance(){
		System.out.println("Child3 dancing");
	}
}

public class General3 extends Child3{

	public static void main(String[] args) {
		General3 g3 = new General3();
		g3.dance();
		System.out.println("Inside General3 class");
	}
}
