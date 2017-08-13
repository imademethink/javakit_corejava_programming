package package01_CollectionsUtility;

import java.util.ArrayList;
import java.util.Collections;

// public static void reverse(List<?> list)

public class Method08_Reverse {

	public static void main(String[] args) {

		// reverse Integer type
		ArrayList<Integer> arrayListNumeric = new ArrayList<Integer>();
		arrayListNumeric.add(4);
		arrayListNumeric.add(-4);
		arrayListNumeric.add(9);
		arrayListNumeric.add(22);
		System.out.println("Before reverse Int type Arraylist : " + arrayListNumeric);
		Collections.reverse(arrayListNumeric);
		System.out.println("After reverse Int type Arraylist  : " + arrayListNumeric);

		// reverse String type
		ArrayList<String> arrayListString = new ArrayList<String>();
		arrayListString.add("dfg");
		arrayListString.add("avf");
		arrayListString.add("bbb");
		System.out.println("Before reverse String type Arraylist : " + arrayListString);
		Collections.reverse(arrayListString);
		System.out.println("After reverse String type Arraylist  : " + arrayListString);
		
		// reverse Object type
		ArrayList<Employee> empArrayList = new ArrayList<Employee>();
		empArrayList.add(new Employee(200,"Sheldon",10000));
		empArrayList.add(new Employee(101,"Barney", 20000));
		empArrayList.add(new Employee(102,"Ted", 80000));
		System.out.println("Before reverse Object type empArrayList");
		System.out.println(empArrayList.get(0).empId);
		System.out.println(empArrayList.get(1).empId);
		System.out.println(empArrayList.get(2).empId);
		Collections.reverse(empArrayList);
		System.out.println("After reverse Object type empArrayList");
		System.out.println(empArrayList.get(0).empId);
		System.out.println(empArrayList.get(1).empId);
		System.out.println(empArrayList.get(2).empId);
	}
}
