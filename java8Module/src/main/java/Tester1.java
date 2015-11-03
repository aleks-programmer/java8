import java.io.IOException;
import java.util.EmptyStackException;

/**
 * Created by aleks on 29.10.15.
 */
public class Tester1 {
    public static void test1() {
            String s = null;
            s.hashCode();
    }
    public static void test2() {

            String s = null;
            throw new OutOfMemoryError();

    }
    public static void test3() {

            String s = null;
            throw new EmptyStackException();

    }
}
