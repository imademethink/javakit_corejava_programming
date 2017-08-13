package package01_Inheritance;

public class Child extends Parent{

	public Child(){
		super();
		System.out.println("Constructor called from Child class.");
	}

	public void methodFromChild(){
		System.out.println("methodFromChild");
	}
	
	public static void main(String[] args) {
		Child c1 = new Child();
		
		c1.methodFromGrandParent();
		c1.methodFromParent();
		c1.methodFromChild();

	}

}
