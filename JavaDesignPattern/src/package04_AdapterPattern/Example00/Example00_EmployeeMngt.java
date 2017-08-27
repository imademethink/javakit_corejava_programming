package package04_AdapterPattern.Example00;

public class Example00_EmployeeMngt {

	public static void main(String[] args) {
		EmployeeOld employeeOld = new EmployeeOld();
		employeeOld.setName("Tom Hanks");
		employeeOld.setAge("55");
		employeeOld.setAddress("ABC Street,30,22222,LA");
		System.out.println(employeeOld.getName());
		System.out.println(employeeOld.getAge());
		System.out.println(employeeOld.getAddress() + "\n");

		EmployeeNew employeeNew = new EmployeeNew();
		employeeNew.setName("Don Joe");
		employeeNew.setAge(22);
		employeeNew.setAddress(new Address("XYZ Street",40,55555,"NY"));
		System.out.println(employeeNew.getName());
		System.out.println(employeeNew.getAge());
		System.out.println(employeeNew.getAddress() + "\n");
		
		Employee employAdapted = new Employee__Adapter(employeeOld);		
		System.out.println(employAdapted.getName());
		System.out.println(employAdapted.getAge());
		System.out.println(employAdapted.getAddress());
	}
}
