package j04ProJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsIndepth {

    private static j04ProJava.Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    private static List<Employee> empList = Arrays.asList(arrayOfEmps);

    public static void main(String[] argv) {

        // method 1: create a stream
        Stream.of(arrayOfEmps);

        // method 2: create a stream
        empList.stream();

        // method 3: create a stream
        Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);

        // method 4: create a stream
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();
        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);
        Stream<Employee> empStream = empStreamBuilder.build();

    }
}
