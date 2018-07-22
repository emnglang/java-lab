package j04ProJava;

import java.util.function.*;

public class FunctionTest {

    //Before Java 8
    Runnable r7 = new Runnable(){
        public void run(){
            System.out.println("This should be run in another thread");
        }
    };

    //Java 8 - function that takes no argument and return nothing
    Runnable r8 = () -> System.out.println("This should be run in another thread");


    // Java 8 - function that takes an argument and returns something
    Function<String, Integer> parseInt7 = (String s) -> Integer.parseInt(s);
    Function<String, Integer> parseInt8 = s -> Integer.parseInt(s);

    // Method References
    Function<String, Integer> parseInt = Integer::parseInt;
    Function<Integer, String> intToStr = String::valueOf;
    Function<String, Integer> indexOf1 = new String()::indexOf;
    BiFunction<String, String, Integer> indexOf2 = String::indexOf;

    // The target type of this expression must be a functional interface
    //Supplier<String> str = String::new;
    //Function<Supplier<String>, Integer> indexOf = (String::new)::indexOf;
    Function<String, Integer> indexOf3 = ((Supplier<String>)String::new).get()::indexOf;

    // Java 8 - function that takes two arguments
    BiFunction<Integer, Integer, Integer> multiplier =
            (i1, i2) -> i1 * i2; //you can’t omit parenthesis here!


    // Java 8 - self defined
    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        public R apply(A a, B b, C c);
    }

    // Java 8 - function that takes three arguments
    TriFunction<Integer, Integer, Integer, Integer> sumOfThree
            = (i1, i2, i3) -> i1 + i2 + i3;

    // Java 8 - more
    IntFunction<IntUnaryOperator> add1 = a -> b -> a + b;
    Supplier<BiFunction<Integer, Integer, Integer>> add2 = () -> (a, b) -> a + b;

}
