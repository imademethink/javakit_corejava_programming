package package03_BuilderPattern;

class EmployeeManagement{
	String firstName;
	String lastName;
	String currentAddress;
	float currentSalary;
	float pendingLeaveCount;
	int bankAccountNumber;
	String designation;
	int appraisalRating;
	String reportingManagerName;
	String workLocation;
	String employmentType;
	
	public EmployeeManagement(String firstName,String lastName,
			                           String currentAddress,float currentSalary,
			                           float pendingLeaveCount, int bankAccountNumber,
			                           String designation, int appraisalRating,
			                           String reportingManagerName, String workLocation,
			                           String employmentType){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentAddress = currentAddress;
		this.currentSalary = currentSalary;
		this.pendingLeaveCount = pendingLeaveCount;
		this.bankAccountNumber = bankAccountNumber;
		this.designation = designation;
		this.appraisalRating = appraisalRating;
		this.reportingManagerName = reportingManagerName;
		this.workLocation = workLocation;
		this.employmentType = employmentType;
	}
	
	@Override
	public String toString() {
		return "GeneralParams [firstName=" + firstName 
				+ ", lastName=" + lastName 
				+ ", currentAddress=" + currentAddress 
				+ ", currentSalary=" + currentSalary 
				+ ", pendingLeaveCount=" + pendingLeaveCount 
				+ ", bankAccountNumber=" + bankAccountNumber 
				+ ", designation=" + designation
				+ ", appraisalRating=" + appraisalRating
				+ ", reportingManagerName=" + reportingManagerName
				+ ", workLocation=" + workLocation
				+ ", employmentType=" + employmentType
				+ "]";
	}
	
}

class EmployeeManagementBuilder{
	String firstName;
	String lastName;
	String currentAddress;
	float currentSalary;
	float pendingLeaveCount;
	int bankAccountNumber;
	String designation;
	int appraisalRating;
	String reportingManagerName;
	String workLocation;
	String employmentType;	
		
	public EmployeeManagementBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public EmployeeManagementBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public EmployeeManagementBuilder setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
		return this;
	}
	public EmployeeManagementBuilder setCurrentSalary(float currentSalary) {
		this.currentSalary = currentSalary;
		return this;
	}
	public EmployeeManagementBuilder setPendingLeaveCount(float pendingLeaveCount) {
		this.pendingLeaveCount = pendingLeaveCount;
		return this;
	}
	public EmployeeManagementBuilder setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
		return this;
	}
	public EmployeeManagementBuilder setDesignation(String designation) {
		this.designation = designation;
		return this;
	}
	public EmployeeManagementBuilder setAppraisalRating(int appraisalRating) {
		this.appraisalRating = appraisalRating;
		return this;
	}
	public EmployeeManagementBuilder setReportingManagerName(String reportingManagerName) {
		this.reportingManagerName = reportingManagerName;
		return this;
	}
	public EmployeeManagementBuilder setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
		return this;
	}
	public EmployeeManagementBuilder setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
		return this;
	}

	public EmployeeManagement buildEmployeeManagementBuilder(){
		if(! validateMandatoryParam()) return null;
		return new EmployeeManagement(firstName,lastName,
													currentAddress,currentSalary,
							                        pendingLeaveCount, bankAccountNumber,
							                        designation, appraisalRating,
							                        reportingManagerName, workLocation,
							                        employmentType);
	}
	private boolean validateMandatoryParam(){
		// firstName and lastName should not be empty
		if (  firstName.isEmpty() ||   lastName.isEmpty()   ) return false;
		return true;
	}
}


public class Example11_EmpMngt {

	public static void main(String[] args) {
		EmployeeManagement em = new EmployeeManagementBuilder()
				.setAppraisalRating(5)
				.setBankAccountNumber(4011111)
				.setCurrentAddress("10880 Malibu CA")
				.setDesignation("Principle Architect")
				.setEmploymentType("Permenant")
				.setFirstName("Tony")
				.setLastName("Stark")
				.setPendingLeaveCount(10.5f)
				.setReportingManagerName("Edwin Jarvis")
				.setWorkLocation("Berlin")
				.buildEmployeeManagementBuilder();
        System.out.println(em);
        
		EmployeeManagement em2 = new EmployeeManagementBuilder()
//				.setAppraisalRating(5)                                        // optional
				.setBankAccountNumber(4011111)
//				.setCurrentAddress("10 Downing Street")       // optional
//				.setDesignation("Principle Architect")              // optional
//				.setEmploymentType("Permenant")                 // optional
				.setFirstName("Kate")
				.setLastName("Winslate")
//				.setPendingLeaveCount(10.5f)                           // optional
//				.setReportingManagerName("Don Basco")       // optional
				.setWorkLocation("London")                              // optional
				.buildEmployeeManagementBuilder();
        System.out.println(em2);
	}
}
