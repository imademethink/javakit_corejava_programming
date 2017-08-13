package package04_AdapterPattern.Example02;

public class ProductData__Adapter extends ProductDataNew implements ProductDataGeneral{
	private ProductDataOld productDataOld;
	
	public ProductData__Adapter(	ProductDataOld productDataOld2, 
														String supportingImage,
														float userRating,
														String userReview) {
		this.productDataOld = productDataOld2;
		this.adapterData(supportingImage,userRating,userReview);
	}
	
	private void adapterData(String supportingImage,
												float userRating,
												String userReview){
		this.setTitle(productDataOld.getTitle());
		this.setCost(productDataOld.getCost());
		this.setMainImage(productDataOld.getMainImage());
		this.setSupportingImage(supportingImage);
		this.setUserReview(userReview);
		this.setUserRating(userRating);
	}
}
