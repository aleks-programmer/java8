package java8_features.func_intf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {
    public static void main(String[] args) {
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
    }
}
