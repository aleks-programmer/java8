package java8_features.func_intf;

import java8_features.Person;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ISimpleWithArgs s = (i, j) -> System.out.println("i: " + i + ", j: " + j);
        s.doSmth(10, 20);

        ISimple s2 = () -> System.out.println("Hello");
        s2.doSmth();

        Runnable r1 = () -> System.out.println("Starting thread 1");
        Runnable r2 = () -> System.out.println("Starting thread 2");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        list.add("bbb");
        list.add("555");

        Comparator<String> stringComparator = (obj1, obj2) -> {
            return obj1.compareTo(obj2);
        };

        Collections.sort(list, stringComparator
        );

        System.out.println(list);

        list.forEach(str -> System.out.println(str));

        Person p1 = new Person("Alex", Person.Sex.MALE, 25, "");
        Person p2 = new Person("Simon", Person.Sex.MALE, 18, "");
        Person p3 = new Person("Jeff", Person.Sex.MALE, 75, "");
        Person p4 = new Person("Erica", Person.Sex.FEMALE, 65, "");
        Person p5 = new Person("Jessika", Person.Sex.FEMALE, 30, "");

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        Predicate<Person> predicate = person -> person.getAge() >= 25;

//        persons.forEach(person -> {
//            if (predicate.test(person)) {
//                System.out.println("Filtred person: " + person.getName());
//            }
//        });

//        persons.parallelStream()
//                .filter(predicate)
//                .forEach(p -> System.out.println(p.getName()));
//
//        Person[] people = {
//                p1, p2, p3
//        };

//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i].getName());
//        }

//        Stream<Person> stream = Stream.of(people);
//        stream.forEach(p -> System.out.println(p.getName()));

//        long start = System.currentTimeMillis();

//        System.out.println();
//
//        List<String> list1 = new ArrayList<>();
//
//        for (int i = 0; i < 1000000; i++) {
//            list1.add("Element " + i);
//        }
//
//        list1.parallelStream().forEach(str -> System.out.println(str));
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("Processing time: " + ((end - start) / 1000) + " sec.");

        int sum = persons.stream().mapToInt(p -> p.getAge()).sum();
        System.out.println(sum);

        OptionalDouble dv = persons.stream().mapToInt(p -> p.getAge()).average();

        if (dv.isPresent()) {
            System.out.println("Double value: " + dv.getAsDouble());
        } else {
            System.out.println("Double value is not present");
        }
    }
}
