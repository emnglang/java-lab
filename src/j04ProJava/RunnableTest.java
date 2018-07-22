package j04ProJava;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

// Not functional because method Object.clone is not public
interface Foo {
    int m();
    Object clone();
}

// Functional because Comparator has only one abstract non-Object method
interface Comparator<T> {
    boolean equals(Object obj);
    int compare(T o1, T o2);
}

public class RunnableTest {

    // before lambda
    Runnable r = new Runnable(){
        @Override
        public void run() {
            System.out.println("My Runnable");
        }};

    // with lambda
    Runnable r1 = () -> System.out.println("My Runnable");

    //Traditional approach
    private static boolean isPrime1(int number) {
        if(number < 2) return false;
        for(int i=2; i<number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }

    //Declarative approach
    private static boolean isPrime2(int number) {
        return number > 1
                && IntStream.range(2, number).noneMatch(
                index -> number % index == 0);

    }

    // better way
    private static boolean isPrime(int number) {
        IntPredicate isDivisible = index -> number % index == 0;

        return number > 1
                && IntStream.range(2, number).noneMatch(
                isDivisible);
    }
}
