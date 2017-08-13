package package01_QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class Example01_QueueLinkedList {

	public static void main(String[] args) {
		// HashSet example for String type
		Queue<String> queueString = new LinkedList<String>();
		queueString.add("London");
		queueString.add("Paris");
		queueString.add("NewYork");
		System.out.println("Queue example for String : " + queueString.element());
		queueString.remove();
		System.out.println("Queue example for String : " + queueString.element());
		queueString.remove();
		System.out.println("Queue example for String : " + queueString.element());
		queueString.remove();
		queueString.add("London");
		queueString.add("Paris");
		System.out.println("Queue example for String Poll method : " + queueString.poll());

		// Queue LinkedList example for Object type
		Queue<Vehicle> queueLinkedListObject = new LinkedList<Vehicle>();
		queueLinkedListObject.add(new Vehicle(222,"Sheldon",10000));
		queueLinkedListObject.add(new Vehicle(101,"Barney", 20000));
		queueLinkedListObject.add(new Vehicle(100,"Ted", 80000));
		System.out.println("Queue LinkedList example for Object : " + queueLinkedListObject.size());
		int currentSize = queueLinkedListObject.size();
		for(int n=0; n < currentSize; n++){
			Vehicle vehicleTmp = queueLinkedListObject.element();
			queueLinkedListObject.remove();
			System.out.println(vehicleTmp.regId);
		}
	}
}
