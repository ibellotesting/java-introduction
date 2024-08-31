package hu.ibello.training.visibility;

import hu.ibello.training.visibility.another.AnotherClass;
import hu.ibello.training.visibility.another.AnotherSubClass;

public class VisibilityDemo {

	public void demo() {
		SubClass obj = new SubClass();
		
		// A privát metódus nem érhető el
		// obj.privateMethod();

		// Az alapértelmezett láthatóságú metódus elérhető
		obj.defaultMethod();
		
		// A védett láthatóságú metódus elérhető, mert ugyanabban a csomagban vagyunk
		obj.protectedMethod();
		
		// A publikus metódus elérhető
		obj.publicMethod();
	}
	
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.demo();
		System.out.println("------------------------------");
		VisibilityDemo demo = new VisibilityDemo();
		demo.demo();
		System.out.println("------------------------------");
		AnotherSubClass anotherSub = new AnotherSubClass();
		anotherSub.demo();
		System.out.println("------------------------------");
		AnotherClass another = new AnotherClass();
		another.demo();
	}
}
