package hu.ibello.training.visibility;

public class SubClass extends SuperClass {

	public void demo() {
		// A privát metódus nem érhető el
		// privateMethod();
		
		// Az alapértelmezett láthatóságú metódus elérhető
		defaultMethod();
		
		// A védett láthatóságú metódus elérhető
		protectedMethod();
		
		// A publikus metódus elérhető
		publicMethod();
	}
	
}
