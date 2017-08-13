package package06_StratergyPattern;

interface BankAccount {
	   public void addAccount(int acctId, String name);
}
class AddSavingAccount implements BankAccount{
	   @Override
	   public void addAccount(int acctId, String name) {
	      System.out.println("Adding saving account with following details:  " + acctId +" " + name);
	   }
}
class AddCurrentAccount implements BankAccount{
	   @Override
	   public void addAccount(int acctId, String name) {
	      System.out.println("Adding current account with following details:  " + acctId +" " + name);
	   }
}

class ContextBanking {
	   private BankAccount bankAccountStratergy;
	   public ContextBanking(BankAccount bankAccountStratergy){
	      this.bankAccountStratergy = bankAccountStratergy;
	   }
	   public void executeStrategy(int acctId, String name){
		   bankAccountStratergy.addAccount(acctId, name);
	   }
}

public class Example11_Banking {

	public static void main(String[] args) {
		ContextBanking bnkContext1 = new ContextBanking(new AddSavingAccount());
		System.out.println("Using stratergy for saving account");
		bnkContext1.executeStrategy(200, "Kate Winslate");

		ContextBanking bnkContext2 = new ContextBanking(new AddCurrentAccount());
		System.out.println("Using stratergy for current account");
		bnkContext2.executeStrategy(800, "Mark Z");
	}

}
