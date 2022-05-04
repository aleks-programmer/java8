package java8_features;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Person implements Cloneable {
    public static Map<String, Object> map = new HashMap<>();

    public enum Sex {
        MALE, FEMALE
    }
 public Person(String name, Sex gender, int age, String emailAddress) {
     this.name = name;
     this.gender = gender;
     this.age = age;
     this.emailAddress = emailAddress;
     LocalDate birthday;
 }
    String name;
    int age;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
        // ...
    }
    public Sex getGender() {
        return gender;
        // ...
    }
    public String getEmailAddress() {
        return emailAddress;
        // ...
    }

    public void method1() {
        map.put("1", "1");
    }

    public void method2() {
        System.out.print(map.containsValue("1"));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printPerson() {
        System.out.println("java8_features.Person Name: " + name + "\n"
        + "java8_features.Person age: " + getAge() + "\n"
        + "java8_features.Person Sex: " + gender);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
