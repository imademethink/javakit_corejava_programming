package package02_Interface;

interface SavingAccount{
	public float minBalanceAmount = 1000.0f;

	public boolean addMoney(float moneyIn);
	public boolean withdrawMoney(float moneyOut);
	public abstract boolean calculateInterest();
}

class XYZBank_SavingAccount implements SavingAccount{
	private float currentBalanceAmount = 0.0f;
	
	public XYZBank_SavingAccount(){
		currentBalanceAmount = 0.0f;
	}

	public boolean addMoney(float moneyIn){
		if(moneyIn < 0) return false;
		System.out.println("Adding following money to amount: " + moneyIn);
		currentBalanceAmount = currentBalanceAmount + moneyIn;
		return true;
	}
	
	public boolean withdrawMoney(float moneyOut){
		if(moneyOut < 0) return false;
		if( (currentBalanceAmount - moneyOut) <  minBalanceAmount){
			System.out.println("Can not withdraw this amount " + moneyOut + " need to maintain minimum balance.");
			return false;
		}
		System.out.println("Withdrawing following money to amount: " + moneyOut);
		currentBalanceAmount = currentBalanceAmount - moneyOut;
		return true;
	}
	
	public boolean calculateInterest(){
		float interestRate = 8.25f; // 10 %
		currentBalanceAmount =  currentBalanceAmount + ( currentBalanceAmount * interestRate / 100 );
		return true;
	}

	public float getCurrentBalanceAmount(){
		return currentBalanceAmount;
	}	
}


public class Banking {

	public static void main(String[] args) {
		
		SavingAccount sa = new XYZBank_SavingAccount();
		sa.addMoney(500.00f);
		sa.addMoney(550.00f);
		sa.withdrawMoney(400.00f);
		sa.withdrawMoney(25.00f);
		sa.calculateInterest();
		System.out.println("Current balance amount = " + ((XYZBank_SavingAccount) sa).getCurrentBalanceAmount());

		System.out.println("Inside Banking domain example");
	}
}
