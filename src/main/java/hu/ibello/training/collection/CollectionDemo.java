package hu.ibello.training.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {

	public void collectionDemo() {
		Collection<String> collection = new ArrayList<>();
		
		// Érték hozzáadása
		collection.add("egy");
		log("C1", collection);
		
		// Érték tartalmazásának ellenőrzése
		boolean b1 = collection.contains("egy");
		boolean b2 = collection.contains("kettő");
		System.out.println("Tartalmazás: egy = " + b1 + ", kettő = " + b2);
		
		// Egyszerre több érték hozzáadása
		collection.addAll(Collections.singleton("kettő"));
		log("C2", collection);
		
		// Egyetlen érték törlése
		collection.remove("egy");
		log("C3", collection);
		
		// Teljes törlés
		collection.clear();
		log("C4", collection);
	}
	
	private void log(String prefix, Collection<?> collection) {
		System.out.println();
		System.out.println(prefix);
		System.out.println(collection);
		System.out.println("Méret: " + collection.size() + ". Üres: " + collection.isEmpty() + ".");
	}
	
	public static void main(String[] args) {
		CollectionDemo demo = new CollectionDemo();
		demo.collectionDemo();
	}
}
