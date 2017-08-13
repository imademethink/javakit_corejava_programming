package package02_Polymorphism_Static;

class SavingAccount{
	public float balanceAmount;
	
	public SavingAccount(){
		balanceAmount = 0.0f;
	}

	// addMoney by online transaction method
	public boolean addMoney(float amountOnlineTransaction, String onlineTransactionId){
		if(null == onlineTransactionId) return false;
		if(onlineTransactionId.isEmpty()) return false;
		if(10 != onlineTransactionId.length()) return false;
		
		balanceAmount = balanceAmount + amountOnlineTransaction;
		System.out.println("addMoney by online transaction method");
		return true;
	}

	// addMoney by in person in bank method
	public boolean addMoney(float amountInPerson, String bankBranchID, String transactionId){
		if((null == bankBranchID)       || (null == transactionId)) return false;
		if((bankBranchID.isEmpty())     || (transactionId.isEmpty())) return false;
		if((5 != bankBranchID.length()) || (10 != transactionId.length())) return false;

		balanceAmount = balanceAmount + amountInPerson;
		System.out.println("addMoney by in person in bank method");
		return true;
	}

	// addMoney by regular interest rate
	public boolean addMoney(float interestRate){
		balanceAmount = balanceAmount + (balanceAmount  * interestRate /100);
		System.out.println("addMoney by regular interest rate");
		return true;
	}
}

public class Banking {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		sa.addMoney(500,"BOA2020100");
		System.out.println("Current balance : " + sa.balanceAmount);
		sa.addMoney(350,"NY400","BOA2020200");
		System.out.println("Current balance : " + sa.balanceAmount);
		sa.addMoney(10.5f);
		System.out.println("Current balance : " + sa.balanceAmount);
	}
}
