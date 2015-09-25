import java.time.LocalDate;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }
 public Person(String name, Sex gender, int age, String emailAddress) {
     this.name = name;
     this.gender = gender;
     this.age = age;
     this.emailAddress = emailAddress;
 }
    String name;
    int age;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

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

    public void printPerson() {
        System.out.println("Person Name: " + name + "\n"
        + "Person age: " + getAge() + "\n"
        + "Person Sex: " + gender);
    }
}
