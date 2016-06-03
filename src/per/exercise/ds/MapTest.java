package per.exercise.ds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("TreeMap key1", "value1");
		tm.put("TreeMap key2", "value2");
		tm.put("TreeMap key3", "value3");

		for (String key: tm.keySet()) {
			System.out.println("key: " + key);
			// order (by key) is guarantee
			// O(log n) insert and lookup
		}

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("HashMap key1", "value1");
		hm.put("HashMap key2", "value2");
		hm.put("HashMap key3", "value3");

		for (String key: hm.keySet()) {
			System.out.println("key: " + key);
			//order is not guarantee
			// O(1) insert and lookup (most of the time, when no collision)
		}
		
		
		//LinkedHashMap preserves the insertion order
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("TreeMap key2", "value2");
		lhm.put("TreeMap key1", "value1");
		lhm.put("TreeMap key3", "value3");

		for (String key: lhm.keySet()) {
			System.out.println("key: " + key);
			// order (by insertion) is guarantee
			// O(log n) insert and lookup
		}
	}

}
