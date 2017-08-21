package package01_ObjectClass;

class Student{  
	 int id;  
	 String name;  
	 int marks;  

	public Student() {
		// empty constructor
	}
	
	Student(int id, String name, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
}

class Employee{  
	 int id;  
	 String name;  
	 String department;

	 Employee(int id, String name, String department){  
		 this.id=id;  
		 this.name=name;  
		 this.department=department;  
	 }
	 
	 @Override
	 public String toString(){ 
		  return id + " " + name + " " + department;  
	 }
}

public class Class01_ObjectClassMethods{

	public static void main(String[] args) {

		// toString() method demo
		System.out.println("toString() method info:");
		Student  s1=new Student(100,"Micky",98);
		System.out.println("Class without overriding toString() method: \n  " + s1.toString());
		Employee e1=new Employee(45,"Jack","Sales");
		System.out.println("Class with overriding toString() method: \n  " + e1.toString());
		
		// getClass() method demo
		System.out.println("\n\ngetClass() method info:");
		Student objStudent = new Student();
		System.out.println("getClass().getName() method output: \n  " + objStudent.getClass().getName());
		System.out.println("getClass().getSimpleName() method output: \n  " + objStudent.getClass().getSimpleName());
		System.out.println("getClass().getCanonicalName() method output: \n  " + objStudent.getClass().getCanonicalName());
	}

}
