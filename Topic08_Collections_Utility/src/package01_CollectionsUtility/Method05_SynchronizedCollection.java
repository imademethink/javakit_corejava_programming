package package01_CollectionsUtility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// public static <T> Collection<T> synchronizedCollection(Collection<T> c)

public class Method05_SynchronizedCollection {

	public static void main(String[] args) {
		
		// non thread safe collection (String type)
		ArrayList<String> arrayListStringNonThreadSafe = new ArrayList<String>();
		arrayListStringNonThreadSafe.add("London");
		arrayListStringNonThreadSafe.add("NewYork");
		arrayListStringNonThreadSafe.add("Paris");
		System.out.println("Non thread safe collection ArrayList: " + arrayListStringNonThreadSafe);
		arrayListStringNonThreadSafe.clear();
		
		Collection<String> arrayListStringThreadSafe = Collections.synchronizedCollection(arrayListStringNonThreadSafe);
		arrayListStringThreadSafe.add("Tokyo");
		arrayListStringThreadSafe.add("Shangai");
		arrayListStringThreadSafe.add("Vianna");
		System.out.println("Thread safe collection ArrayList: " + arrayListStringThreadSafe);
		System.out.println("Accessing array-list elements with thread safety");
		// accessing array-list elements with thread safety
		synchronized(arrayListStringThreadSafe) { 
			Iterator<String> iteratorThreadSafe = arrayListStringThreadSafe.iterator();
			while (iteratorThreadSafe.hasNext()) {
				String singleElement = iteratorThreadSafe.next();
				System.out.println(singleElement);
			}
		}
		  

		
		
		
		
		
		
		
		
		// non thread safe collection (Object type)
		ArrayList<Employee> empArrayList = new ArrayList<Employee>();
		empArrayList.add(new Employee(200,"Sheldon",10000));
		empArrayList.add(new Employee(101,"Barney", 20000));
		empArrayList.add(new Employee(102,"Ted", 80000));
		// non thread safe way to access collection 
		System.out.println("\nNon thread safe way to access collection ");
		System.out.println(empArrayList.get(0).empId);
		System.out.println(empArrayList.get(1).empId);
		System.out.println(empArrayList.get(2).empId);
		// Thread safe way to access collection 
		Collection<Employee> empArrayListThreadSafe = Collections.synchronizedCollection(empArrayList);
		System.out.println("Accessing array-list elements with thread safety");
		// accessing array-list elements with thread safety
		synchronized(empArrayListThreadSafe) {
			Iterator<Employee> iteratorThreadSafe = empArrayListThreadSafe.iterator();
			while (iteratorThreadSafe.hasNext()) {
				Employee singleEmployee = iteratorThreadSafe.next();
				System.out.println(singleEmployee.empId);
			}
		}
	}
}
