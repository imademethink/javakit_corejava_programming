package package04_AdapterPattern.Example02;

public class ProductDataNew implements ProductDataGeneral{
	private String title;
	private int cost;
	private String mainImage;
	private String supportingImage;
	private float userRating;
	private String userReview;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getMainImage() {
		return mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	public String getSupportingImage() {
		return supportingImage;
	}
	public void setSupportingImage(String supportingImage) {
		this.supportingImage = supportingImage;
	}
	public float getUserRating() {
		return userRating;
	}
	public void setUserRating(float userRating) {
		this.userRating = userRating;
	}
	public String getUserReview() {
		return userReview;
	}
	public void setUserReview(String userReview) {
		this.userReview = userReview;
	}
}
