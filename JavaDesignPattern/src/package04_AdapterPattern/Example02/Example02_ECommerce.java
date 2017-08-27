package package04_AdapterPattern.Example02;

public class Example02_ECommerce {

	public static void main(String[] args) {
		ProductDataOld productDataOld = new ProductDataOld();
		productDataOld.setTitle("Mobile Cover");
		productDataOld.setCost(250);
		productDataOld.setMainImage("SimpleCover.jpg" + "\n");
		
		ProductDataGeneral pdg = new ProductData__Adapter(
																	productDataOld,
																	"SupportImage1.jpg",
																	4.5f,
																	"Review comments - Excellant product");
		
		System.out.println(pdg.getTitle());
		System.out.println(pdg.getCost());
		System.out.println(pdg.getMainImage());
		System.out.println(pdg.getSupportingImage());
		System.out.println(pdg.getUserRating());
		System.out.println(pdg.getUserReview());
	}
}
