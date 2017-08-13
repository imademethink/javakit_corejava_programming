package package02_PriorityQueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example02_PriorityQueue {

	public static void main(String[] args) {
		Comparator<String> comparatorString = new Comparator<String>() {
		    public int compare(String s1, String s2) {
		        if (s1.length() < s2.length()) return -1;
		        else                           return 1;
		    }
		};
		
		// Priority Queue example for String type
		Queue<String> priorityQString = new PriorityQueue<String>(5,comparatorString);
		priorityQString.add("London");
		priorityQString.add("Paris");
		priorityQString.add("NewYork");
		System.out.println("Queue example for String : " + priorityQString.element());
		priorityQString.remove();
		System.out.println("Queue example for String : " + priorityQString.element());
		priorityQString.remove();
		System.out.println("Queue example for String : " + priorityQString.element());
		priorityQString.remove();
		priorityQString.add("London");
		priorityQString.add("Paris");
		System.out.println("Queue example for String Poll method : " + priorityQString.poll());


		
		// Priority Queue example for Object type
		Comparator<Vehicle> comparatorObject = new Comparator<Vehicle>() {
		    public int compare(Vehicle v1, Vehicle v2) {
		        return (v1.regId - v2.regId);
		    }
		};
		
		Queue<Vehicle> priorityQObj = new PriorityQueue<Vehicle>(5,comparatorObject);
		priorityQObj.add(new Vehicle(222,"Bugati",10000));
		priorityQObj.add(new Vehicle(101,"AstonMartin", 20000));
		priorityQObj.add(new Vehicle(100,"Toyota", 80000));
		System.out.println("Priority Queue example for Object : " + priorityQObj.size());
	    while (priorityQObj.size() != 0){
	    	Vehicle vTmp = (Vehicle) priorityQObj.remove();
	       System.out.printf("%s\n",vTmp.regId);
	    }
	}
}
