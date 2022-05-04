package java8_features.func_intf;

public class Simple {
    public static void main(String[] args) {
        ISimple s = () -> System.out.println("Hello");
        s.doSmth();
    }
}
