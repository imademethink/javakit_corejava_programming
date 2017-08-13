package package02_Polymorphism_Static;

abstract class ResumeMaking{
	public int currentSalary        = 0;
	public int expectedSalary       = 0;
	public String skills            = "";
	public String preferredLocation = "";
	
	public ResumeMaking(){
		currentSalary       = 1500000;
		expectedSalary      = 2000000;
		skills              = "";
		preferredLocation   = "Bengaluru, London, NewYork";
	}

	public boolean searchJob(){
		System.out.println("Searching job through job consultant");
		System.out.println("Searching job through job portal");
		return true;
	}

	public abstract boolean submitToJobPortal(String jobPortalName);
}

class JobPortal extends ResumeMaking{
	@Override
	public boolean submitToJobPortal(String jobPortalName){
		if (jobPortalName.startsWith("reed.co.uk")){
			preferredLocation = "London";
			System.out.println("Submit resume with all details.");
		}
		else if (jobPortalName.startsWith("naukri.com")){
			preferredLocation = "Bengaluru";
			System.out.println("Submit resume with all details.");
		}else return false;
		
		return true;
	}
}

public class Recruitment {

	public static void main(String[] args) {
		JobPortal jp = new JobPortal();
		jp.searchJob();
		jp.submitToJobPortal("reed.co.uk");
	}
}
