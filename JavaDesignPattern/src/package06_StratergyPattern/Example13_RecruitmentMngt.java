package package06_StratergyPattern;

interface JobPost {
	   public void postJob(String[] details);
}
class JobPost_Internal implements JobPost{
	   @Override
	   public void postJob(String[] details) {
	      System.out.println("Posting job Internally with following details:  ");
	      System.out.println("Job Title :    " + details[0]);
	      System.out.println("Salary Offered: " + details[1]);
	      System.out.println("Referral bonus amount:   " + details[2]);
	   }
}
class JobPost_External implements JobPost{
	   @Override
	   public void postJob(String[] details) {
	      System.out.println("Posting job Externally with following details:  ");
	      System.out.println("Job Title :    " + details[0]);
	      System.out.println("Salary Offered: " + details[1]);
	      System.out.println("Agent commision:   " + details[2]);
	      System.out.println("Expiry date:   " + details[3]);
	   }
}

class ContextJob {
	   private JobPost jobPostStratergy;
	   public ContextJob(JobPost jobPostStratergy){
	      this.jobPostStratergy = jobPostStratergy;
	   }
	   public void executeStrategy(String[] details){
		   jobPostStratergy.postJob(details);
	   }
}

public class Example13_RecruitmentMngt {

	public static void main(String[] args) {
		ContextJob jobContext1 = new ContextJob(new JobPost_Internal());
		System.out.println("Using stratergy for Internal job posting");
		String[] internalJobDetails = {"Principle QA Architect", "2500000", "68000"};
		jobContext1.executeStrategy(internalJobDetails);

		ContextJob jobContext2 = new ContextJob(new JobPost_External());
		System.out.println("Using stratergy for External job posting");
		String[] externalJobDetails = {"Principle QA Architect", "2500000", "24000", "30 days"};
		jobContext2.executeStrategy(externalJobDetails);
	}

}
