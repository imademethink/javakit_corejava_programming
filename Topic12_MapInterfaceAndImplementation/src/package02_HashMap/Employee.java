package package02_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class EmpData{
	String  firstName;
	String  secondName;
	float    salaryCTC;
	public EmpData(String first_Name, String second_Name, float  salary_CTC){
				this.firstName = first_Name;
				this.secondName = second_Name; 
				this.salaryCTC = salary_CTC;
	}
}

public class Employee {
	public static void main(String[] args) {

		String [] accountId = new String [10];
		for (int n=0; n<10; n++){
			accountId[n] = Any_Id.getRandomAlphanumericAnyId();
		}
		
		HashMap<String, EmpData> manyEmp = new HashMap<String, EmpData>() ;
		
		// put method
		manyEmp.put(accountId[0], new EmpData("James", "Bond", 150000.0f));
		manyEmp.put(accountId[1], new EmpData("Jack", "Sparrow", 200000.0f));
		manyEmp.put(accountId[2], new EmpData("Jackie", "Chan", 120000.9f));
		
		// putAll method
		HashMap<String, EmpData> empArrayTmp = new HashMap<String, EmpData>() ;
		empArrayTmp.put(accountId[3], new EmpData("Amir", "Khan", 10000.0f));		
		empArrayTmp.put(accountId[4], new EmpData("Robert", "DownyJr", 9999998.9f));		
		manyEmp.putAll(empArrayTmp);

		// get method
		EmpData getAcctData = manyEmp.get(accountId[4]);
		System.out.println(getAcctData.firstName);
		System.out.println(getAcctData.secondName);
		System.out.println(getAcctData.salaryCTC);
		System.out.println("\n");
		
		// size method
		System.out.println( manyEmp.size()  +"\n");
		
		// remove method
		manyEmp.remove(accountId[4]);
		System.out.println( manyEmp.size()  +"\n");
		
		// containsKey method
		System.out.println( manyEmp.containsKey(accountId[3])  +"\n");
		
		// clear method
		System.out.println(empArrayTmp.size());
		empArrayTmp.clear();
		System.out.println(empArrayTmp.size()  +"\n");
		
		// keySet method
		Set<String> manyEmpKeys =   manyEmp.keySet();
		System.out.println(manyEmpKeys.size());
		for (String kKey : manyEmpKeys){
			System.out.println(kKey);
		}

		// values method
		Collection<EmpData> manyEmpValues =   manyEmp.values();
		for (EmpData vValue : manyEmpValues){
			System.out.println(vValue.firstName);
		}

		// entrySet method
		for(Map.Entry<String, EmpData>  mapEntryOneEmp :  manyEmp.entrySet()){
			String acctId = mapEntryOneEmp.getKey();
			EmpData ed = mapEntryOneEmp.getValue();
			System.out.println(acctId + ": " +  ed.firstName + ": " + ed.secondName + " : " + ed.salaryCTC);
		}

	}
}
