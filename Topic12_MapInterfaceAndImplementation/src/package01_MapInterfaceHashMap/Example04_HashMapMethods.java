package package01_MapInterfaceHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Citizen{
	String  firstName;
	String  secondName;
	String  address;
	public Citizen(String first_Name, String second_Name, String  address2){
				this.firstName = first_Name;
				this.secondName = second_Name; 
				this.address = address2;
	}
}


// HashMap important methods
public class Example04_HashMapMethods {

	public static void main(String[] args) {

		String [] citizenId = new String [10];
		for (int n=0; n<10; n++){
			citizenId[n] = AnyId.getRandomAlphanumericAnyId();
		}
		
		HashMap<String, Citizen> citizenSingle = new HashMap<String, Citizen>() ;
		
		// put method
		citizenSingle.put(citizenId[0], new Citizen("James", "Bond", "London"));
		citizenSingle.put(citizenId[1], new Citizen("Jack", "Sparrow", "NeyYork"));
		citizenSingle.put(citizenId[2], new Citizen("Jackie", "Chan", "Beijing"));
		
		// putAll method
		HashMap<String, Citizen> citizenTemp = new HashMap<String, Citizen>() ;
		citizenTemp.put(citizenId[3], new Citizen("Amir", "Khan", "Mumbai"));		
		citizenTemp.put(citizenId[4], new Citizen("Robert", "DownyJr", "Los Angeles"));		
		citizenSingle.putAll(citizenTemp);

		// get method
		Citizen citizenGet= citizenSingle.get(citizenId[4]);
		System.out.println(citizenGet.firstName);
		System.out.println(citizenGet.secondName);
		System.out.println(citizenGet.address);
		System.out.println("\n");
		
		// size method
		System.out.println( citizenSingle.size()  +"\n");
		
		// remove method
		citizenSingle.remove(citizenId[4]);
		System.out.println( citizenSingle.size()  +"\n");
		
		// containsKey method
		System.out.println( citizenSingle.containsKey(citizenId[3])  +"\n");
		
		// clear method
		System.out.println(citizenTemp.size());
		citizenTemp.clear();
		System.out.println(citizenTemp.size()  +"\n");
		
		// keySet method
		Set<String> citizenSingleKeys =   citizenSingle.keySet();
		System.out.println(citizenSingleKeys.size());
		for (String kKey : citizenSingleKeys){
			System.out.println(kKey);
		}
		
		// values method
		Collection<Citizen> citizenSingleValues =   citizenSingle.values();
		for (Citizen vValue : citizenSingleValues){
			System.out.println(vValue.firstName);
		}

		// entrySet method
		for(Map.Entry<String, Citizen>  mapEntrySngle :  citizenSingle.entrySet()){
			String citizenid = mapEntrySngle.getKey();
			Citizen c = mapEntrySngle.getValue();
			System.out.println(citizenid + ": " +  c.firstName + ": " + c.secondName + " : " + c.address);
		}
		
		
	}
}
