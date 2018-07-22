package j03GenericCollection;

import java.util.*;

class Fruit1 implements Comparable<Fruit1> {
    String name;
    int size;

    public Fruit1(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int compareTo(Fruit1 that) {
        return
                this.size < that.size ? -1 :
                        this.size == that.size ? 0 : 1;
    }

    public String toString() {
        return this.name + "(" + size + ")";
    }

    public boolean equals(Object o) {
        return (o instanceof Fruit1 &&
                name.equals(((Fruit1) o).name) &&
                size == ((Fruit1) o).size);
    }
}

class Apple1 extends Fruit1 {
    public Apple1(int size) {
        super("Apple1", size);
    }
}

class Orange1 extends Fruit1 {
    public Orange1(int size) {
        super("Orange1", size);
    }
}

class Fruit1Test {
    public static void main(String... args) {
        List<Apple1> Apple1s = Arrays.asList(new Apple1(1), new Apple1(10));
        List<Orange1> Orange1s = Arrays.asList(new Orange1(1), new Orange1(10));
        List<Fruit1> Fruit1s = Arrays.<Fruit1>asList(new Apple1(1), new Orange1(10));
        assert Collections.max(Apple1s).equals(new Apple1(10));
        assert Collections.max(Orange1s).equals(new Orange1(10));
        assert Collections.max(Fruit1s).equals(new Orange1(10));  // ok
        System.out.println(Collections.max(Apple1s));
        System.out.println(Collections.max(Orange1s));
        System.out.println(Collections.max(Fruit1s));
        Apple1 weeApple1 = new Apple1(1);
        Apple1 bigApple1 = new Apple1(2);
        Apple1s = Arrays.asList(weeApple1, bigApple1);
        System.out.println(weeApple1.compareTo(bigApple1));
        System.out.println(Collections.max(Apple1s) == bigApple1);
    }
}
