package abstr4ct.factory.factories;


import abstr4ct.factory.buttons.Button;
import abstr4ct.factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}