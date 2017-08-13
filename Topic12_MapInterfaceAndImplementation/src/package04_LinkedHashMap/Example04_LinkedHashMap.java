package package04_LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class CabDriver{
	String  firstName;
	String  secondName;
	String  address;
	public CabDriver(String first_Name, String second_Name, String  address2){
				this.firstName = first_Name;
				this.secondName = second_Name; 
				this.address = address2;
	}
}


// LinkedHashMap maintains order of elements inserted
public class Example04_LinkedHashMap {

	public static void main(String[] args) {
		HashMap<String, CabDriver> cabDriveGroup = new HashMap<String, CabDriver>() ;
		System.out.println("Adding with id : " +  "pp");
		cabDriveGroup.put("pp", new CabDriver("James", "Bond", "London"));
		System.out.println("Adding with id : " +  "zz");
		cabDriveGroup.put("zz", new CabDriver("Jack", "Sparrow", "NeyYork"));
		System.out.println("Adding with id : " +  "tt");
		cabDriveGroup.put("tt", new CabDriver("Jackie", "Chan", "Beijing"));
		
		System.out.println("Order of elements entered not maintained in HashMap ");
		for(Map.Entry<String, CabDriver>  mapEntrySngleCaby :  cabDriveGroup.entrySet()){
			String citizenid = mapEntrySngleCaby.getKey();
			CabDriver cd = mapEntrySngleCaby.getValue();
			System.out.println(citizenid + ": " +  cd.firstName + ": " + cd.secondName + " : " + cd.address);
		}
		System.out.println("\n\n");
		
		
		
		
		HashMap<String, CabDriver> cabDriveGroup2 = new LinkedHashMap<String, CabDriver>() ;
		System.out.println("Adding with id : " +  "pp");
		cabDriveGroup2.put("pp", new CabDriver("James", "Bond", "London"));
		System.out.println("Adding with id : " +  "zz");
		cabDriveGroup2.put("zz", new CabDriver("Jack", "Sparrow", "NeyYork"));
		System.out.println("Adding with id : " +  "tt");
		cabDriveGroup2.put("tt", new CabDriver("Jackie", "Chan", "Beijing"));
		
		System.out.println("Order of elements entered maintained in LinkedHashMap ");
		for(Map.Entry<String, CabDriver>  mapEntrySngleCaby :  cabDriveGroup2.entrySet()){
			String citizenid = mapEntrySngleCaby.getKey();
			CabDriver cd = mapEntrySngleCaby.getValue();
			System.out.println(citizenid + ": " +  cd.firstName + ": " + cd.secondName + " : " + cd.address);
		}
	}
}
