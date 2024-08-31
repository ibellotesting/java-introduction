package hu.ibello.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public void listDemo() {
		List<String> list = new ArrayList<>();
		list.add("egy");
		list.add("kettő");
		log("Alapállapot", list);
		
		// Adott indexű elem értéke
		String first = list.get(0);
		System.out.println("Első elem: " + first);
		
		// Adott érték indexe (első előfordulás)
		int index2 = list.indexOf("kettő");
		System.out.println("A 'kettő' elem indexe: " + index2);
		
		// Nem létező elem esetén -1-gyel tér vissza
		int index3 = list.indexOf("három");
		System.out.println("A 'három' elem indexe: " + index3);
		
		// Beszúrás adott indexre
		list.add(1, "négy");
		log("Beszúrás után", list);
		
		// Adott indexű elem módosítása
		list.set(1, "öt");
		log("Módosítás után", list);
		
		// Rendezés az alapártelmezett sorrendben
		Collections.sort(list);
		log("Alapértelmezett rendezés után", list);
		
		// Rendezés egyéni szabály szerint
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1.substring(1);
				String s2 = o2.substring(1);
				return s1.compareTo(s2);
			}
		};
		Collections.sort(list, comparator);
		log("Egyéni rendezés után", list);
		
		// Rendezés az alapártelmezett rendezési szabály megadásával
		List<CustomObject> customList = new ArrayList<>();
		customList.add(new CustomObject("egy"));
		customList.add(new CustomObject("kettő"));
		customList.add(new CustomObject("öt"));
		Collections.sort(customList);
		log("Egyéni alapértelmezett rendezés után", customList);
	}
	
	public void linkedListDemo() {
		LinkedList<String> list = new LinkedList<>();
		list.add("egy");
		// Első és utolsó helyre történő hozzáadás gyors
		list.addFirst("nulla");
		list.addLast("kettő");
		log("LinkedList", list);
		
		// Első és utolsó elem lekérése gyors
		String s1 = list.getFirst();
		System.out.println("Első elem: " + s1);
		String s3 = list.getLast();
		System.out.println("Utolsó elem: " + s3);
		
		// Az első elem kivétele
		String polled = list.poll();
		log("Az első elem kivétele után", list);
		System.out.println("Első elem volt: " + polled);
	}
	
	public void arrayListVsLinkedList() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		// ArrayList elemek hozzáadása a végére
		long time = System.currentTimeMillis();
		for (int i=0; i<50000; i++) {
			arrayList.add(i);
		}
		logTime("ArrayList elemek hozzáadása a végére", time);
		
		// LinkedList elemek hozzáadása a végére
		time = System.currentTimeMillis();
		for (int i=0; i<50000; i++) {
			linkedList.add(i);
		}
		logTime("LinkedList elemek hozzáadása a végére", time);
		
		// ArrayList elemek hozzáadása az elejére
		time = System.currentTimeMillis();
		for (int i=0; i<50000; i++) {
			arrayList.add(0, i);
		}
		logTime("ArrayList elemek hozzáadása az elejére", time);
		
		// LinkedList elemek hozzáadása az elejére
		time = System.currentTimeMillis();
		for (int i=0; i<50000; i++) {
			linkedList.add(0, i);
		}
		logTime("LinkedList elemek hozzáadása az elejére", time);
		
		// ArrayList elem lekérdezése
		time = System.currentTimeMillis();
		for (int i=0; i<50000; i++) {
			arrayList.get(50000);
		}
		logTime("ArrayList elem lekérdezése", time);

		// LinkedList elem lekérdezése
		time = System.currentTimeMillis();
		for (int i=0; i<50000; i++) {
			linkedList.get(50000);
		}
		logTime("LinkedList elem lekérdezése", time);

		// ArrayList elemek törlése elölről
		time = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			arrayList.remove(0);
		}
		logTime("ArrayList elemek törlése elölről", time);

		// LinkedList elemek törlése elölről
		time = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			linkedList.remove(0);
		}
		logTime("LinkedList elemek törlése elölről", time);

		// ArrayList elemek törlése középről
		time = System.currentTimeMillis();
		for (int i=0; i<50000; i++) {
			arrayList.remove(40000);
		}
		logTime("ArrayList elemek törlése középről", time);

		// LinkedList elemek törlése középről
		time = System.currentTimeMillis();
		for (int i=0; i<50000; i++) {
			linkedList.remove(40000);
		}
		logTime("LinkedList elemek törlése középről", time);
	}
	
	private void log(String prefix, List<?> list) {
		System.out.println();
		System.out.println(prefix + ", méret = " + list.size());
		System.out.println(list);
	}
	
	private void logTime(String prefix, long prevTime) {
		long millis = System.currentTimeMillis() - prevTime;
		System.out.println();
		System.out.println(prefix + ", időtartam = " + millis + " ms");
	}
	
	public static void main(String[] args) {
		ListDemo demo = new ListDemo();
		demo.listDemo();
		demo.linkedListDemo();
		demo.arrayListVsLinkedList();
	}
}
