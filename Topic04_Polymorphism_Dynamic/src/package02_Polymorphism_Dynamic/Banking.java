package package02_Polymorphism_Dynamic;

class SavingAccount{
	public float minBalanceAmount = 0.0f;

	public boolean addMoney(float moneyIn){
		System.out.println("addMoney");
		return true;
	}
	
	public boolean withdrawMoney(float moneyOut){
		System.out.println("withdrawMoney");
		return true;
	}
	
	public void calculateInterest(){
		System.out.println("calculateInterest");
	}
}

class XYZBank_SavingAccount extends SavingAccount{
	private float currentBalanceAmount = 0.0f;
	
	public XYZBank_SavingAccount(){
		currentBalanceAmount = 0.0f;
	}

	@Override
	public boolean addMoney(float moneyIn){
		if(moneyIn < 0) return false;
		System.out.println("Adding following money to amount: " + moneyIn);
		currentBalanceAmount = currentBalanceAmount + moneyIn;
		return true;
	}
	
	@Override
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
	
	@Override
	public void calculateInterest(){
		float interestRate = 8.25f; // 10 %
		currentBalanceAmount =  currentBalanceAmount + ( currentBalanceAmount * interestRate / 100 );
	}

	public float getCurrentBalanceAmount(){
		return currentBalanceAmount;
	}	
}


public class Banking {

	public static void main(String[] args) {
		
		XYZBank_SavingAccount xyzSA = new XYZBank_SavingAccount();
		xyzSA.addMoney(500.00f);
		xyzSA.addMoney(550.00f);
		xyzSA.withdrawMoney(400.00f);
		xyzSA.withdrawMoney(25.00f);
		xyzSA.calculateInterest();
		System.out.println("Current balance amount = " + xyzSA.getCurrentBalanceAmount());

		System.out.println("Inside Banking domain example");
	}
}
