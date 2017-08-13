package package05_Other;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Person{
	String  firstName;
	String  secondName;
	String  address;
	public Person(String first_Name, String second_Name, String  address2){
				this.firstName = first_Name;
				this.secondName = second_Name; 
				this.address = address2;
	}
}

// iterating through HashMap
public class Example01_HashMap_Iterating {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		HashMap<String, Person> personal = new HashMap<String, Person>() ;
		personal.put("aa", new Person("James", "Bond", "London"));
		personal.put("bb", new Person("Jack", "Sparrow", "NeyYork"));
		personal.put("cc", new Person("Jackie", "Chan", "Beijing"));
		
		// iterating using Map.Entry way
		for(Map.Entry<String, Person>  mapEntrySngle :  personal.entrySet()){
			String citizenid = mapEntrySngle.getKey();
			Person p = mapEntrySngle.getValue();
			System.out.println(citizenid + ": " +  p.firstName + ": " + p.secondName + " : " + p.address);
		}
		System.out.println("\n\n");
		
		// iterating using Map.Entry way + iterator
       Set setPersonal = personal.entrySet();
       Iterator itr = setPersonal.iterator();
       while(itr.hasNext()) {
	          Map.Entry mapEntrySngle = (Map.Entry)itr.next();
	          System.out.print("Key is: "+mapEntrySngle.getKey() + " & Value is: ");
	          Person p = (Person) mapEntrySngle.getValue();
			  System.out.println(p.firstName + ": " + p.secondName + " : " + p.address);
       }

	}
}
