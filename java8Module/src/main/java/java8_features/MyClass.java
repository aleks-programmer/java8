package java8_features;

/**
 * Created by aleks on 29.10.15.
 */
public class MyClass<X> {
    private volatile long i;
    <T> MyClass(T t) {

    }

    public MyClass(long i) {
        this.i = i;
    }

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }
}
