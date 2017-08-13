package package02_FactoryPattern;

interface BankingAccount {
	abstract void createAccount(String  first_Name, String  second_Name, float  balance_Amount);
	abstract void moneyIn(float moneyAmount);
	abstract void moneyOut(float moneyAmount);
}

class BankingAccountSaving implements BankingAccount{
    String  firstName;
    String  secondName;
	float  balanceAmount;
	int dailyTransactionLimit = 2;

	@Override
	public void createAccount(String  first_Name, String  second_Name, float  balance_Amount){
		firstName=  first_Name; secondName=  second_Name; balanceAmount =  balance_Amount;
		System.out.println("Initialized account with following details : " + firstName + " " + secondName + " " + balanceAmount);
	}	
	@Override
	public void moneyIn(float moneyAmount){
		if(0 == dailyTransactionLimit){
			System.out.println("Daily transaction limit exceeded");
			return;
		}
		if(moneyAmount > 20000){
			System.out.println("At a time more than 20000 amount can not be added per government norms");
			return;
		}
		dailyTransactionLimit--;
		balanceAmount += moneyAmount;
		System.out.println("Money in : " + moneyAmount);
	}
	@Override
	public void moneyOut(float moneyAmount){
		if(0 == dailyTransactionLimit){
			System.out.println("Daily transaction limit exceeded");
			return;
		}
		if(moneyAmount > 20000){
			System.out.println("At a time more than 20000 amount can not be withdrawn per government norms");
			return;
		}
		dailyTransactionLimit--;
		balanceAmount += moneyAmount;
		System.out.println("Money out : " + moneyAmount);
	}
}

class BankingAccountCurrent implements BankingAccount{
    String  firstName;
    String  secondName;
	float  balanceAmount;
	int dailyTransactionLimit = 100;

	@Override
	public void createAccount(String  first_Name, String  second_Name, float  balance_Amount){
		firstName=  first_Name; secondName=  second_Name; balanceAmount =  balance_Amount;
		System.out.println("Initialized account with following details : " + firstName + " " + secondName + " " + balanceAmount);
	}	
	@Override
	public void moneyIn(float moneyAmount){
		if(0 == dailyTransactionLimit){
			System.out.println("Daily transaction limit exceeded");
			return;
		}
		dailyTransactionLimit--;
		balanceAmount += moneyAmount;
		System.out.println("Money in : " + moneyAmount);
	}
	@Override
	public void moneyOut(float moneyAmount){
		if(0 == dailyTransactionLimit){
			System.out.println("Daily transaction limit exceeded");
			return;
		}
		dailyTransactionLimit--;
		balanceAmount += moneyAmount;
		System.out.println("Money out : " + moneyAmount);
	}
}


class FactoryForBankAccount{
	public BankingAccount getBankAccount(String bankAccountType){
		if (null == bankAccountType) return null;
		
		switch (bankAccountType.toLowerCase()) {
			case "":
				return null;
			case "saving":
				return new BankingAccountSaving();
			case "current":
				return new BankingAccountCurrent();
			default:
				return null;
		}
	}
}

public class Example10_FactoryForBanking {

	public static void main(String[] args) {
		FactoryForBankAccount factory = new FactoryForBankAccount();
		BankingAccount b1 = factory.getBankAccount("saving");
		b1.createAccount("Johnny", "Depp", 0.0f);
		b1.moneyIn(10000.0f);
		b1.moneyOut(50.0f);
		b1.moneyOut(80.0f);
		
		BankingAccount b2 = factory.getBankAccount("current");
		b2.createAccount("Jackie", "Chan", 0.0f);
		b2.moneyIn(9999.0f);
		b2.moneyOut(50.0f);
		b2.moneyOut(80.0f);
		b2.moneyIn(21000.0f);
	}
}
