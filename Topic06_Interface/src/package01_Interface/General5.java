package package01_Interface;

// interface with abstract method
interface Child51{
	public void talk1();
}

// interface extends another interface
interface Child52 extends Child51{
	public void talk2();
}

// class implements multilevel interface
public class General5 implements Child52{

	@Override
	public void talk1() {
		System.out.println("talk in English");
	}
	@Override
	public void talk2() {
		System.out.println("talk in Spanish");
	}
	public static void main(String[] args) {
		General5 g2 = new General5();
		g2.talk1();
		g2.talk1();
		System.out.println("Inside General5 class : multilevel interface");
	}
}
