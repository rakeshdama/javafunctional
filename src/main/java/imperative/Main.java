package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("RAkesh", Person.Gender.MALE),
                new Person("No name", Person.Gender.FEMALE),
                new Person("Name no", Person.Gender.FEMALE)
        );

        System.out.println("Imperative Approach");
        // Imperative Approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Person.Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {

            System.out.println(female);
        }

        System.out.println("\nDeclarative Approach");
        // Declarative Approach
       List<Person> females2 = people.stream()
                .filter(person -> Person.Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        enum Gender{
            MALE, FEMALE
        }
    }
}
