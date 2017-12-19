package patterns.factorymethod;

public abstract class AbstractLoggerCreator {
    public abstract Logger createLogger();

    public Logger getLogger() {
        Logger logger = createLogger();
        return logger;
    }
}