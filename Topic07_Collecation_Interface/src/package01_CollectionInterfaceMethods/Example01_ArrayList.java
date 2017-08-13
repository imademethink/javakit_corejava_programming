package package01_CollectionInterfaceMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Collection - ArrayList using normal data member
public class Example01_ArrayList {

	public static void main(String[] args) {
		Collection<String> arrayList = new ArrayList<String>();
		// add method
		arrayList.add("A01");
		arrayList.add("A02");
		arrayList.add("A03");
		System.out.println("ArrayList : " + arrayList);
		ArrayList<String> arrTemp = new ArrayList<String>();
		arrTemp.add("B01");
		arrTemp.add("B02");
		arrTemp.add("B03");
		
		// addAll method
		arrayList.addAll(arrTemp);
		System.out.println("ArrayList : " + arrayList);
		
		// remove method (by Object)
		arrayList.remove("A03");
		System.out.println("ArrayList : " + arrayList);
		
		// removeAll method
		arrayList.removeAll(arrTemp);
		System.out.println("ArrayList : " + arrayList);
		
		// contains method
		arrayList.contains("B03");
		System.out.println("ArrayList contains : " + arrayList.contains("B03"));

		// containsAll method
		arrayList.containsAll(arrTemp);
		System.out.println("ArrayList contains all : " + arrayList.containsAll(arrTemp));
		
		// clear method
		arrTemp.clear();
		arrTemp.add("B01");
		arrTemp.add("B02");
		arrTemp.add("B03");
		
		// isEmpty method
		arrayList.isEmpty();
		System.out.println("ArrayList is empty : " + arrayList.isEmpty());
		
		// hashCode method
		arrayList.hashCode();
		System.out.println("ArrayList hashCode : " + arrayList.hashCode());
		
		// equals method
		arrayList.clear();
		arrayList.addAll(arrTemp);
		arrayList.equals(arrTemp);
		System.out.println("ArrayList equals : " + arrayList.equals(arrTemp));

		// toArray method
		String stringArraytList[] = new String[arrayList.size()];
		stringArraytList = arrayList.toArray(stringArraytList);
		System.out.println("ArrayList toArray : ");
	    for (String oneString : stringArraytList) {
	    	System.out.println("Single element with toArray() method = " + oneString);
	    }
	    System.out.println("\n");
	    
	    // iterator method
	    @SuppressWarnings("rawtypes")
		Iterator itr = arrayList.iterator();  
	    while(itr.hasNext()){
	    	System.out.println("Single element with iterator method = " + itr.next());
	    }
	    System.out.println("\n");

	    // remove method (by index)
	    arrTemp.remove(0);

	    // retainAll method
	    arrayList.retainAll(arrTemp);
	    @SuppressWarnings("rawtypes")
		Iterator itr2 = arrayList.iterator();  
	    while(itr2.hasNext()){
	    	System.out.println("Single element with iterator method = " + itr2.next());
	    }
	    System.out.println("\n");
	}
}
