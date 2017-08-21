package package02_InheritanceMultilevel;

class BankAccount{
	int accountNumber = -1;
	String name       = "";
	double balance    = 0.0;
}

class SavingBankAccount extends BankAccount{
	int dailyTransactionCountLimit;
}

public class Banking {
	public static void main(String[] args) {
		SavingBankAccount sba = new SavingBankAccount();
		sba.accountNumber     = 5001;
		sba.name                       = "Neil Patrick Harris";
		sba.balance                    = 1000.0;
		sba.dailyTransactionCountLimit = 50;
		System.out.println("Inheritance for Banking type");
	}
}