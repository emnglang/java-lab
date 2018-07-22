package j03GenericCollection;

import java.util.*;

class Fruit2 {
    protected String name;
    protected int size;

    public Fruit2(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public boolean equals(Object o) {
        if (o instanceof Fruit2) {
            Fruit2 that = (Fruit2) o;
            return this.name == that.name && this.size == that.size;
        } else return false;
    }

    public String toString() {
        return this.name + "(" + size + ")";
    }
}

class Orange2 extends Fruit2 implements Comparable<Orange2> {
    public Orange2(int size) {
        super("Orange2", size);
    }

    public int compareTo(Orange2 that) {
        return
                this.size < that.size ? -1 :
                        this.size == that.size ? 0 : 1;
    }
}

class Apple2 extends Fruit2 implements Comparable<Apple2> {
    public Apple2(int size) {
        super("Apple2", size);
    }

    public int compareTo(Apple2 that) {
        return
                this.size < that.size ? -1 :
                        this.size == that.size ? 0 : 1;
    }
}

class Fruit2Test {
    public static void main(String... args) {
        List<Apple2> Apple2s = Arrays.<Apple2>asList(new Apple2(1), new Apple2(10));
        List<Orange2> Orange2s = Arrays.<Orange2>asList(new Orange2(1), new Orange2(10));
        List<Fruit2> Fruit2s = Arrays.<Fruit2>asList(new Apple2(1), new Orange2(10));
        assert Collections.max(Apple2s).equals(new Apple2(10));
        assert Collections.max(Orange2s).equals(new Orange2(10));
        // assert Collections.max(Fruit2s).equals(new Orange2(10));  // compile-time error
        System.out.println(Collections.max(Apple2s));
        System.out.println(Collections.max(Orange2s));
    }
}
