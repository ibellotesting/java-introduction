package hu.ibello.training.collection;

public class CustomObject implements Comparable<CustomObject> {

	private final String value;

	public CustomObject(String value) {
		super();
		this.value = value;
	}

	@Override
	public int compareTo(CustomObject o) {
		String s1 = value.substring(1);
		String s2 = o.value.substring(1);
		return s1.compareTo(s2);
	}
	
	@Override
	public String toString() {
		return value;
	}
	
	
}
