package package04_AdapterPattern.Example01;

public class Bank__Adapter extends Bank_B implements BankGeneral{
	private Bank_A bank_A;
	
	public Bank__Adapter(Bank_A bank_A2) {
		this.bank_A = bank_A2;
		this.adapterData();
	}
	
	private void adapterData(){
		this.setName(bank_A.getName());
		this.setAge(Integer.valueOf(bank_A.getAge()));
		Deposit deposit = new Deposit();
		deposit.setDepositAmount(bank_A.getBalance());
		this.setDeposit(deposit);
		bank_A.setBalance(0);
	}
}
