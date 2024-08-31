package hu.ibello.training.visibility.another;

import hu.ibello.training.visibility.SuperClass;

public class AnotherSubClass extends SuperClass {

	public void demo() {
		// A privát metódus nem érhető el
		// privateMethod();
		
		// Az alapértelmezett láthatóságú metódus nem érhető el, mert másik csomagban vagyunk
		// defaultMethod();
		
		// A védett láthatóságú metódus elérhető
		protectedMethod();
		
		// A publikus metódus elérhető
		publicMethod();
	}
}
