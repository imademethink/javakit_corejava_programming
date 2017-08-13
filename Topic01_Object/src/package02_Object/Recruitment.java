package package02_Object;

public class Recruitment {

	String strJobTitle = "Java developer with Spring framework.";
	int nNoOfPosition  = 0;
	void postJob(){
		System.out.println("postJob() method invoked");
		System.out.println("Job title - " + strJobTitle);
	}
	
	public static void main(String[] args) {
		Recruitment objRecruit 		= new Recruitment();
		objRecruit.nNoOfPosition  	= 5;
		System.out.println("setting num of position to " + objRecruit.nNoOfPosition);

		objRecruit.postJob();
	}

}
