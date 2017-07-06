package java8_features;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aleks on 16.12.15.
 */
public class Man extends Person {
    public static Map<String, Object> map = new HashMap<>();

    @Override
    public void method2() {
        System.out.print(map.containsValue("1"));
    }

    public Man(String name, Sex gender, int age, String emailAddress) {
        super(name, gender, age, emailAddress);
    }

    public void manMethod() {
        System.out.println("I am the man!!!");
    }
}
