package package02_SortedSetInterface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Example03_TreeSet {

	public static void main(String[] args) {
		// LinkedHashSet example for String type
		Set<String> treeSetString = new TreeSet<String>();
		treeSetString.add("NewYork");
		treeSetString.add("London");
		treeSetString.add("Paris");
		System.out.println("TreeSet example for String : " + treeSetString);

		Comparator<Account> comparatorAccId = new Comparator<Account>() {
		    public int compare(Account acc1, Account acc2) {
		    	return (acc1.accId - acc2.accId);
		    }
		};

		// LinkedHashSet example for Object type
		Set<Account> treeSetObject = new TreeSet<Account>(comparatorAccId);
		treeSetObject.add(new Account(222,"Sheldon",10000));
		treeSetObject.add(new Account(101,"Barney", 20000));
		treeSetObject.add(new Account(102,"Ted", 80000));
		System.out.println("TreeSet example for Object : ");
		System.out.println(" Note - insertion order is sorted based on accId");
		Iterator<Account> iteratorHashSet = treeSetObject.iterator();
		while (iteratorHashSet.hasNext()) {
			Account singleAcct = iteratorHashSet.next();
			System.out.println(singleAcct.accId);
		}		
	}
}
