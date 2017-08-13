package package01_CollectionInterfaceMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class HRemployee{
	int      empId;
	String   name;
	int      salary;
	public HRemployee(int empId2, 
			        String name2, 
			        int salary2){
		this.empId = empId2;
		this.name = name2; 
		this.salary = salary2;				
	}
}

//Collection - ArrayList using custom Object type 
public class Example02_ArrayList {

	public static void main(String[] args) {
		Collection<HRemployee> arrayList = new ArrayList<HRemployee>();
		// add method
		arrayList.add(new HRemployee(100,"Sheldon",10000));
		arrayList.add(new HRemployee(101,"Barney", 20000));
		arrayList.add(new HRemployee(102,"Ted", 80000));
		System.out.println(arrayList.size());

		ArrayList<HRemployee> arrTemp = new ArrayList<HRemployee>();
		arrTemp.add(new HRemployee(200,"James",10000));
		arrTemp.add(new HRemployee(201,"Adam", 20000));
		arrTemp.add(new HRemployee(202,"July", 80000));

		// addAll method
		arrayList.addAll(arrTemp);
		System.out.println(arrayList.size());
		
		// remove method (by Object) (need to type-cast to an Object)
		HRemployee tempHR =  new HRemployee(103,"Marshal", 20000);
		arrayList.add(tempHR);
		System.out.println(arrayList.size());
		System.out.println(arrayList.remove((Object)tempHR));
		System.out.println(arrayList.size());

		// removeAll methods
		arrayList.removeAll(arrTemp);
		System.out.println(arrayList.size());
		
		// contains method
		HRemployee tempHR2 =  new HRemployee(104,"Lily", 20000);
		arrayList.add(tempHR2);
		System.out.println("ArrayList contains : " + arrayList.contains(tempHR2));

		// containsAll method
		arrayList.addAll(arrTemp);
		System.out.println(arrayList.size());
		System.out.println("ArrayList contains all : " + arrayList.containsAll(arrTemp));
		
		// clear method
		arrTemp.clear();
		
		// isEmpty method
		System.out.println("ArrayList (temp) is empty : " + arrTemp.isEmpty());
		
		arrTemp.add(new HRemployee(200,"James",10000));
		arrTemp.add(new HRemployee(201,"Adam", 20000));
		arrTemp.add(new HRemployee(202,"July", 80000));
		
		// hashCode method
		arrayList.hashCode();
		System.out.println("ArrayList hashcode : " + arrayList.hashCode());
		
		// equals method
		arrayList.clear();
		arrTemp.clear();
		arrTemp.add(new HRemployee(200,"James",10000));
		arrTemp.add(new HRemployee(201,"Adam", 20000));
		arrTemp.add(new HRemployee(202,"July", 80000));
		arrayList.addAll(arrTemp);
		System.out.println("ArrayList equals : " + arrayList.equals(arrTemp));

		arrayList.toArray();
		// toArray method
		HRemployee hrEmpArrList[] = new HRemployee[arrayList.size()];
		hrEmpArrList              = arrayList.toArray(hrEmpArrList);
		System.out.println("ArrayList toArray : ");
	    for (HRemployee oneHREmp : hrEmpArrList) {
    		System.out.println("Single element with toArray() method = " + 
    					oneHREmp.empId + " " + oneHREmp.name + " " + oneHREmp.salary);
    	}
    	System.out.println("\n");

	    
	    // iterator method
	    @SuppressWarnings("rawtypes")
		Iterator itr = arrayList.iterator();  
	    while(itr.hasNext()){
	    	HRemployee oneHREmp = (HRemployee) itr.next();
    		System.out.println("Single element with iterator() method = " + 
					oneHREmp.empId + " " + oneHREmp.name + " " + oneHREmp.salary);
	    } 
	    System.out.println("\n");
	}
}
