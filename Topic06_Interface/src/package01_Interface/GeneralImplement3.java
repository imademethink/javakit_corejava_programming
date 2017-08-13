package package01_Interface;

// interface with unimplemented methods
interface Child9{
	public void implementMe();
}

// derived class which implements - unimplemented method from base class
// notice interface word is removed from class
// so now derived class can be instantiated
class Parent9 implements Child9{
	@Override
	public void implementMe(){
		System.out.println("Ok, here is the implementation.");
	}
}

public class GeneralImplement3{

	public static void main(String[] args) {
		Parent9 p9 = new Parent9();
		p9.implementMe();
		System.out.println("Inside GeneralExtend3 class");
	}
}
