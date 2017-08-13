package package03_BuilderPattern;

class ProductProperties{
	String title;
	String features;
	String mainImagePath;
	String supportingImagePath;
	float basicCost;
	int minOrderQnty;
	float userRating;
	String userReviewComment;
	boolean cashOnDelivery;
	String shippingAddress;
	String billingAddress;
	
	public ProductProperties( String title,
												String features, String mainImagePath,
												String supportingImagePath, float basicCost,
												int minOrderQnty, float userRating,
												String userReviewComment, boolean cashOnDelivery,
												String shippingAddress,String billingAddress){
		super();
		this.title = title;
		this.features = features;
		this.mainImagePath = mainImagePath;
		this.supportingImagePath = supportingImagePath;
		this.basicCost = basicCost;
		this.minOrderQnty = minOrderQnty;
		this.userRating = userRating;
		this.userReviewComment = userReviewComment;
		this.cashOnDelivery = cashOnDelivery;
		this.shippingAddress = shippingAddress;
		this.billingAddress = billingAddress;
	}
	
	@Override
	public String toString() {
		return "GeneralParams [title=" + title 
				+ ", features=" + features 
				+ ", mainImagePath=" + mainImagePath 
				+ ", supportingImagePath=" + supportingImagePath 
				+ ", basicCost=" + basicCost 
				+ ", minOrderQnty=" + minOrderQnty 
				+ ", userRating=" + userRating
				+ ", userReviewComment=" + userReviewComment
				+ ", cashOnDelivery=" + cashOnDelivery
				+ ", shippingAddress=" + shippingAddress
				+ ", billingAddress=" + billingAddress
				+ "]";
	}
	
}

class ProductPropertiesBuilder{
	String title;
	String features;
	String mainImagePath;
	String supportingImagePath;
	float basicCost;
	int minOrderQnty;
	float userRating;
	String userReviewComment;
	boolean cashOnDelivery;
	String shippingAddress;
	String billingAddress;
		
	public ProductPropertiesBuilder setTitle(String title) {
		this.title = title;
		return this;
	}
	public ProductPropertiesBuilder setFeatures(String features) {
		this.features = features;
		return this;
	}
	public ProductPropertiesBuilder setMainImagePath(String mainImagePath) {
		this.mainImagePath = mainImagePath;
		return this;
	}
	public ProductPropertiesBuilder setSupportingImagePath(String supportingImagePath) {
		this.supportingImagePath = supportingImagePath;
		return this;
	}
	public ProductPropertiesBuilder setBasicCost(float basicCost) {
		this.basicCost = basicCost;
		return this;
	}
	public ProductPropertiesBuilder setMinOrderQnty(int minOrderQnty) {
		this.minOrderQnty = minOrderQnty;
		return this;
	}
	public ProductPropertiesBuilder setUserRating(float userRating) {
		this.userRating = userRating;
		return this;
	}
	public ProductPropertiesBuilder setUserReviewComment(String userReviewComment) {
		this.userReviewComment = userReviewComment;
		return this;
	}
	public ProductPropertiesBuilder setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
		return this;
	}
	public ProductPropertiesBuilder setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}
	public ProductPropertiesBuilder setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	public ProductProperties buildProductPropertiesBuilder(){
		if(! validateMandatoryParam()) return null;
		return new ProductProperties(title, features,mainImagePath,supportingImagePath,
				                                            basicCost,minOrderQnty,userRating, userReviewComment,
                                                            cashOnDelivery, shippingAddress, billingAddress);
	}
	private boolean validateMandatoryParam(){
		// firstName and lastName should not be empty
		if (  title.isEmpty() ||   (basicCost < 0)   ) return false;
		return true;
	}
}


public class Example12_ECommerce {

	public static void main(String[] args) {
		ProductProperties pp = new ProductPropertiesBuilder()
				.setBasicCost(250.0f)
				.setBillingAddress("101, Super Apartment, Berlin")
				.setCashOnDelivery(true)
				.setFeatures("Water proof, onsite warrenty")
				.setMainImagePath("//watch001//main//")
				.setShippingAddress("//watch001//supporting//")
				.setMinOrderQnty(2)
				.setTitle("Wrist Watch")
				.setUserRating(4.3f)
				.setUserReviewComment("Wonderful product, good delivery")
				.buildProductPropertiesBuilder();
		System.out.println(pp);
        
		ProductProperties pp2 = new ProductPropertiesBuilder()
				.setBasicCost(250.0f)
				.setBillingAddress("581, Multface Apartment, HongKong")
//				.setCashOnDelivery(true)                                                    // optional
//				.setFeatures("Water proof, onsite warrenty")                  // optional
//				.setMainImagePath("//watch001//main//")                   // optional
//				.setShippingAddress("//watch001//supporting//")        // optional
//				.setMinOrderQnty(2)                                                         // optional
				.setTitle("Drinking Bottle")
//				.setUserRating(4.3f)                                                            // optional
//				.setUserReviewComment("Wonderful product, good delivery")    // optional
				.buildProductPropertiesBuilder();
		System.out.println(pp2);
	}
}
