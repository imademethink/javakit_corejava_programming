package package01_CollectionsUtility;

import java.util.ArrayList;
import java.util.Collections;

// public static boolean disjoint(Collection<?> c1,Collection<?> c2)

public class Method07_Disjoint {

	public static void main(String[] args) {
		boolean ifDisjoint = false;
		
		// disjoint check for Integer type
		ArrayList<Integer> arrayListNumeric1 = new ArrayList<Integer>();
		arrayListNumeric1.add(4);
		arrayListNumeric1.add(-4);
		arrayListNumeric1.add(9);
		arrayListNumeric1.add(22);
		System.out.println("Arraylist integer type : " + arrayListNumeric1);
		ArrayList<Integer> arrayListNumeric2 = new ArrayList<Integer>();
		arrayListNumeric2.add(8);
		arrayListNumeric2.add(-3);
		arrayListNumeric2.add(100);
		arrayListNumeric2.add(-522);
		System.out.println("Arraylist integer type : " + arrayListNumeric2);		
		ifDisjoint = Collections.disjoint(arrayListNumeric1, arrayListNumeric2);
		System.out.println("Disjoint check integer type: " + ifDisjoint);

		// disjoint check for String type
		ArrayList<String> arrayListString1 = new ArrayList<String>();
		arrayListString1.add("London");
		arrayListString1.add("Dublin");
		arrayListString1.add("Birmingham");
		System.out.println("Arraylist String type : " + arrayListString1);
		ArrayList<String> arrayListString2 = new ArrayList<String>();
		arrayListString2.add("London");
		arrayListString2.add("Dublin");
		arrayListString2.add("Birmingham");
		System.out.println("Arraylist String type : " + arrayListString2);
		ifDisjoint = Collections.disjoint(arrayListString1, arrayListString2);
		System.out.println("Disjoint check String type: " + ifDisjoint);

		// disjoint check for Object type
		ArrayList<Employee> empArrayList1 = new ArrayList<Employee>();
		empArrayList1.add(new Employee(200,"Sheldon",10000));
		empArrayList1.add(new Employee(101,"Barney", 20000));
		empArrayList1.add(new Employee(102,"Ted", 80000));
		ArrayList<Employee> empArrayList2 = new ArrayList<Employee>();
		empArrayList2.add(new Employee(200,"Sheldon",10000));
		empArrayList2.add(new Employee(101,"Barney", 20000));
		empArrayList2.add(new Employee(102,"Ted", 80000));
		ifDisjoint = Collections.disjoint(empArrayList1, empArrayList2);
		System.out.println("Disjoint check Object type: " + ifDisjoint);
	}
}
