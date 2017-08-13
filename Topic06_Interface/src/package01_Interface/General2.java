package package01_Interface;

// interface with abstract method
// An interface with no data members but only methods is called 
//     Marker Interface
interface Child2{
	public void talk();
}

public class General2 implements Child2{

	@Override
	public void talk() {
		System.out.println("talk in English");
	}
	public static void main(String[] args) {
		General2 g2 = new General2();
		g2.talk();
		System.out.println("Inside General2 class");
	}
}
