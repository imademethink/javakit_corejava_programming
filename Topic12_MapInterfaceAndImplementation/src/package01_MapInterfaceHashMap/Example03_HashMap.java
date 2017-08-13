package package01_MapInterfaceHashMap;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Example03_HashMap {
	
	// Allowed value types
	public static void main(String[] args) {
		Map<String, Object> map1= new HashMap<String, Object>();
		map1.put("k1","value1");
		map1.put("k2", null);                                // null value allowed
		map1.put("k3","");                                    // empty value allowed
		map1.put("k4",new File("abc.txt"));        // derived object type
		map1.put("k5",new Employee(501,"Frank Underwood", 99999));        // custom object type
		System.out.println( "k1: " + map1.get("k1"));
		System.out.println( "k2: " + map1.get("k2"));
		System.out.println( "k3: " + map1.get("k3"));		
		System.out.println( "k4: " + map1.get("k4"));
		System.out.println( "k5: " + map1.get("k5"));
		

	}
}
