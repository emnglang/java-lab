package j04ProJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparablePerson implements Comparable<ComparablePerson> {

    private int age;
    private String name;

    public ComparablePerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ComparablePerson p) {
        if (this.getAge() > p.getAge())
            return 1;
        else if (this.getAge() < p.getAge())
            return -1;
        else
            return 0;
    }
}

class AgeComparator implements Comparator<ComparablePerson> {
    @Override
    public int compare(ComparablePerson p1, ComparablePerson p2) {
        int age1 = p1.getAge();
        int age2 = p2.getAge();

        if (age1 > age2) {
            return 1;
        } else if (age1 < age2) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class ComparatorTest {

    public static void main(String[] args) {

        ComparablePerson p1 = new ComparablePerson(60, "James");
        ComparablePerson p2 = new ComparablePerson(55, "Bryan");

        if (p1.compareTo(p2) > 0) {
            System.out.println(p1.getName() + " is older.");
        } else {
            System.out.println(p2.getName() + " is older.");
        }

        //Sorted by age
        List<ComparablePerson> l = new ArrayList<>();
        l.add(p1);
        l.add(p2);

        Collections.sort(l, new AgeComparator());
        for (ComparablePerson p : l)
            System.out.println(p.getName());
    }
}

