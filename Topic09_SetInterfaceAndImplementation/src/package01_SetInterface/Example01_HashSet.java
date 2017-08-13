package package01_SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example01_HashSet {

	public static void main(String[] args) {
		// HashSet example for String type
		Set<String> hashSetString = new HashSet<String>();
		hashSetString.add("London");
		hashSetString.add("Paris");
		hashSetString.add("NewYork");
		System.out.println("HastSet example for String : " + hashSetString);

		// HashSet example for Object type
		Set<Account> hashSetObject = new HashSet<Account>();
		hashSetObject.add(new Account(222,"Sheldon",10000));
		hashSetObject.add(new Account(101,"Barney", 20000));
		hashSetObject.add(new Account(102,"Ted", 80000));
		System.out.println("HastSet example for Object : ");
		System.out.println(" Note - insertion order is not maintained or it is random");
		Iterator<Account> iteratorHashSet = hashSetObject.iterator();
		while (iteratorHashSet.hasNext()) {
			Account singleAcct = iteratorHashSet.next();
			System.out.println(singleAcct.accId);
		}
	}
}
