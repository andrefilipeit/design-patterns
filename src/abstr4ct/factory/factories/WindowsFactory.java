package abstr4ct.factory.factories;

import abstr4ct.factory.buttons.Button;
import abstr4ct.factory.buttons.WindowsButton;
import abstr4ct.factory.checkboxes.Checkbox;
import abstr4ct.factory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}