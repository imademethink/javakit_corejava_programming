package package02_InheritanceMultilevel;

class CommonProduct{
	double price    = 0.0;
	String title    = "";
	String colour   = "";
}

class FashionProduct extends CommonProduct{
	String brandName = "";
}

public class ECommerce {
	public static void main(String[] args) {
		FashionProduct fp = new FashionProduct();
		fp.price     = 999.99;
		fp.title     = "Dress";
		fp.colour    = "Pink";
		fp.brandName = "VanHussen";
		System.out.println("Inheritance for ECommerce type");
	}
}
