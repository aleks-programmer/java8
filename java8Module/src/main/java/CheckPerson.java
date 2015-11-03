import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface CheckPerson {
    boolean test(Person p);

    default void printPersonsEmail(List<Person> roster) {

        List<Integer> stringList = new ArrayList<>();
        stringList.add(1);
        stringList.addAll(Arrays.asList(2));

        roster
                .stream()
                .filter(
                        p -> p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 25)
                .map(p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));
    }
}
