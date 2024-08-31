package hu.ibello.training.visibility.another;

import hu.ibello.training.visibility.SubClass;

public class AnotherClass {

	public void demo() {
		SubClass obj = new SubClass();
		
		// A privát metódus nem érhető el
		// obj.privateMethod();

		// Az alapértelmezett láthatóságú metódus nem érhető el, mert másik csomagban vagyunk
		// obj.defaultMethod();
		
		// A védett láthatóságú metódus elérhető, mert ugyanabban a csomagban vagyunk, és nem származtunk le az osztályból
		// obj.protectedMethod();
		
		// A publikus metódus elérhető
		obj.publicMethod();
	}
}
