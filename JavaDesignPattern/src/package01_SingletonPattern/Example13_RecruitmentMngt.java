package package01_SingletonPattern;

class JobOffer {
	 private static JobOffer jobOffer = null;
	 private JobOffer(){}
	 
     static String  title;
     static String  skillsRequired;
	 float  salaryOffered;

	 public boolean initAccount(
	    		String title2, 
	    		String skills_Required, 
	    		float  salary_Offered){
	    			if (jobOffer==null)  { return false;}
	    			title                   = title2;
	    			skillsRequired  = skills_Required; 
	    			salaryOffered   =  salary_Offered;
	    			System.out.println("Initialized account with following details : " + title + " " + skillsRequired + " " + salaryOffered);
	    			return true;
	 }

	 public boolean postJob(float salaryCTC){
	     if (jobOffer==null)  { return false;}
	     salaryOffered = salaryCTC;
		 System.out.println("Job posted with salary offered:           " + salaryOffered);
		 return true;
	 }
	 public boolean addJoiningBonus(float joiningBonusAmount){
	     if (jobOffer==null)  { return false;}
	     salaryOffered += joiningBonusAmount;
		 System.out.println("Joining bonus amount is :            " + joiningBonusAmount);
		 return true;
	 }
     public boolean finalGrossSalary(){
		  if (jobOffer==null)  { return false;}
		  System.out.println("Final salary CTC is :                 " + salaryOffered);
		  return true;
	 }    
	 
	// Only one thread can execute this at a time
    public static synchronized JobOffer getInstance(){
        if (jobOffer==null)  {jobOffer = new JobOffer();}
        return jobOffer;
    }
}

public class Example13_RecruitmentMngt {

	public static void main(String[] args) {
		JobOffer basic1 = JobOffer.getInstance();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		basic1.initAccount("Sr. Analytics Engineer","Business analytics, Artificial intelligance", 0.0f);
		basic1.postJob(50000.0f);
		basic1.addJoiningBonus(9900);
		basic1.finalGrossSalary();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		JobOffer basic2 = JobOffer.getInstance();
		System.out.println("Created instance basic2 , it's hashCode : " + basic2.hashCode());
		JobOffer basic3 = JobOffer.getInstance();
		System.out.println("Created instance basic3 , it's hashCode : " + basic3.hashCode());		
	}
}
