package package03_BuilderPattern;

class JobPostDetail{
	String title;
	String skillsRequired;
	String recruiterEmailId;
	String expiryDate;
	float salaryOfferedCTC;
	int noOfPosition;
	String jobLocation;
	String employmentType;
	float joiningBonusAmount;
	
	public JobPostDetail( 	String title, String skillsRequired, String recruiterEmailId,
											String expiryDate, float salaryOfferedCTC, int noOfPosition,
											String jobLocation, String employmentType, float joiningBonusAmount){
		super();
		this.title = title;
		this.skillsRequired = skillsRequired;
		this.recruiterEmailId = recruiterEmailId;
		this.expiryDate = expiryDate;
		this.salaryOfferedCTC = salaryOfferedCTC;
		this.noOfPosition = noOfPosition;
		this.jobLocation = jobLocation;
		this.employmentType = employmentType;
		this.joiningBonusAmount = joiningBonusAmount;
	}
	
	@Override
	public String toString() {
		return "GeneralParams [title=" + title 
				+ ", skillsRequired=" + skillsRequired 
				+ ", recruiterEmailId=" + recruiterEmailId 
				+ ", expiryDate=" + expiryDate 
				+ ", salaryOfferedCTC=" + salaryOfferedCTC 
				+ ", noOfPosition=" + noOfPosition 
				+ ", jobLocation=" + jobLocation
				+ ", employmentType=" + employmentType
				+ ", joiningBonusAmount=" + joiningBonusAmount
				+ "]";
	}
	
}

class JobPostDetailBuilder{
	String title;
	String skillsRequired;
	String recruiterEmailId;
	String expiryDate;
	float salaryOfferedCTC;
	int noOfPosition;
	String jobLocation;
	String employmentType;
	float joiningBonusAmount;
		
	public JobPostDetailBuilder setTitle(String title) {
		this.title = title;
		return this;
	}
	public JobPostDetailBuilder setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
		return this;
	}
	public JobPostDetailBuilder setRecruiterEmailId(String recruiterEmailId) {
		this.recruiterEmailId = recruiterEmailId;
		return this;
	}
	public JobPostDetailBuilder setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}
	public JobPostDetailBuilder setSalaryOfferedCTC(float salaryOfferedCTC) {
		this.salaryOfferedCTC = salaryOfferedCTC;
		return this;
	}
	public JobPostDetailBuilder setNoOfPosition(int noOfPosition) {
		this.noOfPosition = noOfPosition;
		return this;
	}
	public JobPostDetailBuilder setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
		return this;
	}
	public JobPostDetailBuilder setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
		return this;
	}
	public JobPostDetailBuilder setJoiningBonusAmount(float joiningBonusAmount) {
		this.joiningBonusAmount = joiningBonusAmount;
		return this;
	}

	public JobPostDetail buildJobPostDetailBuilder(){
		if(! validateMandatoryParam()) return null;
		return new JobPostDetail(title, skillsRequired, recruiterEmailId, expiryDate,
		                                             salaryOfferedCTC, noOfPosition, jobLocation, employmentType, joiningBonusAmount);
	}
	private boolean validateMandatoryParam(){
		// firstName and lastName should not be empty
		if (  title.isEmpty() ||   (salaryOfferedCTC < 0)   ) return false;
		return true;
	}
}


public class Example13_RecruitmentMngt {

	public static void main(String[] args) {
		JobPostDetail jp = new JobPostDetailBuilder()
				.setEmploymentType("Permenant")
				.setExpiryDate("30days")
				.setJobLocation("New York")
				.setJoiningBonusAmount(100000.0f)
				.setNoOfPosition(2)
				.setRecruiterEmailId("recruitment@teslamotors.com")
				.setSalaryOfferedCTC(2500000.0f)
				.setSkillsRequired("Automation framework design")
				.setTitle("Chief Software Architect")
				.buildJobPostDetailBuilder();
		System.out.println(jp);
        
		JobPostDetail jp2 = new JobPostDetailBuilder()
//				.setEmploymentType("Permenant")                                  // optional
//				.setExpiryDate("30days")                                                    // optional
//				.setJobLocation("New York")                                               // optional
//				.setJoiningBonusAmount(100000.0f)                                 // optional
//				.setNoOfPosition(2)                                                              // optional
//				.setRecruiterEmailId("recruitment@teslamotors.com")   // optional
				.setSalaryOfferedCTC(2500000.0f)
//				.setSkillsRequired("Automation framework design")        // optional
				.setTitle("Chief Designer")
				.buildJobPostDetailBuilder();
		System.out.println(jp2);
	}
}
