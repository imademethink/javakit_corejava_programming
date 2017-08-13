package package02_Object;

public class Employee {

	String strFirstName  = "Steve";
	String strLastName   = "Jobs";
	String strGrade      = null;
	void addEmployee(){
		System.out.println("addEmployee() method invoked");
		System.out.println("Given Name   - " + strFirstName);
		System.out.println("Last Name    - " + strLastName);
		System.out.println("Grade        - " + strGrade);
	}
	
	public static void main(String[] args) {
		Employee objBankAccount 		    = new Employee();
		objBankAccount.strGrade  = "CEO";
		System.out.println("setting grade to " + objBankAccount.strGrade);

		objBankAccount.addEmployee();
	}

}
