package package01_SingletonPattern;

class EmployeeData {
	 private static EmployeeData employeeData = null;
	 private EmployeeData(){}
	 
	 static int        empId;
	 static String   name;
	 float               salary;

	 public boolean initAccount(
			    int      emp_Id, 
	    		String name2, 
	    		float   salary2){
	    			if (employeeData==null)  { return false;}
	    			empId       = emp_Id;
	    			name        = name2; 
	    			salary        =  salary2;
	    			System.out.println("Initialized account with following details : " + emp_Id + " " + name + " " + salary);
	    			return true;
	 }

	 public boolean grossSalary(float moneyAmount){
	     if (employeeData==null)  { return false;}
	     salary += moneyAmount;
		 System.out.println("Gross salary :             " + moneyAmount);
		 return true;
	 }
	 public boolean taxDeduction(float taxPercent){
	     if (employeeData==null)  { return false;}
	     salary = salary - (salary * taxPercent / 100 );
		 System.out.println("Tax deduction percentage : " + taxPercent);
		 return true;
	 }
     public boolean finalSalary(){
	     if (employeeData==null)  { return false;}
         System.out.println("Final salary is :           " + salary);
		 return true;
	 }    
	 
	// Only one thread can execute this at a time
    public static synchronized EmployeeData getInstance(){
        if (employeeData==null)  {employeeData = new EmployeeData();}
        return employeeData;
    }
}

public class Example11_EmployeeMngt {

	public static void main(String[] args) {
		EmployeeData basic1 = EmployeeData.getInstance();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		basic1.initAccount(200,"James Bond", 0.0f);
		basic1.grossSalary(50000.0f);
		basic1.taxDeduction(25.0f);
		basic1.finalSalary();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		EmployeeData basic2 = EmployeeData.getInstance();
		System.out.println("Created instance basic2 , it's hashCode : " + basic2.hashCode());
		EmployeeData basic3 = EmployeeData.getInstance();
		System.out.println("Created instance basic3 , it's hashCode : " + basic3.hashCode());		
	}
}
