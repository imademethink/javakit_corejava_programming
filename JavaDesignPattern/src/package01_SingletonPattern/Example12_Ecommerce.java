package package01_SingletonPattern;

class Product {
	 private static Product product = null;
	 private Product(){}
	 
     static String  name;
     static String  features;
	 float  basicCost;

	 public boolean initAccount(
	    		String name2, 
	    		String features2, 
	    		float  basic_Cost){
	    			if (product==null)  { return false;}
	    			name             = name2;
	    			features        = features2; 
	    			basicCost      =  basic_Cost;
	    			System.out.println("Initialized account with following details : " + name + " " + features + " " + basicCost);
	    			return true;
	 }

	 public boolean addProduct(int qnty){
	     if (product==null)  { return false;}
	     basicCost = basicCost * qnty;
		 System.out.println("Added product quantity is : " + basicCost );
		 return true;
	 }
	 public boolean addDiscount(float discountPercent){
	     if (product==null)  { return false;}
	     basicCost = basicCost - (basicCost * discountPercent / 100);
		 System.out.println("Discount percent is : " + discountPercent);
		 return true;
	 }
     public boolean finalProductCost(){
		  if (product==null)  { return false;}
		  System.out.println("Final product cost is : " + basicCost);
		  return true;
	 }    
	 
	// Only one thread can execute this at a time
    public static synchronized Product getInstance(){
        if (product==null)  {product = new Product();}
        return product;
    }
}

public class Example12_Ecommerce {
	public static void main(String[] args) {
		Product basic1 = Product.getInstance();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		basic1.initAccount("Jeans","Part wear, slim fit", 1000.0f);
		basic1.addProduct(5);
		basic1.addDiscount(5.0f);
		basic1.finalProductCost();
		System.out.println("Created instance basic1 , it's hashCode : " + basic1.hashCode());
		Product basic2 = Product.getInstance();
		System.out.println("Created instance basic2 , it's hashCode : " + basic2.hashCode());
		Product basic3 = Product.getInstance();
		System.out.println("Created instance basic3 , it's hashCode : " + basic3.hashCode());		
	}
}
