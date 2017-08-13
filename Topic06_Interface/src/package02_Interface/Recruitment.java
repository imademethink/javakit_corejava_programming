package package02_Interface;

interface JobPosting{
	public void postJobOpening_InternalReferral();
	public void postJobOpening_Online();
	public void postJobOpening_NewsPaper();
}

class CompanyA implements JobPosting{
	public void postJobOpening_InternalReferral(){
		System.out.println("Job posting internal activity");
		System.out.println("Send email to all employees about job opening with all details");
		System.out.println("Send referral reward amount details\n");
	}
	public void postJobOpening_Online(){
		System.out.println("Job posting online activity");
		System.out.println("Open HR account online on online job portal");
		System.out.println("Post job requirement on online job portal\n");
	}
	public void postJobOpening_NewsPaper(){
		System.out.println("Job posting new paper activity");
		System.out.println("Contact popular news paper agency");
		System.out.println("Send the required print media text details and date of ad publication\n");
	}
}

public class Recruitment {

	public static void main(String[] args) {
		JobPosting jobPostingActivity = new CompanyA();
		jobPostingActivity.postJobOpening_InternalReferral();
		jobPostingActivity.postJobOpening_Online();
		jobPostingActivity.postJobOpening_NewsPaper();
		
		System.out.println("Inside Recruitment process example");
	}
}
