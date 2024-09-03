package hu.ibello.training.lambda;

import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kornél", 30));
        people.add(new Person("Péter", 25));
        people.add(new Person("Béla", 35));

        // Rendezés név szerint
        people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        log("Rendezés név szerint", people);

        // Rendezés név hosszúsága szerint
        people.sort((p1, p2) -> p1.getName().length() - p2.getName().length());
        log("Rendezés név hosszúsága szerint", people);

        // Rendezés életkor szerint
        people.sort((p1, p2) -> p1.getAge() - p2.getAge());
        log("Rendezés életkor szerint", people);

        // Rendezés életkor szerint csökkenő sorrendben
        people.sort((p1, p2) -> p2.getAge() - p1.getAge());
        log("Rendezés életkor szerint", people);

    }

    private static void log(String prefix, List<Person> list) {
        System.out.println();
        System.out.println(prefix + ", méret = " + list.size());
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
