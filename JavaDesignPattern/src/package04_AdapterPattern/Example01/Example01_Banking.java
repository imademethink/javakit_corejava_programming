package package04_AdapterPattern.Example01;

public class Example01_Banking {

	public static void main(String[] args) {
		Bank_A bank_A = new Bank_A();
		bank_A.setName("Larry Gomez");
		bank_A.setAge("41");
		bank_A.setAddress("Railway station Street, Reston Virginia");
		bank_A.setDateOfBirth("1 Jan 1990");
		bank_A.setBalance(520000);

		BankGeneral bankGeneral = new Bank__Adapter(bank_A);		
		System.out.println("Name:    " + bankGeneral.getName());
		System.out.println("Age:        " + bankGeneral.getAge());
		System.out.println("Deposit: " + bankGeneral.getDeposit());
		System.out.println("Balance: " + bankGeneral.getBalance());
	}
}
