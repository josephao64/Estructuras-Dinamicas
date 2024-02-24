import java.awt.*;

class WindowsFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
