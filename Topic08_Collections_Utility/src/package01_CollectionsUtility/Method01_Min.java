package package01_CollectionsUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// public static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp)

public class Method01_Min {

	public static void main(String[] args) {

		// find min Integer type
		ArrayList<Integer> arrayListNumeric = new ArrayList<Integer>();
		arrayListNumeric.add(4);
		arrayListNumeric.add(-4);
		arrayListNumeric.add(9);
		arrayListNumeric.add(22);
		System.out.println("Min val Arraylist Int   : " + 
								Collections.min(arrayListNumeric,null));

		// find min String type
		ArrayList<String> arrayListString = new ArrayList<String>();
		arrayListString.add("aaa");
		arrayListString.add("c");
		arrayListString.add("d");
		System.out.println("Min val Arraylist String : " + 
								Collections.min(arrayListString,null)); 
		
		// find min Object type
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

		Employee min = Collections.min(empArrayList, comparatorEmpId);
		System.out.println("\nFind Object with min empId : ");
		System.out.println(min.empId);
		System.out.println(min.name);
		System.out.println(min.salary);
	}
}
