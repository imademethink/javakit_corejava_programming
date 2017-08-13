package package01_CollectionInterfaceMethods;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

// Collection - PriorityQueue using normal data member
public class Example03_PriorityQueue {

	public static void main(String[] args) {
		Collection<String> priorityQ = new PriorityQueue<String>();
		// add method
		priorityQ.add("A01");
		priorityQ.add("A02");
		priorityQ.add("A03");
		System.out.println("priorityQ : " + priorityQ);
		Collection<String> priorityQtmp = new PriorityQueue<String>();
		priorityQtmp.add("B01");
		priorityQtmp.add("B02");
		priorityQtmp.add("B03");
		
		// addAll method
		priorityQ.addAll(priorityQtmp);
		System.out.println("priorityQ : " + priorityQ);
		
		// remove method (by Object)
		priorityQ.remove("A03");
		System.out.println("priorityQ : " + priorityQ);
		
		// removeAll method
		priorityQ.removeAll(priorityQtmp);
		System.out.println("priorityQ : " + priorityQ);
		
		// contains method
		priorityQ.contains("A01");
		System.out.println("priorityQ contains : " + priorityQ.contains("A01"));

		// containsAll method
		priorityQ.addAll(priorityQtmp);
		priorityQ.containsAll(priorityQtmp);
		System.out.println("priorityQ contains all : " + priorityQ.containsAll(priorityQtmp));
		
		// clear method
		priorityQtmp.clear();
		
		// isEmpty method
		priorityQtmp.isEmpty();
		System.out.println("priorityQ is empty : " + priorityQtmp.isEmpty());
		
		priorityQtmp.add("B01");
		priorityQtmp.add("B02");
		priorityQtmp.add("B03");

		// hashCode method
		priorityQ.hashCode();
		System.out.println("priorityQ hashCode : " + priorityQ.hashCode());
		
		// equals method
		priorityQ.clear();
		priorityQ.addAll(priorityQtmp);
		priorityQ.equals(priorityQtmp);
		System.out.println("priorityQ equals : " + priorityQ.equals(priorityQtmp));

		// toArray method
		String stringArraytList[] = new String[priorityQ.size()];
		stringArraytList = priorityQ.toArray(stringArraytList);
		System.out.println("priorityQ toArray : ");
	    for (String oneString : stringArraytList) {
	    	System.out.println("Single element with toArray() method = " + oneString);
	    }
	    System.out.println("\n");
	    
	    // iterator method
	    @SuppressWarnings("rawtypes")
		Iterator itr = priorityQ.iterator();  
	    while(itr.hasNext()){
	    	System.out.println("Single element with iterator method = " + itr.next());
	    }
	    System.out.println("\n");

	    // remove method (by index)
	    priorityQtmp.remove(0);

	    // retainAll method
	    priorityQ.retainAll(priorityQtmp);
	    @SuppressWarnings("rawtypes")
		Iterator itr2 = priorityQ.iterator();  
	    while(itr2.hasNext()){
	    	System.out.println("Single element with iterator method = " + itr2.next());
	    }
	    System.out.println("\n");
	}
}
