package package01_MapInterfaceHashMap;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

// types of Key types allowed in Map
public class Example01_HashMap {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Primitive types are NOT allowed as key
//		Map<byte, String> mapPrimitive1      = new HashMap<byte, String>();
//		Map<char, String> mapPrimitive2       = new HashMap<char, String>();
//		Map<short, String> mapPrimitive3     = new HashMap<short, String>();
//		Map<int, String> mapPrimitive4         = new HashMap<int, String>();	
//		Map<long, String> mapPrimitive5      = new HashMap<long, String>();
//		Map<boolean, String> mapPrimitive6= new HashMap<boolean, String>();
//		Map<float, String> mapPrimitive7      = new HashMap<float, String>();
//		Map<double, String> mapPrimitive8  = new HashMap<double, String>();
		
		// Non-Primitive types are allowed as key
		Map<Byte, String> mapNonPrimitive1       = new HashMap<Byte, String>();
		Map<Short, String> mapNonPrimitive2      = new HashMap<Short, String>();
		Map<Integer, String> mapNonPrimitive3   = new HashMap<Integer, String>();
		Map<Long, String> mapNonPrimitive4       = new HashMap<Long, String>();
		Map<Boolean, String> mapNonPrimitive5 = new HashMap<Boolean, String>();
		Map<Float, String> mapNonPrimitive6      = new HashMap<Float, String>();
		Map<Double, String> mapNonPrimitive7  = new HashMap<Double, String>();
		Map<String, String> mapNonPrimitive8    = new HashMap<String, String>();
		Map<Object, String> mapNonPrimitive9   = new HashMap<Object, String>();
		Map<File, String> mapNonPrimitive10      = new HashMap<File, String>();
		Map<Employee, String> mapNonPrimitive11= new HashMap<Employee, String>();

		Byte byte1             = new Byte("101");
		Short short1          = new Short("102");
		Integer integer1    = new Integer("103");
		Long long1            = new Long("104");
		Boolean boolean1= new Boolean(true);
		Float float1            = new Float(1.1f);
		Double double1    = new Double(1.2);
		String string1        = new String("London");		
	}
}
