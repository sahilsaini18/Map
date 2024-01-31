package maps;

import java.util.*;

public class MapsEx {
	/**
	 * @param args Insertion in map is demonstrated below
	 * 
	 */
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(100, "amit");
		mp.put(200, "vishal");
		mp.put(300, "vinay");
		// Iterating the map and printing the key value pair
		for (Map.Entry m : mp.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
