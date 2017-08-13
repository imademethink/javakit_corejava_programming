package package01_CollectionInterfaceMethods;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// Collection - HashSet using normal data member
public class Example04_HashSet {

	public static void main(String[] args) {
		Collection<String> hashSet = new HashSet<String>();
		// add method
		hashSet.add("A01");
		hashSet.add("A02");
		hashSet.add("A03");
		System.out.println("Hash Set : " + hashSet);
		HashSet<String> hashSetTemp = new HashSet<String>();
		hashSetTemp.add("B01");
		hashSetTemp.add("B02");
		hashSetTemp.add("B03");
		
		// addAll method
		hashSet.addAll(hashSetTemp);
		System.out.println("Hash Set : " + hashSet);
		
		// remove method (by Object)
		hashSet.remove("A03");
		System.out.println("Hash Set : " + hashSet);
		
		// removeAll method
		hashSet.removeAll(hashSetTemp);
		System.out.println("Hash Set : " + hashSet);
		
		// contains method
		hashSet.contains("A03");
		System.out.println("Hash Set contains : " + hashSet.contains("A03"));

		// containsAll method
		hashSet.containsAll(hashSetTemp);
		System.out.println("Hash Set contains all : " + hashSet.containsAll(hashSetTemp));
		
		// clear method
		hashSetTemp.clear();
		hashSetTemp.add("B01");
		hashSetTemp.add("B02");
		hashSetTemp.add("B03");
		
		// isEmpty method
		hashSet.isEmpty();
		System.out.println("Hash Set is empty : " + hashSet.isEmpty());
		
		// hashCode method
		hashSet.hashCode();
		System.out.println("Hash Set hashCode : " + hashSet.hashCode());
		
		// equals method
		hashSet.clear();
		hashSet.addAll(hashSetTemp);
		hashSet.equals(hashSetTemp);
		System.out.println("Hash Set equals : " + hashSet.equals(hashSetTemp));

		// toArray method
		String stringHashSetList[] = new String[hashSet.size()];
		stringHashSetList = hashSet.toArray(stringHashSetList);
		System.out.println("Hash Set toArray : ");
	    for (String oneString : stringHashSetList) {
	    	System.out.println("Single element with toArray() method = " + oneString);
	    }
	    System.out.println("\n");
	    
	    // iterator method
	    @SuppressWarnings("rawtypes")
		Iterator itr = hashSet.iterator();  
	    while(itr.hasNext()){
	    	System.out.println("Single element with iterator method = " + itr.next());
	    }
	    System.out.println("\n");

	    // remove method (by index)
	    hashSetTemp.remove(0);

	    // retainAll method
	    hashSet.retainAll(hashSetTemp);
	    @SuppressWarnings("rawtypes")
		Iterator itr2 = hashSet.iterator();  
	    while(itr2.hasNext()){
	    	System.out.println("Single element with iterator method = " + itr2.next());
	    }
	    System.out.println("\n");
	}
}
