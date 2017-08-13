package package04_AdapterPattern.Example01;

public class Deposit {
	private int depositAmount;
	
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
	@Override
	public String toString() {
		return "Deposit [depositAmount=" + depositAmount + "]";
	}
}
