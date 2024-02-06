package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MapsEx {
	private static final Logger log = Logger.getLogger(MapsEx.class.getName());

	/**
	 * @param args Insertion in the map is demonstrated below
	 */
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(100, "amit");
		mp.put(200, "vishal");
		mp.put(300, "vinay");

		// Iterating the map and printing the key-value pair
		for (Map.Entry<Integer, String> entry : mp.entrySet()) {
			log.info(entry.getKey() + " " + entry.getValue());
		}
	}
}
