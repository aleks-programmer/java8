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
    }
}
