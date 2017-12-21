package patterns.observer;

public class Client {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        Screen screen = new Screen();

        // add Observer screen
        dataStore.addObserver(screen);

        dataStore.setData("Hi");
        dataStore.notifyObservers();
        dataStore.setData("Hi1");
        dataStore.notifyObservers();
        dataStore.setData("Hi2");
        dataStore.setData("Hi3");
        dataStore.setData("Hi4");
        dataStore.notifyObservers();

        dataStore.deleteObserver(screen);
    }
}
