package package04_AdapterPattern.Example00;

public class Employee__Adapter extends EmployeeNew implements Employee{
	private EmployeeOld employeeOld;
	
	public Employee__Adapter(EmployeeOld employeeOld2) {
		this.employeeOld = employeeOld2;
		this.adapterData();
	}

	private void adapterData(){
		this.setName(employeeOld.getName());
		this.setAge(Integer.valueOf(employeeOld.getAge()));
		Address address = new Address();
		String[] oldAddress = employeeOld.getAddress().split(",");
		
		address.setStreeName(oldAddress[0]);
		address.setHouseNumber(Integer.valueOf(oldAddress[1]));
		address.setPostcode(Integer.valueOf(oldAddress[2]));
		address.setCity(oldAddress[3]);
		this.setAddress(address);		
	}
}
