package package01_ListInterfaceArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example01_ArrayList {

	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>(3);
		// add method
		listString.add("Shirt");
		listString.add("Pant");
		listString.add("Belt");
		System.out.println("List of type String : " + listString);
		List<String> listStringTmp = new ArrayList<String>();
		listStringTmp.add("Perfume");
		listStringTmp.add("Tie");

		// addAll method
		listString.addAll(listStringTmp);
		System.out.println("List of type String after addition : " + listString);
		
		// get method
		listString.get(0);
		System.out.println("Get element at specified index : " + listString.get(0));
		
		// set method
		listString.set(0, "Shirt_New");
		System.out.println("Set element at specified index : " + listString.get(0));
		
		// remove method
		System.out.println("Remove element at specified index");
		System.out.println("Size before remove : " + listString.size());
		listString.remove(0);
		System.out.println("Size after remove  : " + listString.size());

		// iterator method
		System.out.println("Iterting through list");
		Iterator<String> iterator = listString.iterator();
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}
	}

}
