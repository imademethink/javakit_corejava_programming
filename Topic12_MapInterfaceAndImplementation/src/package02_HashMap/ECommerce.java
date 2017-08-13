package package02_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class ProductData{
	String  name;
	String  features;
	float    basicCost;
	public ProductData(String name2, String features2, float  basicCost2){
				this.name = name2;
				this.features = features2; 
				this.basicCost = basicCost2;
	}
}

public class ECommerce {
	public static void main(String[] args) {

		String [] prodId = new String [10];
		for (int n=0; n<10; n++){
			prodId[n] = Any_Id.getRandomAlphanumericAnyId();
		}
		
		HashMap<String, ProductData> multiProucts  = new HashMap<String, ProductData>() ;
		
		// put method
		multiProucts.put(prodId[0], new ProductData("Dress", "Party wear Pink", 3500.5f));
		multiProucts.put(prodId[1], new ProductData("TShirt", "V-neck Sport Jersey", 2200.0f));
		multiProucts.put(prodId[2], new ProductData("Tie", "Black Medium long Executive", 900.0f));
		
		// putAll method
		HashMap<String, ProductData> prdTmp = new HashMap<String, ProductData>() ;
		prdTmp.put(prodId[3], new ProductData("Amir", "Khan", 10000.0f));		
		prdTmp.put(prodId[4], new ProductData("Robert", "DownyJr", 9999998.9f));		
		multiProucts.putAll(prdTmp);

		// get method
		ProductData getProdData = multiProucts.get(prodId[4]);
		System.out.println(getProdData.name);
		System.out.println(getProdData.features);
		System.out.println(getProdData.basicCost);
		System.out.println("\n");
		
		// size method
		System.out.println( multiProucts.size()  +"\n");
		
		// remove method
		multiProucts.remove(prodId[4]);
		System.out.println( multiProucts.size()  +"\n");
		
		// containsKey method
		System.out.println( multiProucts.containsKey(prodId[3])  +"\n");
		
		// clear method
		System.out.println(prdTmp.size());
		prdTmp.clear();
		System.out.println(prdTmp.size()  +"\n");
		
		// keySet method
		Set<String> multiProuctsKeys =   multiProucts.keySet();
		System.out.println(multiProuctsKeys.size());
		for (String kKey : multiProuctsKeys){
			System.out.println(kKey);
		}
		
		// values method
		Collection<ProductData> multiProuctsValues =   multiProucts.values();
		for (ProductData vValue : multiProuctsValues){
			System.out.println(vValue.name);
		}

		// entrySet method
		for(Map.Entry<String, ProductData>  mapOneProd :  multiProucts.entrySet()){
			String prod_Id = mapOneProd.getKey();
			ProductData pd = mapOneProd.getValue();
			System.out.println(prod_Id + ": " + pd.name + ": " + pd.features + " : " + pd.basicCost);
		}
		
		
	}
}
