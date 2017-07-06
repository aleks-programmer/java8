package java8_features;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class WC {
    public static void process(List<? extends Number> list) {
        for (Number elem : list) {
            // ...
        }
    }
    public static void test() {
        process(new ArrayList<BigInteger>());
        printList(new ArrayList<BoxDemo>());
        addNumbersUB(new ArrayList<Integer>());
    }

    /* Unbound wildcard */
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    /* Upper bounded wildcard */
    public static void addNumbersUB(List<? extends Number> list) {
        return;
    }

    /* Lower bounded wildcard */
    public static void addNumbersLB(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
