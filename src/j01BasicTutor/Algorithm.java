package jBasicTutor;

import java.util.Arrays;
import java.util.Collection;

public final class Algorithm {
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }

    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // x > 0 and y > 0
    public static int gcd(int x, int y) {
        for (int r; (r = x % y) != 0; x = y, y = r) {
        }
        return y;
    }

    public interface UnaryPredicate<T> {
        public boolean test(T obj);
    }

    class OddPredicate implements UnaryPredicate<Integer> {
        public boolean test(Integer i) {
            return i % 2 != 0;
        }
    }

    class RelativelyPrimePredicate implements UnaryPredicate<Integer> {
        public RelativelyPrimePredicate(Collection<Integer> c) {
            this.c = c;
        }

        public boolean test(Integer x) {
            for (Integer i : c)
                if (Algorithm.gcd(x, i) != 1)
                    return false;

            return c.size() > 0;
        }

        private Collection<Integer> c;
    }

    public void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
}



