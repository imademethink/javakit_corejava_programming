package package02_Polymorphism_Static;

class Product{
	public float price    = 0;
	public String title   = "";
	public String category= "";

	public Product(){
		this.price     = 999.99f;
		this.title     = "Pink top for party";
		this.category  = "Party ware";
	}
	// show product on PLP page (all product at a time)
	public boolean showProduct(String mainProductImage){
		System.out.println("Title    : " + title);
		System.out.println("Category : " + category);
		System.out.println("Price    : " + price);
		System.out.println("Image    : " + mainProductImage);
		return true;
	}

	// show product on PDP page (individual product at a time)
	public boolean showProduct(String detailedProductImages,
			                   int    totalImagesCount,
			                   String reviewRating, 
			                   String reviewComments,
			                   boolean cashOnDelivery){
		System.out.println("Title            : " + title);
		System.out.println("Category         : " + category);
		System.out.println("Price            : " + price);
		System.out.println("Images           : " + detailedProductImages);
		System.out.println("Image count      : " + totalImagesCount);
		System.out.println("Review Rating    : " + reviewRating);
		System.out.println("Review Comments  : " + reviewComments);
		if(cashOnDelivery) System.out.println("Cash On Delivery : " + "Yes");
		else               System.out.println("Cash On Delivery : " + "No");
		
		return true;
	}
	
	// payment using online banking
	public boolean payment(String netBankingLogin, String netBankingPassword,
			               float amount){
		if((null == netBankingLogin)       || (null == netBankingLogin)) return false;
		if((netBankingLogin.isEmpty())     || (netBankingLogin.isEmpty())) return false;
		if((null == netBankingPassword)    || (null == netBankingPassword)) return false;
		if((netBankingPassword.isEmpty())  || (netBankingPassword.isEmpty())) return false;
		if(amount < 0.0f) return false;

		System.out.println("Processing payment using online banking");
		return true;
	}

	// payment using credit card
	public boolean payment(String creditCardNumber, String expiryMonth, String expiryYear,
			               float amount){
		if((null == creditCardNumber)   || (null == expiryMonth)   || (null == expiryYear))    return false;
		if((creditCardNumber.isEmpty()) || (expiryMonth.isEmpty()) || (expiryYear.isEmpty()))  return false;
		if(amount < 0.0f) return false;

		System.out.println("Processing payment using credit card");
		return true;
	}
}

public class ECommerce {

	public static void main(String[] args) {
		Product someProduct = new Product();
		someProduct.showProduct("c:\\mainProductImages\\product_06.jpg");
		someProduct.showProduct("c:\\detailedProductImages\\product_06\\");
		someProduct.payment("SheldonCooper", "Bazinga100$", 9999.00f);
		someProduct.payment("4444 8888 0000 6666", "12", "99", 9999.00f);
	}
}
