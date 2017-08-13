package package02_Object;

public class Banking {

	String strGivenName  = "Uncle Scrooge";
	String strFamilyName = "McDuck";
	int nOpeningBalance  = 0;
	void openBankAccount(){
		System.out.println("openBankAccount() method invoked");
		System.out.println("Given Name   - " + strGivenName);
		System.out.println("Family Name  - " + strFamilyName);
	}
	
	public static void main(String[] args) {
		Banking objBankAccount 		            = new Banking();
		objBankAccount.nOpeningBalance  = 1000000000;
		System.out.println("setting opening balance to " + objBankAccount.nOpeningBalance);

		objBankAccount.openBankAccount();
	}

}
