package hu.ibello.training.visibility;

public class SuperClass {

	private void privateMethod() {
		System.out.println("Privát metódus");
	}
	
	void defaultMethod() {
		System.out.println("Alapértelmezett metódus");
	}
	
	protected void protectedMethod() {
		System.out.println("Védett metódus");
	}
	
	public void publicMethod() {
		System.out.println("Publikus metódus");
	}
}
