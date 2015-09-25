import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List roster = Collections.singletonList(new Person("Alex", Person.Sex.MALE, 25, "aleks@aleks.ru"));
        //printPersonsOlderThan(Collections.singletonList(new Person("Alex", Person.Sex.MALE, 25)), 25);

        //
        //printPersons(
        //        Collections.singletonList(new Person("Alex", Person.Sex.MALE, 25)), new CheckPersonEligibleForSelectiveService());

//        printPersons(
//                Collections.singletonList(new Person("Alex", Person.Sex.MALE, 25)),
//                new CheckPerson() {
//                    public boolean test(Person p) {
//                        return p.getGender() == Person.Sex.MALE
//                                && p.getAge() >= 18
//                                && p.getAge() <= 25;
//                    }
//                }
//        );

//        printPersons(
//                Collections.singletonList(new Person("Alex", Person.Sex.MALE, 25)),
//                (Person p) -> p.getGender() == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25
//        );
//        printPersonsWithPredicate( roster,
//                p -> p.getGender() == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25);

//        printPersons(roster, p -> p.getGender() == Person.Sex.MALE
//                && p.getAge() >= 18
//                && p.getAge() <= 25, p -> p.printPerson());

        processElements(
                roster,
                (Person p) -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, Predicate<Person> tester,Consumer<Person> block) {
        for (Person p : roster) {
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
