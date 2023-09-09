package org.example.patterns.factory.abstractfactory.model;

import org.example.patterns.factory.abstractfactory.factory.InputField;
import org.example.patterns.factory.abstractfactory.factory.UIFactory;
import org.example.patterns.factory.abstractfactory.factory.Button;

public class DarkUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public InputField createInputField() {
        return new DarkInputField();
    }
}