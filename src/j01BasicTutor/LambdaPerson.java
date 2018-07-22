package j01BasicTutor;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaPerson {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        // ...
        Date today = new Date();
        today.setHours(0);
        return today.getYear() - birthday.getYear();
    }

    public void printPerson() {
        // ...
    }

    public static void printPersonsOlderThan(List<LambdaPerson> roster, int age) {
        for (LambdaPerson p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(List<LambdaPerson> roster, int low, int high) {
        for (LambdaPerson p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    interface CheckPerson {
        boolean test(LambdaPerson p);
    }

    class CheckPersonEligibleForSelectiveService implements CheckPerson {
        public boolean test(LambdaPerson p) {
            return p.gender == LambdaPerson.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }

    public static void printPersonsLocal(List<LambdaPerson> roster, CheckPerson tester) {
        for (LambdaPerson p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    interface Predicate<LambdaPerson> {
        boolean test(LambdaPerson t);
    }

    public static void printPersonsWithPredicate(
            List<LambdaPerson> roster, Predicate<LambdaPerson> tester) {
        for (LambdaPerson p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void processPersons(
            List<LambdaPerson> roster,
            Predicate<LambdaPerson> tester,
            Consumer<LambdaPerson> block) {
        for (LambdaPerson p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    public static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}
