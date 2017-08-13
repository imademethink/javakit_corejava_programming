package package02_FactoryPattern;

abstract class SuperClass {
	abstract void addObject(Object obj1, Object obj2);
	abstract void compareObject(Object obj1, Object obj2);

	// concrete method
	String typeOfObject(Object obj){
		switch (obj.getClass().getSimpleName()) {
		case "Integer":
			return "Integer type of object";
		case "Float":
			return "Float type of object";
		case "String":
			return "String type of object";
		default:
			return null;
	   }
	}
}

class DerivedClass_Intger extends SuperClass{
	public void addObject(Object obj1, Object obj2){
	   System.out.println("Integer addition is : " +      ((int) obj1 + (int) obj2)        );
	}
	
	public void compareObject(Object obj1, Object obj2){
		   System.out.println("Integer comparison is : " + ((int) obj1 > (int) obj2)    );
	}
}

class DerivedClass_Float extends SuperClass{
	public void addObject(Object obj1, Object obj2){
	   System.out.println("Float addition is : " + ((float) obj1 + (float) obj2)  );
	}
	
	public void compareObject(Object obj1, Object obj2){
		   System.out.println("Float comparison is : " + ((float) obj1 > (float) obj2));
	}
}

class DerivedClass_String extends SuperClass{
	public void addObject(Object obj1, Object obj2){
	   System.out.println("String addition is : " + ((String) obj1).concat((String) obj2) );
	}
	
	public void compareObject(Object obj1, Object obj2){
		   System.out.println("String comparison is : " + (((String) obj1).length() > ((String) obj2).length()) );
	}
}

class FactoryForOpsSuperClass{
	public SuperClass getIntendedObject(String objectType){
		if (null == objectType) return null;
		
		switch (objectType.toLowerCase()) {
			case "":
				return null;
			case "int":
				return new DerivedClass_Intger();
			case "float":
				return new DerivedClass_Float();
			case "string":
				return new DerivedClass_String();				
			default:
				return null;
		}
	}
}

public class Example02_FactoryForOpsBasicTester {

	public static void main(String[] args) {
		FactoryForOpsSuperClass factory = new FactoryForOpsSuperClass();
		SuperClass s1 = factory.getIntendedObject("int");
		s1.addObject(2,5);
		s1.compareObject(2, 5);
		System.out.println("Type of object is : " +  s1.typeOfObject(2));  // this is not an abstract method
		
		SuperClass s2 = factory.getIntendedObject("float");
		s2.addObject(2.0f,5.0f);
		s2.compareObject(2.0f, 5.0f);
		System.out.println("Type of object is : " +  s2.typeOfObject(2.0f));  // this is not an abstract method
		
		SuperClass s3 = factory.getIntendedObject("string");
		s3.addObject("two","nine");
		s3.compareObject("two","nine");
		System.out.println("Type of object is : " +  s3.typeOfObject("kitkat"));  // this is not an abstract method		
	}
}
