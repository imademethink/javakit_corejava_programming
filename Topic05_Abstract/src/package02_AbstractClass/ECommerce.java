package package02_AbstractClass;

abstract class Product{
	public int price      = 0;
	public String title   = "";
	public String category= "";
	
	public Product(){
		price    = 550;
		title    = "Pen Drive";
		category = "Electronics Accessaries";
	}
	
	public boolean showProduct(){
		System.out.println("Title    : " + title);
		System.out.println("Category : " + category);
		System.out.println("Price    : " + price);
		return true;
	}

	public abstract boolean addToCart(String userAction);
}

class ElectronicsProduct extends Product{
	@Override
	public boolean addToCart(String userAction){
		if (userAction.startsWith("fromProductListingPage")){
			System.out.println("Product added to cart.");
		}
		else if (userAction.startsWith("fromProductDisplayPage")){
			System.out.println("Product added to cart.");
		}else return false;
		
		return true;
	}
}

public class ECommerce {

	public static void main(String[] args) {
		ElectronicsProduct ep = new ElectronicsProduct();
		ep.showProduct();
		ep.addToCart("fromProductDisplayPage");
	}
}
