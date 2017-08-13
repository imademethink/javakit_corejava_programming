package package02_Object;

public class Father implements Cloneable{

	// implement clone() following method
	@Override
    public Object clone() {
        try {
            return (Father)super.clone();
        }
        catch (CloneNotSupportedException e) {}
		return null;
    }
    
	public static void main(String[] args) {
		Father objF1 = new Father();
		System.out.println("objF1 - " + objF1.hashCode());

		// Object creation using clone() method 
		Father objF2 = (Father) objF1.clone();
		System.out.println("objF2 - " + objF2.hashCode());
	}

		
}
