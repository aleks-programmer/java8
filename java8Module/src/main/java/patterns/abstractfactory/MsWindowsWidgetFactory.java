package patterns.abstractfactory;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MSWindow();
    }
}
