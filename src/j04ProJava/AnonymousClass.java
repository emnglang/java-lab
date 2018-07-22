package j04ProJava;

import java.util.Arrays;
import java.util.List;

public class AnonymousClass {

    public static void main(String[] argv) {

        final String name = "Charlie";

        Runnable greeter = new Runnable() {
            public void run() {
                System.out.println("Hi " + name);
            }
        };

        // with Lambdas, can rewrite the code above like this
        String name2 = "Charlie";
        Runnable greeter2 = () -> System.out.println("Hi " + name);

        List<Integer> intList = Arrays.asList(1, 2, 3);

        for (int i=0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
