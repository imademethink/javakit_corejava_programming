package package01_Object;

class FinalMethod {
	public void nonFinalMethodSmiling(){
		System.out.println("nonFinalMethodSmiling() method");
	}
	// final method can not be cannot be overridden by subclasses
	public final void finalMethodHandWriting(){
		System.out.println("finalMethodHandWriting() method");
	}
}

public class Object04_FinalMethod extends FinalMethod{

//	@Override
//	public final void finalMethodHandWriting(){
//		System.out.println("finalMethodHandWriting() method overridden");
//	}
	
	@Override
	public final void nonFinalMethodSmiling(){
		System.out.println("nonFinalMethodSmiling() method overridden");
	}

	public static void main(String[] args) {
		FinalMethod obj = new Object04_FinalMethod();
		obj.finalMethodHandWriting();
		obj.nonFinalMethodSmiling();		
	}
}
