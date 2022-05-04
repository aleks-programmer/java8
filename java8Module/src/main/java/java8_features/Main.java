package java8_features;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.concurrent.TimeUnit.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedDeque<String> queue;
        // generic method invocation
//        java8_features.Pair<Integer, String> p1 = new java8_features.Pair<>(1, "apple");
//        java8_features.Pair<Integer, String> p2 = new java8_features.Pair<>(2, "apple");
//        boolean same = java8_features.Util.compare(p1, p2);
//        System.out.println("same: " + same);
//
        List<java8_features.Person> roster = Collections.singletonList(new java8_features.Person("Alex",
                java8_features.Person.Sex.MALE, 25, "aleks@aleks.ru"));
//        java8_features.MyClass<Integer> myClass = new java8_features.MyClass<>("");
//        printPersonsOlderThan(Collections.singletonList(new java8_features.Person("Alex", java8_features.Person.Sex
//        .MALE, 25, "aleks@aleks.ru")), 25);


//        printPersons(
//                Collections.singletonList(new java8_features.Person("Alex", java8_features.Person.Sex.MALE, 25,
//                "aleks@aleks.ru")), new java8_features.CheckPersonEligibleForSelectiveService());

//        printPersons(
//                Collections.singletonList(new Person("Alex", Person.Sex.MALE, 25, "aleks@aleks.ru")),
//                new CheckPerson() {
//                    public boolean test(Person p) {
//                        return p.getGender() == Person.Sex.MALE
//                                && p.getAge() >= 18
//                                && p.getAge() <= 25;
//                    }
//                }
//        );

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
//                Person::getEmailAddress,
//                System.out::println
//        );
//        testMethod2();
        ;
//test();
//        java8_features.TimeClient myTimeClient = new java8_features.SimpleTimeClient();
//        System.out.println("Current time: " + myTimeClient.toString());
//        System.out.println("Time in Togliatti: " +
//                myTimeClient.getZonedDateTime("Blah blah").toString());
//        System.out.println(returnForMain(new java8_features.Person("Alex", null, 25,"a@a.ru")));

        /* Target Types */
        // processStringList(Collections.emptyList());

        List<String> list = Arrays.asList("a1", "a2", "a3", "a2", "a3");
        List<String> list2 = Arrays.asList("1,2,0", "4,5");
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 2);
        long a1 = list.stream().filter(s -> s.equals("a1")).count();
        System.out.println(a1);
        String s = list.stream().findFirst().orElse("0");
        System.out.println(s);
        String empty = list.stream().skip(list.size() - 1).findFirst().orElse("empty");
        System.out.println(empty);
        String s1 = list.stream().skip(2).findFirst().get();
        System.out.println(s1);
        Object[] objects = list.stream().skip(1).limit(2).toArray();
        System.out.println(objects);
        List<String> a2 = list.stream().filter(s2 -> s2.equals("a2")).collect(Collectors.toList());
        System.out.println(a2);
        int num = 4;
        num = num * 10 + 2;
        System.out.println("eeeee: " + num);
        System.out.println("eeeee1: " + ("-".charAt(0) == '-'));
        List<Person> people = Arrays.asList(new Person("Vasya", Person.Sex.MALE, 16, ""),
                new Person("Petya", Person.Sex.MALE, 23, ""),
                new Person("Elena", Person.Sex.FEMALE, 42, ""),
                new Person("Ivan Ivanovich", Person.Sex.MALE, 69, ""));
        people.stream().filter((p) -> p.getAge() >= 18 && p.getAge() <= 27).forEach(p -> System.out.println(p.getName()));
        double asDouble =
                people.stream().filter(p -> p.getGender() == Person.Sex.MALE).mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println(asDouble);
        long count =
                people.stream().filter(p -> p.getAge() >= 18).filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() <= 60
                || p.getGender() == Person.Sex.FEMALE && p.getAge() <= 55).count();
        System.out.println(count);

        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        boolean a11 = list.stream().anyMatch(s11 -> s11.equals("a1"));
        System.out.println(a11);
        boolean a8 = list.stream().anyMatch(s12 -> s12.equals("a8"));
        System.out.println(a8);
        boolean b = list.stream().allMatch(s2 -> s2.contains("1"));
        System.out.println(b);
        boolean a7 = list.stream().noneMatch(s3 -> s3.equals("a7"));
        System.out.println(a7);

        List<String> collect1 = list.stream().map(s4 -> s4 + "_1").collect(Collectors.toList());
        System.out.println(collect1);
        int[] ints = list.stream().mapToInt(s5 -> Integer.valueOf(s5.substring(1))).toArray();
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        String[] strings = list2.stream().flatMap(s6 -> Arrays.asList(s6.split(",")).stream()).toArray(String[]::new);
        for (String string : strings) {
            System.out.println(string);
        }

        int sum =
                list2.stream().flatMapToInt(s7 -> Arrays.asList(s7.split(",")).stream().mapToInt(Integer::valueOf)).sum();
        System.out.println(sum);

        List<String> collect2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect2);
        List<String> collect3 = list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(collect3);
        List<String> collect4 = list.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(collect4);
        List<String> collect5 =
                list.stream().sorted((o1, o2) -> o2.compareTo(o1)).distinct().collect(Collectors.toList());
        System.out.println(collect5);

        List<Person> collect6 =
                people.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).collect(Collectors.toList());
        System.out.println(collect6);
        List<Person> collect7 =
                people.stream().sorted((o1, o2) -> o1.getGender().toString().equals(o2.getGender().toString()) ?
                        Integer.compare(o1.getAge(), o2.getAge()) :
                        o1.getGender().toString().compareTo(o2.getGender().toString())).collect(Collectors.toList());
        System.out.println(collect7);
        String s2 = list.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println(s2);
        String s3 = list.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println(s3);
        Person person = people.stream().max((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())).get();
        System.out.println(person.getName());
        Person person1 = people.stream().min((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())).get();
        System.out.println(person1.getName());
        list.stream().forEach(s9 -> System.out.println(s9 + "_1"));
        List<String> collect8 = list.stream().peek(s10 -> System.out.println(s10 + "_1")).collect(Collectors.toList());
        System.out.println(collect8);
        Integer integer = list3.stream().reduce((o1, o2) -> o1 + o2).orElse(0);
        System.out.println(integer);
        Integer integer1 = list3.stream().reduce((o1, o2) -> Integer.max(o1, o2)).orElse(-1);
        System.out.println(integer1);
        Integer integer2 = list3.stream().filter(i -> i % 2 != 0).reduce((o1, o2) -> o1 + o2).orElse(0);
        System.out.println(integer2);
        Integer collect9 = list3.stream().collect(Collectors.summingInt(p -> p % 2 == 1 ? p : 0));
        System.out.println(collect9);
        Double collect10 = list3.stream().collect(Collectors.averagingInt(p1 -> p1 - 1));
        System.out.println(collect10);
        IntSummaryStatistics collect11 = list3.stream().collect(Collectors.summarizingInt(p2 -> p2 + 3));
        System.out.println(collect11);
        Map<Boolean, List<Integer>> collect12 = list3.stream().collect(Collectors.partitioningBy(p3 -> p3 % 2 == 0));
        System.out.println(collect12);
        List<String> collect13 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect13);
        String[] strings1 = list.stream().distinct().map(p4 -> p4.toUpperCase()).toArray(String[]::new);
        for (String s4 : strings1) {
            System.out.println(s4);
        }
        String collect14 = list.stream().collect(Collectors.joining(": ", "<b>", "</b>"));
        System.out.println(collect14);
        Map<String, String> collect15 = list.stream().distinct().collect(Collectors.toMap((p5) -> p5,
                (p6) -> p6.substring(1, 2)));
        System.out.println(collect15);
        Map<String, List<String>> collect16 = list.stream().collect(Collectors.groupingBy((p7) -> p7.substring(0, 1)));
        System.out.println(collect16);
        Map<String, String> collect17 = list.stream().collect(Collectors.groupingBy((p8) -> p8.substring(0, 1),
                Collectors.mapping((p9) -> p9.substring(1, 2), Collectors.joining(":"))));
        System.out.println(collect17);
        String s4 = list.stream().collect(
                Collector.of(
                        StringBuilder::new,
                        (b2, s10) -> b2.append(s10).append(", "),
                        (b11, b12) -> b11.append(b12).append(", "),
                        StringBuilder::toString
                ));
        System.out.println(s4);

        System.out.println("-------------------------------------------");
        String n =
                list.stream().collect(
                        Collector.of(
                                StringBuilder::new,
                                (n1, n2) -> n1.append(n2).append(", "),
                                (h1, h2) -> h1.append(h2),
                                StringBuilder::toString
                        )
                );
        System.out.println(n);
        System.out.println("-------------------------------------------");

        Delayed delayed = new Delayed() {
            @Override
            public long getDelay(TimeUnit unit) {
                LocalDateTime time = LocalDateTime.of(2019, 8, 14, 23, 52);
                long diff = time.toInstant(ZoneOffset.UTC).toEpochMilli() - System.currentTimeMillis();
                return unit.convert(diff, MILLISECONDS);
            }

            @Override
            public int compareTo(Delayed o) {
                return 0;
            }

            @Override
            public String toString() {
                return "Name";
            }
        };
        BlockingQueue<Delayed> l = new DelayQueue<>();
        l.offer(delayed);
//        l.offer("2");
//        l.offer("3");
//        l.offer("4");
//        l.offer("5");


        Thread thread = new Thread(() -> {
//            l.offer("777");
//            l.offer("888");
        });
        thread.start();
        try {
            Delayed take = l.take();
            System.out.println(take);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        l.offer("555");
//        l.offer("999");
        System.out.println(l);
        test2();

        MyClass myClass = new MyClass(0);
        Thread t1 = new Thread(() -> {
            System.out.println("set i");
            myClass.setI(10);
            try {
                Thread.sleep(0, 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(myClass.getI());
        });
        t1.start();

        list.forEach(e -> {
            System.out.println(e.getBytes());
        });
        Thread.sleep(0, 1);

        System.out.println(myClass.getI());
        System.out.println("set i 2 time");
        myClass.setI(11);

        long average = 0L;
        long sum1 = 0L;

        for (int j = 0; j < 3; j++) {

            List<Integer> l1 = new ArrayList<>(1000000);
            List<Integer> l2 = new LinkedList<>();

            long start = System.currentTimeMillis();

            for (int i = 0; i < 1000000; i++) {
                l1.add(i);
            }

            long end = System.currentTimeMillis();

            sum1 += (end - start);
            System.out.println("Try " + j + " = " + (end - start));
        }


        System.out.println((sum1 / 3) + " ms");

        List<String> strings2 = Arrays.asList("1", "2", "3", "4", "5");
        CountDownLatch latch = new CountDownLatch(strings2.size());

        List<String> collect18 = strings2.stream().map(s0 -> {
            latch.countDown();
            try {
                System.out.println("Waiting");
                Thread.sleep(5000);
                System.out.println("Continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return s;
        }).collect(Collectors.toList());

        System.out.println("HERE");
        latch.await(5, TimeUnit.MINUTES);
    }

    static void processStringList(List<String> stringList) {
        // process stringList
    }

    public static Person.Sex returnForMain(Object person) {
        try {
            Person.Sex sex = ((Person) person).getGender();
            if (sex == null) return Person.Sex.MALE;
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

    public static void printPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
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

    public static void test() {
        TreeMap<Integer, Object> map = new TreeMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(4, "4");
        map.put(3, "3");
    }

    public static void test2() {
        int[] arr = {15, 3, 14, 88, 90};
        System.out.println(minDelta(arr));
    }

    public static int minDelta(int[] subArray) {
        int result = 0;
        int prev = 0;
        for (int i1 = 0; i1 < subArray.length; i1++) {
            int i = subArray[i1];
            if (i > prev) {
                if ((i - prev) < result || i1 == 0) {
                    result = i - prev;
                }
            } else {
                if ((prev - i) < result || i1 == 0) {
                    result = prev - i;
                }
            }
            prev = i;
        }
        return result;
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
            if (!it.next().equals(1)) break;
            if (it.hasNext()) System.out.println("OK!");
        }
    }

    public static <T> Predicate<T> chain(Function<T, Predicate<T>> mapFunction, T[] args) {
        return Arrays.asList(args)
                .stream()
                .map(mapFunction::apply)
                .reduce(p -> false, Predicate::or);
    }
}
