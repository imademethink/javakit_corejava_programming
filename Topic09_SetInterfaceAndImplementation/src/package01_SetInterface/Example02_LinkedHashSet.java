package package01_SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example02_LinkedHashSet {

	public static void main(String[] args) {
		// LinkedHashSet example for String type
		Set<String> linkedHashSetString = new LinkedHashSet<String>();
		linkedHashSetString.add("London");
		linkedHashSetString.add("Paris");
		linkedHashSetString.add("NewYork");
		System.out.println("LinkedHastSet example for String : " + linkedHashSetString);

		// LinkedHashSet example for Object type
		Set<Account> linkedHashSetObject = new LinkedHashSet<Account>();
		linkedHashSetObject.add(new Account(222,"Sheldon",10000));
		linkedHashSetObject.add(new Account(101,"Barney", 20000));
		linkedHashSetObject.add(new Account(102,"Ted", 80000));
		System.out.println("LinkedHastSet example for Object : ");
		System.out.println(" Note - insertion order is maintained");
		Iterator<Account> iteratorHashSet = linkedHashSetObject.iterator();
		while (iteratorHashSet.hasNext()) {
			Account singleAcct = iteratorHashSet.next();
			System.out.println(singleAcct.accId);
		}
	}
}
