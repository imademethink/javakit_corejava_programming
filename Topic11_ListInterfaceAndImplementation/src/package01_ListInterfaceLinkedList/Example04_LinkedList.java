package package01_ListInterfaceLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example04_LinkedList {

	public static void main(String[] args) {
		List<Product> listProduct = new LinkedList<Product>();
		// add method
		listProduct.add(new Product(200, "Shirt", 650));
		listProduct.add(new Product(210, "Pant", 980));
		listProduct.add(new Product(301, "Belt", 250));
		System.out.println("List of type Product");
		
		List<Product> listProductTmp = new LinkedList<Product>();
		listProductTmp.add( new Product(501, "Perfume", 680));
		listProductTmp.add( new Product(588, "Shoes", 1980));
		
		// addAll method
		listProduct.addAll(listProductTmp);
		System.out.println("List of type Product after addition");
		
		// get method
		Product prodTmp = listProduct.get(0);
		System.out.println("Get element at specified index : " + prodTmp.productId);

		// set method
		listProduct.set(0,new Product(222, "Shirt_new", 666));
		System.out.println("Set element at index 0");
		
		// remove method
		System.out.println("Remove element at specified index");
		System.out.println("Size before remove : " + listProduct.size());
		listProduct.remove(0);
		System.out.println("Size after remove  : " + listProduct.size());

		// iterator method
		System.out.println("Iterting through list");
		Iterator<Product> iterator = listProduct.iterator();
		while (iterator.hasNext()) {
			Product prod = (Product) iterator.next();
		    System.out.println(prod.productId);
		}
	}

}
