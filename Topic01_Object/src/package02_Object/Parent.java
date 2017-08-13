package package02_Object;

public class Parent {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// Object creation using new() keyword
		Parent objP1 = new Parent();
		System.out.println("objP1 - " + objP1.hashCode());

		// Object creation using forName() method
		try {
			Class objP2 = Class.forName("package01_Object.Parent");
			System.out.println("objP2 - " + objP2.hashCode());
		} catch (ClassNotFoundException e) {}

		// Object creation using getClass() method
		Class objP3 = objP1.getClass();
		System.out.println("objP3 - " + objP3.hashCode());
	}
}
