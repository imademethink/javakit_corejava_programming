package package02_AbstractClass;

abstract class Account{
	public float balanceAmount;
	
	public Account(){
		balanceAmount = 0.0f;
	}
	
	public boolean addMoney(float moneyIn){
		if(moneyIn < 0) return false;
		balanceAmount = balanceAmount + moneyIn;
		return true;
	}
	
	public boolean withdrawMoney(float moneyOut){
		if(moneyOut < 0) return false;
		if(moneyOut > balanceAmount) return false;
		balanceAmount = balanceAmount - moneyOut;
		return true;
	}
	
	public abstract boolean calculateInterest();
}

class SavingAccount extends Account{
	@Override
	public boolean calculateInterest(){
		balanceAmount = balanceAmount + (balanceAmount * 8.5f/100);
		return true;
	}
}

public class Banking {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		System.out.println("Current balance - " + sa.balanceAmount);
		sa.addMoney(500);
		System.out.println("Current balance - " + sa.balanceAmount);
		sa.withdrawMoney(290);
		System.out.println("Current balance - " + sa.balanceAmount);
		sa.calculateInterest();
		System.out.println("Current balance - " + sa.balanceAmount);		
	}
}
