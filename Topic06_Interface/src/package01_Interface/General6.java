package package01_Interface;

// interface with abstract method
interface Child61{
	public void speak();
}

//interface with abstract method
interface Child62{
	public void play();
}

// class implements multiple interface(s)
public class General6 implements Child61,Child62{

	@Override
	public void speak() {
		System.out.println("speak mama");
	}
	@Override
	public void play() {
		System.out.println("play soccer");
	}
	public static void main(String[] args) {
		General6 g2 = new General6();
		g2.speak();
		g2.play();
		System.out.println("Inside General6 class : multiple interface");
	}
}
