package patterns.abstractfactory;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MacOSXWindow();
    }
}
