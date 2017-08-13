package package01_CollectionsUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

// public static void shuffle(List<?> list)

public class Method04_Shuffle {

	public static void main(String[] args) {

		// shuffle Integer type
		ArrayList<Integer> arrayListNumeric = new ArrayList<Integer>();
		arrayListNumeric.add(4);
		arrayListNumeric.add(-4);
		arrayListNumeric.add(9);
		arrayListNumeric.add(22);
		System.out.println("Before shuffling Int type Arraylist : " + arrayListNumeric);
		Collections.shuffle(arrayListNumeric);
		System.out.println("After shuffling Int type Arraylist  : " + arrayListNumeric);

		// sort String type
		ArrayList<String> arrayListString = new ArrayList<String>();
		arrayListString.add("dfg");
		arrayListString.add("avf");
		arrayListString.add("bbb");
		System.out.println("Before shuffling String type Arraylist : " + arrayListString);
		Collections.shuffle(arrayListString);
		System.out.println("After shuffling String type Arraylist  : " + arrayListString);
		
		// shuffle Object type
		ArrayList<Employee> empArrayList = new ArrayList<Employee>();
		empArrayList.add(new Employee(200,"Sheldon",10000));
		empArrayList.add(new Employee(101,"Barney", 20000));
		empArrayList.add(new Employee(102,"Ted", 80000));

		@SuppressWarnings("unused")
		Comparator<Employee> comparatorEmpId = new Comparator<Employee>() {
		    public int compare(Employee emp1, Employee emp2) {
		    	return (emp1.empId - emp2.empId);
		    }
		};
		
		Collections.shuffle(empArrayList,new Random(2));
		System.out.println("\nFind Object with shuffled based on empId : ");
		System.out.println(empArrayList.get(0).empId);
		System.out.println(empArrayList.get(0).name);
		System.out.println(empArrayList.get(0).salary);
	}
}
