package package01_ObjectClass;

class Pupil implements Cloneable{
	 int id;  
	 String name;  
	 String department;

	 Pupil(int id, String name, String department){  
		 this.id=id;  
		 this.name=name;  
		 this.department=department;  
	 }
	 
	 @Override
	 public boolean equals(Object other) {
	     if (other instanceof Pupil) {
		     Pupil that = (Pupil) other;

		     // individual equality check here.
		     return (this.id == that.id)
		         && (this.name.equals(that.name))
		         && (this.department.equals(that.department));
	     }else{
	         return false;
	     }
	 }
	 @Override
	 public int hashCode() {
//	     int hashCode = 1;
//
//	     hashCode = hashCode * 37 + this.name.hashCode();
//	     hashCode = hashCode * 37 + this.department.hashCode();
//	     return hashCode;
		 return 0;
	 }
	 
	 // implement clone() following method
	 @Override
     public Object clone() {
        try {
            return (Pupil) super.clone();
        }
        catch (CloneNotSupportedException e) {
        	System.out.println("Cloing failed");
        }
		return null;
     }	
}


public class Class02_ObjectClassMethods {

	public static void main(String[] args) {

		// equals() method demo
		Pupil p1=new Pupil(45,"Jack","Sales");
		Pupil p2=new Pupil(95,"Suzy","Marketing");
		Pupil p3=new Pupil(45,"Jack","Sales");

		System.out.println("Comparing object p1 with p3 - " + p1.equals(p3));
		System.out.println("Comparing object p2 with p3 - " + p2.equals(p3));
		
		// clone() method demo
		Pupil p4 = (Pupil) p3.clone();
		System.out.println("Comparing object p4 with p3 - " + p4.equals(p3));
		
	}

}
