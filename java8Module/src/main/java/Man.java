/**
 * Created by aleks on 16.12.15.
 */
public class Man extends Person {
    public Man(String name, Sex gender, int age, String emailAddress) {
        super(name, gender, age, emailAddress);
    }

    public void manMethod() {
        System.out.println("I am the man!!!");
    }
}
