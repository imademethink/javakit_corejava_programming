package package02_Object;

public class ECommerce {

	int nAvailableQnty = 0;
	void showProduct(){
		System.out.println("showProduct() method invoked");
	}
	
	public static void main(String[] args) {
		ECommerce objProduct 		= new ECommerce();
		objProduct.nAvailableQnty  	= 15;
		System.out.println("setting available qnty variable to " + objProduct.nAvailableQnty);

		objProduct.showProduct();
	}

}
