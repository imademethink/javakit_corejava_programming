package package01_Polymorphism_Static;

class GrandFather{
	String talkingLanguage = "";
	public GrandFather(){
		talkingLanguage = "English";
		System.out.println("Grand father talks English.");
	}
}

class Father extends GrandFather{
	public Father(){
		talkingLanguage = "Spanish";
		System.out.println("Father talks Spanish.");
	}
}

class Child extends Father{
	public Child(){
		talkingLanguage = "Java";
		System.out.println("Child codes in Java.");
	}
}

public class General_Typecasting{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("\nNormal object");
		Child ch   = new Child();
		System.out.println("\nNormal object");
		Father fh = new Father();
		System.out.println("\nNormal object");
		GrandFather gf = new GrandFather();
		System.out.println("\n\n");

		// derived up-casting example
		// derived class object is assigned to child class object
		System.out.println("\nUp-casting example");
		GrandFather gf2 = new Father();

		// derived up-casting example
		// derived class object is assigned to child class object
		System.out.println("\nUp-casting example");
		Father fh2 = new Child();

		// derived up-casting example
		// derived class object is assigned to child class object
		System.out.println("\nUp-casting example");
		GrandFather gf3 = new Child();

		System.out.println("\n\nInside General typecasting example class");
	}
}
