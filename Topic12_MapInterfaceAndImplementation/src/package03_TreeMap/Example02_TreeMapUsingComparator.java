package package03_TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Example02_TreeMapUsingComparator {

	@SuppressWarnings("rawtypes")
    public static void main(String a[]){
        //the treemap sorts by key - ascending order per the implemented comparator
        TreeMap<String, EmpData> empExample = new TreeMap<String, EmpData>(new ComparatorAscending());
		empExample.put("ddd", new EmpData("Deirdre","Hart",22.0f));
		empExample.put("ggg", new EmpData("Martin","Jack",32.0f));
		empExample.put("aaa", new EmpData("Jane","Single",44.4f));
		for(Map.Entry mapEntrySingle : empExample.entrySet()){
			   System.out.println(mapEntrySingle.getKey()+" : "+mapEntrySingle.getValue());
		}
        System.out.println("\n\n\n");
        
        
        //the treemap sorts by key - descending order per the implemented comparator
        TreeMap<String, EmpData> empExample2 = new TreeMap<String, EmpData>(new ComparatorDescending());
		empExample2.put("ddd", new EmpData("Deirdre","Hart",22.0f));
		empExample2.put("ggg", new EmpData("Martin","Jack",32.0f));
		empExample2.put("aaa", new EmpData("Jane","Single",44.4f));
		for(Map.Entry mapEntrySingle : empExample2.entrySet()){
			   System.out.println(mapEntrySingle.getKey()+" : "+mapEntrySingle.getValue());
		}

    }

}

class ComparatorAscending implements Comparator<String>{	 
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}

class ComparatorDescending implements Comparator<String>{	 
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
