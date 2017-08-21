package package01_MapInterfaceHashMap;

import java.util.HashMap;
import java.util.Map;

public class Example02_HashMap {
	
	// Allowed key types another example
	public static void main(String[] args) {
		Map<String, String> map1= new HashMap<String, String>();
		map1.put("k1","value1");
		map1.put(null,"value2");     // null key allowed
		map1.put("","value3");        // empty key allowed
		System.out.println( map1.get("k1"));
		System.out.println( map1.get(null));
		System.out.println( map1.get(""));
		System.out.println( map1.size());
		
		// duplicate key
		map1.put("k1","value11");    // duplicate key allowed
		map1.put(null,"value22");     // duplicate key over write existing key
		map1.put("","value33"); 
		System.out.println( map1.get("k1"));
		System.out.println( map1.get(null));
		System.out.println( map1.get(""));
		System.out.println( map1.size());
	}
}
