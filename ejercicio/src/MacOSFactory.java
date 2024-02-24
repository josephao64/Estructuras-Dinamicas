import java.awt.*;

public class MacOSFactory implements AbstractFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Window createWindow() {
        return new MacOsWindow();
    }

    @Override
    public TextField createTextField() {
        return new MacOsTextField();
    }
}
