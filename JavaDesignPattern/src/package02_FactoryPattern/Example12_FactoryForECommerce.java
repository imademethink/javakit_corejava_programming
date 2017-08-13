package package02_FactoryPattern;

interface ProductActivity {
	abstract void showProduct(String  name, String  features, float  basicCost);
	abstract void addToCart(int qnty);
}

// (individual) product display page
class ProductActivity_PDP implements ProductActivity{
    String  name;
    String  features;
	float  basicCost;
	float userRating = 4.5f;
    String  userReview = "Excellent product, excellent delivery";
    String  RecommandedProduct = "You may also like follwoing prodcuts: Product1, Product2, Product3";

	@Override
	public void showProduct(String  name2, String  features2, float  basic_Cost){
		name=  name2; features=  features2; basicCost =  basic_Cost;
		System.out.println("Showing product with following details : " + name + " " + features + " " + basicCost);
		System.out.println("Showing product with following details : " + userRating + " " + userReview + " " + RecommandedProduct);
	}	
	@Override
	public void addToCart(int qnty){
		float grossAmoount = basicCost * qnty;
		System.out.println("Final amount after adding product to cart : " + grossAmoount);
	}
}

// product listing page
class ProductActivity_PLP implements ProductActivity{
    String  name;
    String  features;
	float  basicCost;

	@Override
	public void showProduct(String  name2, String  features2, float  basic_Cost){
		name=  name2; features=  features2; basicCost =  basic_Cost;
		System.out.println("Initialized account with following details : " + name + " " + features + " " + basicCost);
	}	
	@Override
	public void addToCart(int qnty){
		float grossAmoount = basicCost * qnty;
		System.out.println("Final amount after adding product to cart : " + grossAmoount);
	}
}


class FactoryForProductActivity{
	public ProductActivity getProductActivity(String productActivityType){
		if (null == productActivityType) return null;
		
		switch (productActivityType.toLowerCase()) {
			case "":
				return null;
			case "pdp":
				return new ProductActivity_PDP();
			case "plp":
				return new ProductActivity_PLP();
			default:
				return null;
		}
	}
}

public class Example12_FactoryForECommerce {

	public static void main(String[] args) {
		FactoryForProductActivity factory = new FactoryForProductActivity();
		ProductActivity p1 = factory.getProductActivity("plp");
		p1.showProduct("Watch", "Water proof, durable belt, 2 yr warrenty", 5000.0f);
		p1.addToCart(2);
		
		ProductActivity p2 = factory.getProductActivity("pdp");
		p2.showProduct("Portable HDD", "Segate, 2TB, onsite warrenty, online backup, wireless support", 6999.0f);
		p2.addToCart(4);
	}
}
