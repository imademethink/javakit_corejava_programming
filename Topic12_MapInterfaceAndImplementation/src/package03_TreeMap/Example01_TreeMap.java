package package03_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Example01_TreeMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// sorting applied as elements are put/ inserted
		Map<Integer, EmpData> empExample = new TreeMap<Integer, EmpData>() ;
		empExample.put(1, new EmpData("Deirdre","Hart",22.0f));
		empExample.put(9, new EmpData("Martin","Jack",32.0f));
		empExample.put(5, new EmpData("Jane","Single",44.4f));		
		for(Map.Entry m:empExample.entrySet()){
			   System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\n");
		
		// sorting applied as elements are put/ inserted
		Map<String, EmpData> empString = new TreeMap<String, EmpData>() ;
		empString.put("aa", new EmpData("Deirdre","Hart",22.0f));
		empString.put("pp", new EmpData("Martin","Jack",32.0f));
		empString.put("dd", new EmpData("Jane","Single",44.4f));
		for(Map.Entry m:empString.entrySet()){
		   System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\n");
		
		// remove and add another element instantly
		// sorting applied as elements are put/ inserted
		empString.remove("aa");
		empString.put("bb", new EmpData("Jill","Lone",44.4f));
		for(Map.Entry m:empString.entrySet()){
			   System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}
}
