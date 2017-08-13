package package01_SingletonPattern;

class SimpleBankAcct {
	 private static SimpleBankAcct simpleBankAcct = null;
	 private SimpleBankAcct(){}
	 
     static String  firstName;
     static String  secondName;
	 float  balanceAmount;

	 public boolean initAccount(
	    		String first_Name, 
	    		String second_Name, 
	    		float  balance_Amount){
	    			if (simpleBankAcct==null)  { return false;}
	    			firstName             = first_Name;
	    			secondName        = second_Name; 
	    			balanceAmount   =  balance_Amount;
	    			System.out.println("Initialized account with following details : " + firstName + " " + secondName + " " + balanceAmount);
	    			return true;
	 }

	 public boolean moneyIn(float moneyAmount){
	     if (simpleBankAcct==null)  { return false;}
	     balanceAmount += moneyAmount;
		 System.out.println("Money in : " + moneyAmount);
		 return true;
	 }
	 public boolean moneyOut(float moneyAmount){
	     if (simpleBankAcct==null)  { return false;}
	     balanceAmount -= moneyAmount;
		 System.out.println("Money out : " + moneyAmount);
		 return true;
	 }
     public boolean balanceCheck(){
		  if (simpleBankAcct==null)  { return false;}
		  System.out.println("Current balance is : " + balanceAmount);
		  return true;
	 }    
	 
	// Only one thread can execute this at a time
    public static synchronized SimpleBankAcct getInstance(){
        if (simpleBankAcct==null)  {simpleBankAcct = new SimpleBankAcct();}
        return simpleBankAcct;
    }
}

public class Example10_Banking {

	public static void main(String[] args) {
		SimpleBankAcct basic1 = SimpleBankAcct.getInstance();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		basic1.initAccount("Sheldon","Cooper", 1000.0f);
		basic1.moneyIn(50000.0f);
		basic1.balanceCheck();
		basic1.moneyOut(25000.0f);
		basic1.balanceCheck();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		SimpleBankAcct basic2 = SimpleBankAcct.getInstance();
		System.out.println("Created instance basic2 , it's hashCode : " + basic2.hashCode());
		SimpleBankAcct basic3 = SimpleBankAcct.getInstance();
		System.out.println("Created instance basic3 , it's hashCode : " + basic3.hashCode());		
	}
}
