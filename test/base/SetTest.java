package base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/*
 * Collection
 * |- List  -> ArrayList| LinkedList |
 * |- Set   -> HashSet  | TreeSet    | LinkedHashSet
 * |- Queue -> ArrayDeque
 * 
 * Map
 * |- HashMap
 * |- TreeMap
 */
public class SetTest {
	
	private HashMap<String, String> genericMap(int size) {
		Map<String, String> map = new HashMap<> ();
		
		map.clear();
		
		for(int i=0;i<size;i++) {
			map.put("key"+ i, String.valueOf(Math.random()));
		}
		
		return (HashMap<String, String>) map;
	}

	@Test
	public void test1() {
		Map<String, String> map = genericMap(5);		
		// System.out.println(map);
				
		System.out.println(map.get("key2"));
		
		map.remove("key2");
		
		System.out.println(map);
		
		for (Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		for (String key: map.keySet()) {
			System.out.println(key);
		}
		
		for (String value: map.values()) {
			System.out.println(value);
		}
	}
}
