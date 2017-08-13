package package06_StratergyPattern;

interface EmployeeService {
	   public void addEmployee(int empId, String empName);
}
class AddPermenantEmployee implements EmployeeService{
	   @Override
	   public void addEmployee(int empId, String empName) {
	      System.out.println("Adding following permenant employee:  " + empId +" " + empName);
	   }
}
class AddContractEmployee implements EmployeeService{
	   @Override
	   public void addEmployee(int empId, String empName) {
	      System.out.println("Adding following contract employee:  " + empId + " " + empName);;
	   }
}

class Context {
	   private EmployeeService employeeServiceStratergy;
	   public Context(EmployeeService employeeServiceStratergy){
	      this.employeeServiceStratergy = employeeServiceStratergy;
	   }
	   public void executeStrategy(int empId, String empName){
	       employeeServiceStratergy.addEmployee(empId, empName);
	   }
}

public class Example10_EmployeeMngt {

	public static void main(String[] args) {
		Context empContext1 = new Context(new AddPermenantEmployee());
		System.out.println("Using stratergy for permenant employee");
	    empContext1.executeStrategy(200, "Kate Winslate");

		Context empContext2 = new Context(new AddContractEmployee());
		System.out.println("Using stratergy for contract employee");
	    empContext2.executeStrategy(901, "Juma Simba");
	}

}
