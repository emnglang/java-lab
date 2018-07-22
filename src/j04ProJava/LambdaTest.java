package j04ProJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaTest {

    // for consumer test
    private double price = 0.0;

    public void setPrice(double price) {
        this.price = price;
    }

    public void printPrice() {
        System.out.println(price);
    }

    // for function test
    static void modifyValue(int v, Function<Integer, Integer> function) {
        int newValue = function.apply(v);
        System.out.println(newValue);
    }

    // for supplier
    static void display(Supplier<Integer> arg) {
        System.out.println(arg.get());
    }

    public static void main(String[] args) {

        int n = 5;

        // interface with an anonymous class
        Predicate<String> isALongWord = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() > 10;
            }
        };
        String s1 = "successfully";
        boolean result1 = isALongWord.test(s1);

        // Predicates interface with lambda expression
        Predicate<String> isALongWordLambda = t -> t.length() > 10;
        String s2 = "successfully";
        boolean result2 = isALongWordLambda.test(s2);

        //Predicates used to filter collections
        List<String> l = new ArrayList<>();
        l.add("successfully");
        l.add("easy");
        l.add("fortune");

        // Predicate pass a lambda expression for filter
        List<String> filtered = l
                .stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.<String>toList()
                );

        System.out.println(filtered);

        // function test - pass a lambda expression wherever a Function is expected
        modifyValue(n, val -> val + 10);
        modifyValue(n, val -> val * 100);

        // Supplier is expected - pass a lambda expression
        display(() -> n + 10);
        display(() -> n + 100);

        // Consumer is expected - pass a lambda expression
        Consumer<LambdaTest> updatePrice = p -> p.setPrice(5.9);

        LambdaTest p = new LambdaTest();
        updatePrice.accept(p);
        p.printPrice();

    }
}
