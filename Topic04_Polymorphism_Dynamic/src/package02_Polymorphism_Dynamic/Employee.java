package package02_Polymorphism_Dynamic;

class Hiring{
	
	public boolean hireExternal(){
		System.out.println("hireExternal");
		return true;
	}
	
	public boolean salaryProcessing(){
		System.out.println("salaryProcessing");
		return true;
	}
}

class CompanyA_ExternalHiring extends Hiring{

	public int openPosition  = 0;
	public String title      = "";
	public String role       = "";
	public int grade         = 0;
	public int salary        = 0;
	
	public CompanyA_ExternalHiring(){
		openPosition = 5;
		title        = "Sr. Java Developer";
		role         = "Web application development";
		grade        = 9;
	}

	@Override
	public boolean hireExternal(){
		System.out.println("Title         : " + title);
		System.out.println("Open position : " + openPosition);
		System.out.println("Role          : " + role);
		return true;
	}

	@Override
	public boolean salaryProcessing(){
		salary = grade * 100000;
		System.out.println("Salary        : " + salary);
		return true;
	}
}

public class Employee {

	public static void main(String[] args) {
		CompanyA_ExternalHiring eh = new CompanyA_ExternalHiring();
		eh.hireExternal();
		eh.salaryProcessing();

		System.out.println("Inside Employee hiring example");
	}
}

