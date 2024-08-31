package hu.ibello.training.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public void setDemo() {
		Set<String> set = new HashSet<>();
		set.add("egy");
		set.add("kettő");
		log("Alapállapot", set);
		
		// Nem lehet kétszer ugyanazt az elemet hozzáadni
		set.add("kettő");
		log("Második hozzáadás után", set);
		
		// Egyedi hashCode és equals esetén
		Set<CustomObject> customSet = new HashSet<>();
		customSet.add(new CustomObject("egy"));
		customSet.add(new CustomObject("agy"));
		log("Egyedi hashCode és equals esetén", customSet);
	}
	
	public void hashSetVsTreeSetDemo() {
		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		long time = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			hashSet.add(Integer.toString(i));
		}
		logTime("HashSet elemek hozzáadása", time);
		
		time = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			treeSet.add(Integer.toString(i));
		}
		logTime("TreeSet elemek hozzáadása", time);
		
		time = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			hashSet.contains(Integer.toString(i));
		}
		logTime("HashSet elemek lekérdezése", time);
		
		time = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			treeSet.contains(Integer.toString(i));
		}
		logTime("TreeSet elemek lekérdezése", time);
		
		hashSet.clear();
		hashSet.add("egy");
		hashSet.add("kettő");
		hashSet.add("három");
		hashSet.add("négy");
		log("HashSet tartalma", hashSet);
		
		treeSet.clear();
		treeSet.add("egy");
		treeSet.add("kettő");
		treeSet.add("három");
		treeSet.add("négy");
		log("TreeSet tartalma", treeSet);
	}
	
	private void log(String prefix, Set<?> set) {
		System.out.println();
		System.out.println(prefix + ", méret = " + set.size());
		System.out.println(set);
	}
	
	private void logTime(String prefix, long prevTime) {
		long millis = System.currentTimeMillis() - prevTime;
		System.out.println();
		System.out.println(prefix + ", időtartam = " + millis + " ms");
	}
	
	public static void main(String[] args) {
		SetDemo demo = new SetDemo();
		demo.setDemo();
		demo.hashSetVsTreeSetDemo();
	}
}
