package package02_InheritanceMultilevel;

class JobListing{
	String title      = "";
	String skills     = "";
	int minExperience = -1;
	int maxExperience = -1;
	int salaryOffered = 0;
}

class SoftwareJobListing extends JobListing{
	String roleOfCandidate;
	String workLocation;
}


public class Recruitment {

	public static void main(String[] args) {
		SoftwareJobListing objSoftwareJob = new SoftwareJobListing();
		objSoftwareJob.title  	        = "Software Developer";
		objSoftwareJob.skills  	        = "Java, Oracle, Unix/ Linux";
		objSoftwareJob.minExperience  	= 7;
		objSoftwareJob.maxExperience  	= 9;
		objSoftwareJob.salaryOffered  	= 2000000;
		objSoftwareJob.roleOfCandidate  = "Sr. Developer";
		objSoftwareJob.workLocation  	= "Bengaluru";
		System.out.println("Inheritance for Recruitment type");
	}

}
