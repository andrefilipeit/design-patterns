package abstr4ct.factory.factories;

import abstr4ct.factory.buttons.Button;
import abstr4ct.factory.buttons.MacOSButton;
import abstr4ct.factory.checkboxes.Checkbox;
import abstr4ct.factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}