package package02_FactoryPattern;

interface Employment {
	abstract void createEmployee(int  emp_Id, String  name2, float  salary2);
	abstract void processSalary(float moneyAmount);
}

class Employment_Permenant implements Employment{
	int        empId;
	String   name;
	float     salary;

	@Override
	public void createEmployee(int  emp_Id, String  name2, float  salary2){
		empId=  emp_Id; name=  name2; salary =  salary2;
		System.out.println("Initialized account with following details : " + empId + " " + name + " " + salary);
	}
	@Override
	public void processSalary(float moneyAmount){
		float transpostAllowance = 200.0f;
		float govtPention              = 150.0f;
		salary = moneyAmount;
		salary += transpostAllowance + govtPention;
		System.out.println("Salary processed for permenant employee : " + salary);
	}
}

class Employment_Contract implements Employment{
	int        empId;
	String   name;
	float     salary;

	@Override
	public void createEmployee(int  emp_Id, String  name2, float  salary2){
		empId=  emp_Id; name=  name2; salary =  salary2;
		System.out.println("Initialized account with following details : " + empId + " " + name + " " + salary);
	}
	@Override
	public void processSalary(float moneyAmount){
		float taxableAmount         = 300.0f;
		salary = moneyAmount;
		salary -= taxableAmount;
		System.out.println("Salary processed for contract employee : " + salary);
	}
}

class FactoryForEmpMngt{
	public Employment getEmployment(String employmentType){
		if (null == employmentType) return null;
		
		switch (employmentType.toLowerCase()) {
			case "":
				return null;
			case "permenant":
				return new Employment_Permenant();
			case "contract":
				return new Employment_Contract();
			default:
				return null;
		}
	}
}

public class Example11_FactoryForEmpMngt {

	public static void main(String[] args) {
		FactoryForEmpMngt factory = new FactoryForEmpMngt();
		Employment e1 = factory.getEmployment("permenant");
		e1.createEmployee(100,"Mohammad Ali", 0.0f);
		e1.processSalary(555555.0f);
		
		Employment e2 = factory.getEmployment("contract");
		e2.createEmployee(900,"Steve Martin", 0.0f);
		e2.processSalary(22222.0f);
	}
}
