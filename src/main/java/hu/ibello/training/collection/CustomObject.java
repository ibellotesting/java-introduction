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
	
	@Override
	public int hashCode() {
		return value.substring(1).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CustomObject) {
			CustomObject c = (CustomObject)obj;
			return value.substring(1).equals(c.value.substring(1));
		}
		return false;
	}
}
