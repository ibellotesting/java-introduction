package hu.ibello.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public void demo() {
		// üres kollekciók
		List<String> emptyList = Collections.emptyList();
		log("üres lista", emptyList);
		Set<String> emptySet = Collections.emptySet();
		log("üres halmaz", emptySet);
		Map<String, String> emptyMap = Collections.emptyMap();
		log("üres térkép", emptyMap);
	
		// egyelemű kollekciók
		List<String> singletonList = Collections.singletonList("egy");
		log("egyelemű lista", singletonList);
		Set<String> singletonSet = Collections.singleton("kettő");
		log("egyelemű halmaz", singletonSet);
		Map<String, String> singletonMap = Collections.singletonMap("a", "egy");
		log("egyelemű térkép", singletonMap);
		
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<10; i++) {
			Double d = Double.valueOf(10 * Math.random());
			list.add(d.intValue());
		}
		log("véletlenszám lista", list);
		
		// rendezés
		Collections.sort(list);
		log("rendezett", list);
		
		/// bináris keresés
		Integer value = list.get(5);
		int index = Collections.binarySearch(list, value);
		System.out.println("A(z) " + value + " érték indexe: " + index);
		
		// sorrend megfordítása
		Collections.reverse(list);
		log("megfordított", list);
		
		// összekeverés
		Collections.shuffle(list);
		log("összekevert", list);
		
		// minimum és maximum
		Integer min = Collections.min(list);
		Integer max = Collections.max(list);
		System.out.println("Legkisebb érték: " + min);
		System.out.println("Legnagyobb érték: " + max);
		
		// feltöltés
		Collections.fill(list, 10);
		log("feltöltött", list);
		
		// diszjunkt ellenőrzés
		boolean disjoint = Collections.disjoint(list, singletonList);
		System.out.println("Nincs közös elem: " + disjoint);
	}
	
	private void log(String prefix, Object collection) {
		System.out.println();
		System.out.println(prefix);
		System.out.println(collection);
	}
	
	public static void main(String[] args) {
		CollectionsDemo demo = new CollectionsDemo();
		demo.demo();
	}
}
