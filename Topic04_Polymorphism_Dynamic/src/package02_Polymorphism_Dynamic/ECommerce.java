package package02_Polymorphism_Dynamic;

class Product{
	public int minQnty = 2;

	public boolean addProduct(int addQnty){
		System.out.println("addMoney");
		return true;
	}
	public boolean calculateShippingCharges(int pinCode){
		System.out.println("addMoney");
		return true;
	}
	public boolean deliverProduct(String deliveryAddress){
		System.out.println("addMoney");
		return true;
	}
}

class FashionProduct extends Product{
	private float rate           = 0.0f;
	private float billableAmount = 0.0f;

	public FashionProduct(){
		rate           = 55.0f;
		billableAmount = 0.0f;
	}

	@Override
	public boolean addProduct(int addQnty){
		if(addQnty < minQnty) return false;
		System.out.println("Adding following quantity of products: " + addQnty);
		billableAmount = rate * addQnty;
		return true;
	}
	
	@Override
	public boolean calculateShippingCharges(int pinCode){
		if(billableAmount < 0) return false;
		if( (pinCode > 50000) || (pinCode > 60000) ){
			System.out.println("Shipping not supported for following pincode area: " + pinCode);
			return false;
		}
		float shippingCharges = 150;
		billableAmount = billableAmount + shippingCharges;
		return true;
	}
	
	@Override
	public boolean deliverProduct(String deliveryAddress){
		if(billableAmount < 0) {
			System.out.println("Delivery can not be initiated since no products to ship.");
			return false;
		}

		System.out.println("Delivery started for following address: " + deliveryAddress);
		return true;
	}	
}


public class ECommerce {

	public static void main(String[] args) {
		
		FashionProduct fp = new FashionProduct();
		fp.addProduct(5);
		fp.calculateShippingCharges(55555);
		fp.deliverProduct("London Waterloo Coca cola London Eye.");

		System.out.println("Inside Ecommerce domain example");
	}
}
