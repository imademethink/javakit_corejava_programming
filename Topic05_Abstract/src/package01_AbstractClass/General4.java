package package01_AbstractClass;

// abstract class with abstract method
abstract class Child4{
	public abstract void talk();
}

public class General4 extends Child4{

	@Override
	public void talk() {
		System.out.println("talk in English");
	}
	public static void main(String[] args) {
		General4 g4 = new General4();
		g4.talk();
		System.out.println("Inside General4 class");
	}
}
