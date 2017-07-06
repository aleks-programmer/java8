package java8_features;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        // generic method invocation
//        java8_features.Pair<Integer, String> p1 = new java8_features.Pair<>(1, "apple");
//        java8_features.Pair<Integer, String> p2 = new java8_features.Pair<>(2, "apple");
//        boolean same = java8_features.Util.compare(p1, p2);
//        System.out.println("same: " + same);
//
//        List<java8_features.Person> roster = Collections.singletonList(new java8_features.Person("Alex", java8_features.Person.Sex.MALE, 25, "aleks@aleks.ru"));
//        java8_features.MyClass<Integer> myClass = new java8_features.MyClass<>("");
//        printPersonsOlderThan(Collections.singletonList(new java8_features.Person("Alex", java8_features.Person.Sex.MALE, 25, "aleks@aleks.ru")), 25);


//        printPersons(
//                Collections.singletonList(new java8_features.Person("Alex", java8_features.Person.Sex.MALE, 25, "aleks@aleks.ru")), new java8_features.CheckPersonEligibleForSelectiveService());

        printPersons(
                Collections.singletonList(new Person("Alex", Person.Sex.MALE, 25, "aleks@aleks.ru")),
                new CheckPerson() {
                    public boolean test(Person p) {
                        return p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 25;
                    }
                }
        );

//        printPersons(
//                Collections.singletonList(new java8_features.Person("Alex", java8_features.Person.Sex.MALE, 25)),
//                (java8_features.Person p) -> p.getGender() == java8_features.Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25
//        );
//        printPersonsWithPredicate( roster,
//                p -> p.getGender() == java8_features.Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25);

//        printPersons(roster, p -> p.getGender() == java8_features.Person.Sex.MALE
//                && p.getAge() >= 18
//                && p.getAge() <= 25, p -> p.printPerson());

//        processElements(
//                roster,
//                p -> p.getGender() == java8_features.Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25,
//                p -> p.getEmailAddress(),
//                email -> System.out.println(email)
//        );
//        testMethod2();
        ;

//        java8_features.TimeClient myTimeClient = new java8_features.SimpleTimeClient();
//        System.out.println("Current time: " + myTimeClient.toString());
//        System.out.println("Time in Togliatti: " +
//                myTimeClient.getZonedDateTime("Blah blah").toString());
//        System.out.println(returnForMain(new java8_features.Person("Alex", null, 25,"a@a.ru")));

        /* Target Types */
       // processStringList(Collections.emptyList());
    }

    static void processStringList(List<String> stringList) {
        // process stringList
    }

    public static Person.Sex returnForMain(Object person) {
        try {
            Person.Sex sex = ((Person) person).getGender();
            if(sex == null) return Person.Sex.MALE;
            return sex;
        } catch (NullPointerException | ClassCastException e) {
            System.out.println("e: " + e.getMessage());
            return Person.Sex.MALE;
        }
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
            Iterable<Person> source,
            Predicate<Person> tester,
            Function<Person, Y> mapper,
            Consumer<Y> block) {
        for (Person p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public static void testMethod() {
        List<String> temp = new ArrayList<>();
//        List<Integer> listOfIntegers =
//                new ArrayList<>(Arrays.asList(intArray));
        try {
            System.out.println("temp: " +
                    temp
                            .stream()
                            .filter(l -> l.compareTo("111") == 0)
                            .findFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Hi! No value present!");
            try {
                throw new Exception();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void ex1() {
        List<String> temp = new ArrayList<>();
        temp.add("111gfggf");
        temp.add("222ggg");
        temp.add("333ggg");
//        List<Integer> listOfIntegers =
//                new ArrayList<>(Arrays.asList(intArray));
        String[] condition = {"111", "222", "333"};
        List<String> l = Arrays.asList(condition);
        System.out.println(temp.get(0).contains(l.get(0)));
    }

    public static void testMethod2() {
        List<String> temp = new ArrayList<>();
        temp.add("111gfggf");
        temp.add("222ggg");
        temp.add("333ggg");
//        List<Integer> listOfIntegers =
//                new ArrayList<>(Arrays.asList(intArray));
        String[] condition = {"111", "222", "333"};
            System.out.println("temp: " +
                    temp
                            .stream()
                            .filter(chain(x -> (y -> y.contains(x)), condition))
                            .reduce("", (acc, str) -> acc + str + ". "));
    }
    public static void testMethod3() {
        String[] s = {"111", "222", "333"};
        Arrays.stream(s);
    }
    public static void testMethod4() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if(!it.next().equals(1)) break;
            if(it.hasNext()) System.out.println("OK!");
        }
    }

    public static <T> Predicate<T> chain (Function<T,Predicate<T>> mapFunction, T[] args) {
        return Arrays.asList(args)
                .stream()
                .map(mapFunction::apply)
                .reduce(p->false, Predicate::or);
    }
}
