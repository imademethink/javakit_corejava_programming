package package02_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class AccountData{
	String  firstName;
	String  secondName;
	float    balanceAmount;
	public AccountData(String first_Name, String second_Name, float  balance_Amount){
				this.firstName = first_Name;
				this.secondName = second_Name; 
				this.balanceAmount = balance_Amount;
	}
}

public class Banking {
	public static void main(String[] args) {

		String [] accountId = new String [10];
		for (int n=0; n<10; n++){
			accountId[n] = Any_Id.getRandomAlphanumericAnyId();
		}
		
		HashMap<String, AccountData> manyBankAccounts = new HashMap<String, AccountData>() ;
		
		// put method
		manyBankAccounts.put(accountId[0], new AccountData("James", "Bond", 1.5f));
		manyBankAccounts.put(accountId[1], new AccountData("Jack", "Sparrow", 200.9f));
		manyBankAccounts.put(accountId[2], new AccountData("Jackie", "Chan", 900.9f));
		
		// putAll method
		HashMap<String, AccountData> bankAccTmp = new HashMap<String, AccountData>() ;
		bankAccTmp.put(accountId[3], new AccountData("Amir", "Khan", 10000.0f));		
		bankAccTmp.put(accountId[4], new AccountData("Robert", "DownyJr", 9999998.9f));		
		manyBankAccounts.putAll(bankAccTmp);

		// get method
		AccountData getAcctData = manyBankAccounts.get(accountId[4]);
		System.out.println(getAcctData.firstName);
		System.out.println(getAcctData.secondName);
		System.out.println(getAcctData.balanceAmount);
		System.out.println("\n");
		
		// size method
		System.out.println( manyBankAccounts.size()  +"\n");
		
		// remove method
		manyBankAccounts.remove(accountId[4]);
		System.out.println( manyBankAccounts.size()  +"\n");
		
		// containsKey method
		System.out.println( manyBankAccounts.containsKey(accountId[3])  +"\n");
		
		// clear method
		System.out.println(bankAccTmp.size());
		bankAccTmp.clear();
		System.out.println(bankAccTmp.size()  +"\n");
		
		// keySet method
		Set<String> manyBnkAcctKeys =   manyBankAccounts.keySet();
		System.out.println(manyBnkAcctKeys.size());
		for (String kKey : manyBnkAcctKeys){
			System.out.println(kKey);
		}
		
		// values method
		Collection<AccountData> manyBankAccountValues =   manyBankAccounts.values();
		for (AccountData vValue : manyBankAccountValues){
			System.out.println(vValue.firstName);
		}

		// entrySet method
		for(Map.Entry<String, AccountData>  mapEntrySngle :  manyBankAccounts.entrySet()){
			String acctId = mapEntrySngle.getKey();
			AccountData ad = mapEntrySngle.getValue();
			System.out.println(acctId + ": " +  ad.firstName + ": " + ad.secondName + " : " + ad.balanceAmount);
		}

	}
}
