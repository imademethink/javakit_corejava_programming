package package02_InheritanceMultilevel;

class Attendence{
	float paidDays = 0.0f;
}

class SalaryProcessing extends Attendence{
	int basicPayPerDay    = 0;
	int variablePayPerDay = 0;
	int fixedAllowance    = 0;
	float taxRate         = 0.0f;
}

public class Employee {
	public static void main(String[] args) {
		SalaryProcessing sal = new SalaryProcessing();
		sal.paidDays          = 15.5f;
		sal.basicPayPerDay    = 1000;
		sal.variablePayPerDay = 800;
		sal.fixedAllowance    = 800;
		sal.taxRate           = 20.0f;
		float paybleSalary = 
				(sal.paidDays * sal.basicPayPerDay) +
				(sal.paidDays * sal.variablePayPerDay) +
				(sal.fixedAllowance);
		paybleSalary = paybleSalary - (paybleSalary * sal.taxRate/ 100);
		System.out.println("Final salary = " + paybleSalary);

		System.out.println("Inheritance for Employee management type");
	}
}
