package package05_CompositePattern;

import java.util.ArrayList;
import java.util.List;

interface Payee {	
	public void Commit(String name, int bankAccountNumber);
}

class SameBank implements Payee {
	@Override
	public void Commit(String name, int bankAccountNumber) {
		System.out.println("Commiting payee for same bank "+ name + " " + bankAccountNumber);
	}
}
class OtherBank implements Payee {
	@Override
	public void Commit(String name, int bankAccountNumber) {
		System.out.println("Commiting payee for other bank "+ name + " " + bankAccountNumber);
	}
}

class PayeeProcess implements Payee{
	private List<Payee> payees = new ArrayList<Payee>();
	@Override
	public void Commit(String name, int bankAccountNumber) {
		payees.get(- 1 +  payees.size()).Commit(name, bankAccountNumber);
	}
	public void add(Payee p){this .payees.add(p);}	
	public void remove(Payee p){this .payees.remove(p);}
	public void clear(){
		System.out.println("Clearing all the payee from payees");
		this.payees.clear();
	}
}

public class Example10_Baking{
	public static void main(String[] args) {
		Payee p10SameBank = new SameBank();
		Payee p11SameBank = new SameBank();
		Payee p20OtherBank = new OtherBank();
		Payee p21OtherBank = new OtherBank();
		
		PayeeProcess pp = new PayeeProcess();
		pp.add(p10SameBank);
		pp.Commit("Harry Potter",501);
		pp.add(p11SameBank);
		pp.Commit("Winsten Churchill",502);
		pp.add(p20OtherBank);
		pp.Commit("Ted Mosby",901);
		pp.add(p21OtherBank);
		pp.Commit("Lily Aldrin",902);
		
		pp.remove(p21OtherBank);
		
		pp.clear();
	}
}


