package package04_AdapterPattern.Example00;

public class Example00_EmployeeMngt {

	public static void main(String[] args) {
		EmployeeOld employeeOld = new EmployeeOld();
		employeeOld.setName("Tom Hanks");
		employeeOld.setAge("55");
		employeeOld.setAddress("ABC Street,30,22222,LA");
		
		Employee employee = new Employee__Adapter(employeeOld);		
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getAddress());
	}
}
