package patterns.factorymethod;

public class XMLLogger implements Logger {
    public void log(String message) {
        System.err.println("logging");
    }
}