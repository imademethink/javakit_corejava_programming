package package06_StratergyPattern;

interface Payment {
	   public void addPaymentMethod(String[] details);
}
class Payment_NetBanking implements Payment{
	   @Override
	   public void addPaymentMethod(String[] details) {
	      System.out.println("Adding payment method NetBanking with following details:  ");
	      System.out.println("Card num:    " + details[0]);
	      System.out.println("Card expiry: " + details[1]);
	      System.out.println("Card cvv:   " + details[2]);
	   }
}
class Payment_Paypal implements Payment{
	   @Override
	   public void addPaymentMethod(String[] details) {
		  System.out.println("Adding payment method Paypay with following details:  ");
	      System.out.println("Email:  " + details[0]);
	      System.out.println("Pwd:    " + details[1]);
	   }
}

class ContextEcommerce {
	   private Payment paymentStratergy;
	   public ContextEcommerce(Payment paymentStratergy){
	      this.paymentStratergy = paymentStratergy;
	   }
	   public void executeStrategy(String[] details){
		   paymentStratergy.addPaymentMethod(details);
	   }
}

public class Example12_Ecommerce {

	public static void main(String[] args) {
		ContextEcommerce ecomContext1 = new ContextEcommerce(new Payment_NetBanking());
		System.out.println("Using stratergy for NetBanking account");
		String[] netBankingDetails = {"4111111111111111","1220","123"};
		ecomContext1.executeStrategy(netBankingDetails);

		ContextEcommerce ecomContext2 = new ContextEcommerce(new Payment_Paypal());
		System.out.println("Using stratergy for Paypal account");
		String[] payPayDetails = {"uncle.scrudge@tailspin.com","money999"};
		ecomContext2.executeStrategy(payPayDetails);
	}

}
