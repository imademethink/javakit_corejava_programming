package package01_CollectionsUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// public static <T> int binarySearch(List<? extends Comparable<? super T>> list,   T key)
// If key is not present, the it returns "(-(insertion point) - 1)". 
// The insertion point is defined as the point at which the key 
// would be inserted into the list.

public class Method06_BinarySearch {

	public static void main(String[] args) {
		int index = 0;
		// search Integer type
		ArrayList<Integer> arrayListNumeric = new ArrayList<Integer>();
		arrayListNumeric.add(4);
		arrayListNumeric.add(-4);
		arrayListNumeric.add(9);
		arrayListNumeric.add(22);
		System.out.println("Arraylist integer type : " + arrayListNumeric);
		index = Collections.binarySearch(arrayListNumeric, 9);
		System.out.println("Arraylist index for 9 element  : " + index);
		index = Collections.binarySearch(arrayListNumeric,5);
		System.out.println("Arraylist index for 5 element : " + index);

		// search String type
		ArrayList<String> arrayListString = new ArrayList<String>();
		arrayListString.add("London");
		arrayListString.add("Dublin");
		arrayListString.add("Birmingham");
		System.out.println("Arraylist String type : " + arrayListString);
		index = Collections.binarySearch(arrayListString, "Dublin");
		System.out.println("Arraylist String for Dublin element  : " + index);
		index = Collections.binarySearch(arrayListString,"Sydney");
		System.out.println("Arraylist String for Sydney element : " + index);

		// search Object type
		ArrayList<Employee> empArrayList = new ArrayList<Employee>();
		empArrayList.add(new Employee(200,"Sheldon",10000));
		empArrayList.add(new Employee(101,"Barney", 20000));
		empArrayList.add(new Employee(102,"Ted", 80000));
		
		Comparator<Employee> comparatorEmpId = new Comparator<Employee>() {
		    public int compare(Employee emp1, Employee emp2) {
		    	return (emp1.empId - emp2.empId);
		    }
		};
		index = Collections.binarySearch(
					empArrayList,
					new Employee(102,"Ted", 80000),
					comparatorEmpId);
		System.out.println("Arraylist Object for 102,'Ted', 80000 element : " + index);
		index = Collections.binarySearch(
					empArrayList,
					new Employee(500,"Ranjeet", 5000),
					comparatorEmpId);
		System.out.println("Arraylist Object for 500,'Ranjeet', 5000 element : " + index);		
	}
}
