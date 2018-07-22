package j04ProJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {

        // simpler code
        List<String> myList = Arrays.asList("k1", "l1", "m2", "m3", "j4", "j4", "j1", "m1");
        myList.stream()
                .filter(s -> s.endsWith("1"))
                .sorted()
                .forEach(System.out::println);

        // Stream.of() will create a stream from object references
        Stream.of("a1", "a2", "a3")
                .forEach(System.out::println);

        // replace the regular for loop using IntStream.range()
        IntStream.range(1, 10)
                .forEach(System.out::println);

        // before Java 8
        List<Person> people = new ArrayList<>();
        for (Person e : people) {
            if (e.getName().startsWith("C")) {
                people.add(e);
            }
        }

        // with Java 8
        List<Person> employee = people
                .stream()
                .filter(e -> e.getName().startsWith("A"))
                .collect(Collectors.toList());


        // collections that implement Iterable (such as List and Set) now have a forEach() method
        List<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");

        l1.forEach(i -> System.out.println(i));
        l1.stream().forEach(i -> System.out.println(i));

        // substitue the lambda expression with a method reference
        //
        // Lambda Expression	Method Reference
        // --------------------------------------
        // n -> Math.square(n)	Math::square
        // i -> new Integer(i)	Integer::new
        // p -> p.getName()	    Person::getName
        // p -> p.getName()	    p::getName
        //
        List<String> l2 = new ArrayList<>();
        l2.stream().forEach(s -> System.out.println(s));

        List<String> l3 = new ArrayList<>();
        l3.stream().forEach(System.out::println);

        // convert it to a stream and then pass a lambda expression
        List filterd2 = employee.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList());

        // use multiple conditions to filter the list with Predicate interface
        Predicate<Person> nameNotNull = p -> p.getName() != null;
        Predicate<Person> ageAbove20 = p -> p.getAge() > 20;
        Predicate<Person> multipleConditions = nameNotNull.and(ageAbove20);
        List filterd1 = employee.stream().filter(multipleConditions).collect(Collectors.toList());

    }
}
