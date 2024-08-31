package hu.ibello.training.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

public class MapDemo {

	public void mapDemo() {
		Map<String, String> map = new HashMap<>();
		// kulcs-érték pár hozzáadása
		map.put("a", "egy");
		map.put("b", "kettő");
		log("Alapállapot", map);
		
		// érték lekérdezése kulcs alapján
		String value = map.get("a");
		System.out.println("a = " + value);
		
		// kulcs tartalmazásának vizsgálata
		boolean containsA = map.containsKey("a");
		System.out.println("'a' tartalmazása: " + containsA);
		
		// érték tartalmazásának viusgálata
		boolean containsEgy = map.containsValue("egy");
		System.out.println("'egy' tartalmazása: " + containsEgy);
		
		// érték felülírása
		map.put("a", "három");
		log("Felülírás után", map);
		
		// kulcsok lekérdezése
		Set<String> keys = map.keySet();
		log("Kulcsok", keys);
		
		// értékek lekérdezése
		Collection<String> values = map.values();
		log("Értékek", values);
		
		// iterálás közben nem lehet módosítani
		System.out.println();
		try {
			for (String key : map.keySet()) {
				map.remove(key);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		Map<CustomObject, String> customMap = new HashMap<>();
		customMap.put(new CustomObject("egy"), "1");
		customMap.put(new CustomObject("agy"), "2");
		log("Egyedi hashCode és equals esetén", customMap);
	}
	
	public void demoMapEntrySet() {
		Map<String, Integer> map = new HashMap<>();
		for (int i=0; i<400000; i++) {
			map.put(Integer.toString(i), i+1);
		}
		
		Integer value;
		long time = System.currentTimeMillis();
		for (String key : map.keySet()) {
			value = map.get(key);
		}
		logTime("Iterálás keySet használatával", time);
		
		time = System.currentTimeMillis();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			value = entry.getValue();
		}
		logTime("Iterálás entrySet használatával", time);
	}
	
	public void demoHashMapVsTreeMap() {
		List<String> keys = new ArrayList<>();
		for (int i=0; i<100000; i++) {
			keys.add(UUID.randomUUID().toString());
		}
		
		Map<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> treeMap = new TreeMap<>();

		long time = System.currentTimeMillis();
		for (int i=0; i<keys.size(); i++) {
			hashMap.put(keys.get(i), i);
		}
		logTime("HashMap feltöltés", time);
		
		time = System.currentTimeMillis();
		for (int i=0; i<keys.size(); i++) {
			treeMap.put(keys.get(i), i);
		}
		logTime("TreeMap feltöltés", time);
		
		Integer value;
		
		time = System.currentTimeMillis();
		for (int i=0; i<keys.size(); i++) {
			value = hashMap.get(keys.get(i));
		}
		logTime("HashMap lekérdezés", time);
		
		time = System.currentTimeMillis();
		for (int i=0; i<keys.size(); i++) {
			value = treeMap.get(keys.get(i));
		}
		logTime("TreeMap lekérdezés", time);
	}
	
	private void log(String prefix, Map<?, ?> map) {
		System.out.println();
		System.out.println(prefix + ", méret = " + map.size());
		System.out.println(map);
	}
	
	private void log(String prefix, Collection<?> collection) {
		System.out.println();
		System.out.println(prefix + ", méret = " + collection.size());
		System.out.println(collection);
	}
	
	private void logTime(String prefix, long prevTime) {
		long millis = System.currentTimeMillis() - prevTime;
		System.out.println();
		System.out.println(prefix + ", időtartam = " + millis + " ms");
	}
	
	public static void main(String[] args) {
		MapDemo demo = new MapDemo();
		demo.mapDemo();
		demo.demoMapEntrySet();
		demo.demoHashMapVsTreeMap();
	}
}
