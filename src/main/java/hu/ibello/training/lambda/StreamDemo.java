package hu.ibello.training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {

    public void basicStreamOperations() {
        List<String> names = Arrays.asList("Anna", "Béla", "Cecília", "Dávid", "Edit", "Ferenc");

        // Szűrés (filter) - Csak azok a nevek, amik "A"-val kezdődnek
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        log("Szűrés után", filteredNames);

        // Leképezés (map) - A nevek hosszának kiszámítása
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        log("Névhosszak", nameLengths);

        // Sorbarendezés (sorted) - Nevek ABC sorrendben
        List<String> sortedNames = names.stream()
                .sorted((name1, name2) -> name1.compareTo(name2))
                .collect(Collectors.toList());
        log("Sorbarendezés után", sortedNames);

        // Mind (allMatch) - Minden név legalább 4 karakter hosszú?
        boolean allNamesAtLeast4 = names.stream()
                .allMatch(name -> name.length() >= 4);
        System.out.println("Minden név legalább 4 karakter hosszú? " + allNamesAtLeast4);

        // Bármelyik (anyMatch) - Van olyan név, ami "D"-vel kezdődik?
        boolean anyStartsWithD = names.stream()
                .anyMatch(name -> name.startsWith("D"));
        System.out.println("Van olyan név, ami 'D'-vel kezdődik? " + anyStartsWithD);

        // Gyakori használat - Egyedi elemek számolása
        long uniqueNamesCount = names.stream()
                .distinct()
                .count();
        System.out.println("Egyedi nevek száma: " + uniqueNamesCount);
    }

    public void advancedStreamOperations() {
        List<Integer> numbers = IntStream.range(1, 100)
                .boxed()
                .collect(Collectors.toList());

        // Szűrés és leképezés - Páros számok négyzetei
        List<Integer> evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        log("Páros számok négyzetei", evenSquares);

        // Redukció (reduce) - Összegzés
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Számok összege: " + sum);

        // Gyűjtés - Páros számok csoportosítása
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        log("Páros és páratlan számok csoportosítva", partitionedNumbers);
    }

    private void log(String prefix, Object obj) {
        System.out.println();
        System.out.println(prefix + ":");
        System.out.println(obj);
    }

    public static void main(String[] args) {
        StreamDemo demo = new StreamDemo();
        demo.basicStreamOperations();
        demo.advancedStreamOperations();
    }
}