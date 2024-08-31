package hu.ibello.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class IteratorDemo {

	public void demo() {
		List<String> list = new ArrayList<>();
		list.add("egy");
		list.add("kettő");
		list.add("három");
		list.add("négy");
		list.add("öt");
		list.add("hat");
		list.add("hét");
		list.add("nyolc");
		list.add("kilenc");
		list.add("tíz");
		
		// az 'e' betűt tartalmazó elemeket átugorjuk
		Iterator<String> iterator = iterator(list);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	private Iterator<String> iterator(List<String> list) {
		return new Iterator<String>() {
			int index = -1;
			
			@Override
			public String next() {
				if (index < 0) {
					hasNext();
				}
				if (index < list.size()) {
					return list.get(index++);
				} else {
					throw new NoSuchElementException();
				}
			}
			
			@Override
			public boolean hasNext() {
				if (index < 0) {
					index = 0;
				}
				if (index < list.size()) {
					String item = list.get(index);
					if (item.indexOf('e') >= 0) {
						index++;
						return hasNext();
					} else {
						return true;
					}
				} else {
					return false;
				}
			}
		};
	}
	
	public static void main(String[] args) {
		IteratorDemo demo = new IteratorDemo();
		demo.demo();
	}
}
