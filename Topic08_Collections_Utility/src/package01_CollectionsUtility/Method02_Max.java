package package01_CollectionsUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// public static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp)

public class Method02_Max {

	public static void main(String[] args) {

		// find max Integer type
		ArrayList<Integer> arrayListNumeric = new ArrayList<Integer>();
		arrayListNumeric.add(4);
		arrayListNumeric.add(-4);
		arrayListNumeric.add(9);
		arrayListNumeric.add(22);
		System.out.println("Max val Arraylist Int   : " + 
								Collections.max(arrayListNumeric,null));

		// find max String type
		ArrayList<String> arrayListString = new ArrayList<String>();
		arrayListString.add("aaa");
		arrayListString.add("c");
		arrayListString.add("d");
		System.out.println("Max val Arraylist String : " + 
								Collections.max(arrayListString,null)); 
		
		// find max Object type
		ArrayList<Employee> empArrayList = new ArrayList<Employee>();
		empArrayList.add(new Employee(100,"Sheldon",10000));
		empArrayList.add(new Employee(101,"Barney", 20000));
		empArrayList.add(new Employee(102,"Ted", 80000));

		Comparator<Employee> comparatorEmpId = new Comparator<Employee>() {
		    public int compare(Employee emp1, Employee emp2) {
		    	if (emp1.empId > emp2.empId) return emp1.empId;
		    	else return emp2.empId;		    	
		    }
		};
		
		Employee max = Collections.max(empArrayList, comparatorEmpId);
		System.out.println("\nFind Object with max empId : ");
		System.out.println(max.empId);
		System.out.println(max.name);
		System.out.println(max.salary);
	}
}
