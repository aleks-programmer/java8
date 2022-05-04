package java8_features.func_intf;

public class SimpleWithArgs {
    public static void main(String[] args) {
        ISimpleWithArgs s = (i, j) -> System.out.println("i: " + i + ", j: " + j);
        s.doSmth(10, 20);
    }
}
