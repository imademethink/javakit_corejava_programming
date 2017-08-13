package package02_FactoryPattern;

interface JobPost {
	abstract void showJobDetails(String  title, String  skillsRequired, float  salaryOffered);
	abstract void howToApply(String recruiterEmailId);
}

class JobPost_InternalForum implements JobPost{
    String  title;
    String  skillsRequired;
	float  salaryOffered;
	float internalReferralRewardAmount = 68000.0f;

	@Override
	public void showJobDetails(String  title2, String  skills_Required, float  salary_Offered){
		title=  title2; skillsRequired=  skills_Required; salaryOffered =  salary_Offered;
		System.out.println("Showing job post with following details : " + title + " " + skillsRequired + " " + salaryOffered);
		System.out.println("Showing job post with following details internal referral reward : " + internalReferralRewardAmount);
	}	
	@Override
	public void howToApply(String recruiterEmailId){
		System.out.println("Send resume to following email id mentioning all job title : " + recruiterEmailId);
	}
}

class JobPost_ExternalForum implements JobPost{
    String  title;
    String  skillsRequired;
	float  salaryOffered;
	String expiryDate = "30 days from job posting date";

	@Override
	public void showJobDetails(String  title2, String  skills_Required, float  salary_Offered){
		title=  title2; skillsRequired=  skills_Required; salaryOffered =  salary_Offered;
		System.out.println("Showing job post with following details : " + title + " " + skillsRequired + " " + salaryOffered);
		System.out.println("Showing job post with expiry date : " + expiryDate);
	}	
	@Override
	public void howToApply(String recruiterEmailId){
		System.out.println("Send resume to following email id mentioning all job title : " + recruiterEmailId);
	}
}


class FactoryForJobPost{
	public JobPost getJobPost(String jobPostType){
		if (null == jobPostType) return null;

		switch (jobPostType.toLowerCase()) {
			case "":
				return null;
			case "internal":
				return new JobPost_InternalForum();
			case "external":
				return new JobPost_ExternalForum();
			default:
				return null;
		}
	}
}

public class Example13_FactoryForRecruitmentMngt {

	public static void main(String[] args) {
		FactoryForJobPost factory = new FactoryForJobPost();
		JobPost jp1 = factory.getJobPost("internal");
		jp1.showJobDetails("Automation Architect", "Java, Framework design, Test design & planning", 250000.0f);
		jp1.howToApply("internal.hr@google.com");
		
		JobPost jp2 = factory.getJobPost("external");
		jp2.showJobDetails("Sr. Automation Engr", "Java, Test case writing, Automation implementation", 120000.0f);
		jp2.howToApply("external.hr@google.com");
	}
}
