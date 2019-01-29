package patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayExample {

    private static void printContents(List<Person> people) {
        people
                .stream()
                .map(person -> person.getName() + ", " + person.getAge())
                .forEach(System.out::println);
    }

    public static void showExample() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Bryan", "801-555-1212", 39));
        people.add(new Person("Mark", "801-444-1234", 41));
        people.add(new Person("Chris", "801-222-5151", 38));

        System.out.println("Not sorted");
        printContents(people);

        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("\nSorted by age");
        printContents(people);

        people.sort(Comparator.comparing(Person::getName));

        System.out.println("\nSorted by name");
        printContents(people);
    }
}