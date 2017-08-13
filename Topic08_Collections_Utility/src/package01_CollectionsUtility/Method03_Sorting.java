package package01_CollectionsUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// public static <T extends Comparable<? super T>> void sort(List<T> list)

public class Method03_Sorting {

	public static void main(String[] args) {

		// sort Integer type
		ArrayList<Integer> arrayListNumeric = new ArrayList<Integer>();
		arrayListNumeric.add(4);
		arrayListNumeric.add(-4);
		arrayListNumeric.add(9);
		arrayListNumeric.add(22);
		System.out.println("Before sorting Int type Arraylist : " + arrayListNumeric);
		Collections.sort(arrayListNumeric);
		System.out.println("After sorting Int type Arraylist  : " + arrayListNumeric);

		// sort String type
		ArrayList<String> arrayListString = new ArrayList<String>();
		arrayListString.add("dfg");
		arrayListString.add("avf");
		arrayListString.add("bbb");
		System.out.println("Before sorting Int type Arraylist : " + arrayListString);
		Collections.sort(arrayListString);
		System.out.println("After sorting Int type Arraylist  : " + arrayListString);
		
		// sort Object type
		ArrayList<Employee> empArrayList = new ArrayList<Employee>();
		empArrayList.add(new Employee(200,"Sheldon",10000));
		empArrayList.add(new Employee(101,"Barney", 20000));
		empArrayList.add(new Employee(102,"Ted", 80000));

		Comparator<Employee> comparatorEmpId = new Comparator<Employee>() {
		    public int compare(Employee emp1, Employee emp2) {
		    	return (emp1.empId - emp2.empId);
		    }
		};
		
		Collections.sort(empArrayList, comparatorEmpId);
		System.out.println("\nFind Object with sorted based on empId : ");
		System.out.println(empArrayList.get(0).empId);
		System.out.println(empArrayList.get(0).name);
		System.out.println(empArrayList.get(0).salary);
	}
}
