package package02_AbstractClass;

abstract class Hiring{
	public int openPosition  = 0;
	public String title      = "";
	public String role       = "";
	public int grade         = 0;
	public int salary        = 0;

	public Hiring(){
		openPosition = 5;
		title        = "Sr. Java Developer";
		role         = "Web application development";
		grade        = 9;
	}
	
	public boolean hireExternal(){
		System.out.println("Title         : " + title);
		System.out.println("Open position : " + openPosition);
		System.out.println("Role          : " + role);
		return true;
	}

	public abstract boolean salaryProcessing();
}

class ExternalHiring extends Hiring{
	@Override
	public boolean salaryProcessing(){
		salary = grade * 100000;
		System.out.println("Salary        : " + salary);
		return true;
	}
}

public class Employee {

	public static void main(String[] args) {
		ExternalHiring eh = new ExternalHiring();
		eh.hireExternal();
		eh.salaryProcessing();
	}
}

