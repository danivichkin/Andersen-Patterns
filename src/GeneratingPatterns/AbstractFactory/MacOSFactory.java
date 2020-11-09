package GeneratingPatterns.AbstractFactory;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOsCheckbox();
    }
}
