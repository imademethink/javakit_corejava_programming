package package03_BuilderPattern;

class BankAccount{
	String firstName;
	String lastName;
	String currentAddress;
	String permenantAddress;
	float openingBalance;
	String bankBranch;
	boolean onlineBanking;
	boolean phoneBanking;
	String acountType;
	
	public BankAccount(String firstName,String lastName,
			                           String currentAddress,String permenantAddress,
			                           float openingBalance,String bankBranch,
			                           boolean onlineBanking,boolean phoneBanking,
			                           String  acountType){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentAddress = currentAddress;
		this.permenantAddress = permenantAddress;
		this.openingBalance = openingBalance;
		this.bankBranch = bankBranch;
		this.onlineBanking = onlineBanking;
		this.phoneBanking = phoneBanking;
		this.acountType = acountType;
	}
	
	@Override
	public String toString() {
		return "GeneralParams [firstName=" + firstName 
				+ ", lastName=" + lastName 
				+ ", currentAddress=" + currentAddress 
				+ ", permenantAddress=" + permenantAddress 
				+ ", openingBalance=" + openingBalance 
				+ ", bankBranch=" + bankBranch 
				+ ", onlineBanking=" + onlineBanking
				+ ", phoneBanking=" + phoneBanking
				+ ", acountType=" + acountType
				+ "]";
	}
	
}

class BankAccountBuilder{
	String firstName;
	String lastName;
	String currentAddress;
	String permenantAddress;
	float openingBalance;
	String bankBranch;
	boolean onlineBanking;
	boolean phoneBanking;
	String acountType;
		
	public BankAccountBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public BankAccountBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public BankAccountBuilder setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
		return this;
	}
	public BankAccountBuilder setPermenantAddress(String permenantAddress) {
		this.permenantAddress = permenantAddress;
		return this;
	}
	public BankAccountBuilder setOpeningBalance(float openingBalance) {
		this.openingBalance = openingBalance;
		return this;
	}
	public BankAccountBuilder setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
		return this;
	}
	public BankAccountBuilder setOnlineBanking(boolean onlineBanking) {
		this.onlineBanking = onlineBanking;
		return this;
	}
	public BankAccountBuilder setPhoneBanking(boolean phoneBanking) {
		this.phoneBanking = phoneBanking;
		return this;
	}
	public BankAccountBuilder setAcountType(String acountType) {
		this.acountType = acountType;
		return this;
	}

	public BankAccount buildBankAccountBuilder(){
		if(! validateMandatoryParam()) return null;
		return new BankAccount(firstName,lastName,
													currentAddress,permenantAddress,
													openingBalance,bankBranch,
													onlineBanking,phoneBanking,
													acountType);
	}
	private boolean validateMandatoryParam(){
		// firstName and lastName should not be empty
		if (  firstName.isEmpty() ||   lastName.isEmpty()   ) return false;
		return true;
	}
}


public class Example10_Banking {

	public static void main(String[] args) {
		BankAccount ba = new BankAccountBuilder()
				.setAcountType("saving")
				.setBankBranch("overseas")
				.setCurrentAddress("221, Baker Street")
				.setFirstName("Sherlock")
				.setLastName("Homes")
				.setOnlineBanking(true)
				.setOpeningBalance(808080.8f)
				.setPermenantAddress("same as current address")
				.setPhoneBanking(false)
				.buildBankAccountBuilder();
        System.out.println(ba);
        
		BankAccount ba2 = new BankAccountBuilder()
				.setAcountType("current")                             // optional
				.setBankBranch("overseas")                           // optional
//				.setCurrentAddress("Up in the sky")             // optional
				.setFirstName("Spider")
				.setLastName("Man")
//				.setOnlineBanking(true)                                 // optional
//				.setOpeningBalance(808080.8f)                    // optional
//				.setPermenantAddress("")                              // optional
//				.setPhoneBanking(false)                                 // optional
				.buildBankAccountBuilder();                          // optional
        System.out.println(ba2);
	}
}
