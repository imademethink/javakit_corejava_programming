package package01_Inheritance;

public class Parent extends GrandParent{

	public Parent(){
		super();
		System.out.println("Constructor called from Parent class.");
	}
	
	public void methodFromParent(){
		System.out.println("methodFromParent");
	}

}
