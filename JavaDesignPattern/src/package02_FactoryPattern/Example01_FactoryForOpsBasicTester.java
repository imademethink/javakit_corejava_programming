package package02_FactoryPattern;

interface Base {
	abstract void addObject(Object obj1, Object obj2);
	abstract void compareObject(Object obj1, Object obj2);
}

class DerivedIntgerOps implements Base{
	@Override
	public void addObject(Object obj1, Object obj2){
	   System.out.println("Integer addition is : " +      ((int) obj1 + (int) obj2)        );
	}
	
	@Override
	public void compareObject(Object obj1, Object obj2){
		   System.out.println("Integer comparison is : " + ((int) obj1 > (int) obj2)    );
	}
}

class DerivedFloatOps implements Base{
	@Override
	public void addObject(Object obj1, Object obj2){
	   System.out.println("Float addition is : " + ((float) obj1 + (float) obj2)  );
	}
	
	@Override
	public void compareObject(Object obj1, Object obj2){
		   System.out.println("Float comparison is : " + ((float) obj1 > (float) obj2));
	}
}

class DerivedStringOps implements Base{
	@Override
	public void addObject(Object obj1, Object obj2){
	   System.out.println("String addition is : " + ((String) obj1).concat((String) obj2) );
	}
	
	@Override
	public void compareObject(Object obj1, Object obj2){
		   System.out.println("String comparison is : " + (((String) obj1).length() > ((String) obj2).length()) );
	}
}

class FactoryForOpsBasic{
	public Base getIntendedObject(String objectType){
		if (null == objectType) return null;
		
		switch (objectType.toLowerCase()) {
			case "":
				return null;
			case "int":
				return new DerivedIntgerOps();
			case "float":
				return new DerivedFloatOps();
			case "string":
				return new DerivedStringOps();				
			default:
				return null;
		}
	}
}

public class Example01_FactoryForOpsBasicTester {

	public static void main(String[] args) {
		FactoryForOpsBasic factory = new FactoryForOpsBasic();
		Base b1 = factory.getIntendedObject("int");
		b1.addObject(2,5);
		b1.compareObject(2, 5);
		
		Base b2 = factory.getIntendedObject("float");
		b2.addObject(2.0f,5.0f);
		b2.compareObject(2.0f, 5.0f);
		
		Base b3 = factory.getIntendedObject("string");
		b3.addObject("one ","nine");
		b3.compareObject("one ","nine");
	}
}
