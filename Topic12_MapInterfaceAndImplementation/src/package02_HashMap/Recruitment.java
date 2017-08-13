package package02_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class JobPosting{
	String  title;
	String  skillsRequired;
	int        salaryOffered;
	public JobPosting(String title2, String skills_Required, int  salary_Offered){
				this.title = title2;
				this.skillsRequired = skills_Required; 
				this.salaryOffered = salary_Offered;
	}
}

public class Recruitment {
	public static void main(String[] args) {

		String [] jobId = new String [10];
		for (int n=0; n<10; n++){
			jobId[n] = Any_Id.getRandomAlphanumericAnyId();
		}
		
		HashMap<String, JobPosting> manyJobPostings = new HashMap<String, JobPosting>() ;
		
		// put method
		manyJobPostings.put(jobId[0], new JobPosting("Sr. Developer", "Java", 180000));
		manyJobPostings.put(jobId[1], new JobPosting("Sr. QA", "Automation", 180000));
		manyJobPostings.put(jobId[2], new JobPosting("Jr. QA", "Automation", 900000));
		
		// putAll method
		HashMap<String, JobPosting> jobPostingTmp = new HashMap<String, JobPosting>() ;
		jobPostingTmp.put(jobId[3], new JobPosting("GUI Developer", "Flash", 100000));		
		jobPostingTmp.put(jobId[4], new JobPosting("Scrum Master", "Scrum, Agile", 800000));		
		manyJobPostings.putAll(jobPostingTmp);

		// get method
		JobPosting getJobDetail = manyJobPostings.get(jobId[4]);
		System.out.println(getJobDetail.title);
		System.out.println(getJobDetail.skillsRequired);
		System.out.println(getJobDetail.salaryOffered);
		System.out.println("\n");
		
		// size method
		System.out.println( manyJobPostings.size()  +"\n");
		
		// remove method
		manyJobPostings.remove(jobId[4]);
		System.out.println( manyJobPostings.size()  +"\n");
		
		// containsKey method
		System.out.println( manyJobPostings.containsKey(jobId[3])  +"\n");
		
		// clear method
		System.out.println(jobPostingTmp.size());
		jobPostingTmp.clear();
		System.out.println(jobPostingTmp.size()  +"\n");
		
		// keySet method
		Set<String> manyJobPostKeys =   manyJobPostings.keySet();
		System.out.println(manyJobPostKeys.size());
		for (String kKey : manyJobPostKeys){
			System.out.println(kKey);
		}
		
		// values method
		Collection<JobPosting> manyJobPostValues =   manyJobPostings.values();
		for (JobPosting vValue : manyJobPostValues){
			System.out.println(vValue.title);
		}

		// entrySet method
		for(Map.Entry<String, JobPosting>  mapEntrySngle :  manyJobPostings.entrySet()){
			String acctId = mapEntrySngle.getKey();
			JobPosting jp = mapEntrySngle.getValue();
			System.out.println(acctId + ": " +  jp.title + ": " + jp.skillsRequired + " : " + jp.salaryOffered);
		}

	}
}
