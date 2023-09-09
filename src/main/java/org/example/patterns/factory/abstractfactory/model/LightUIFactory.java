package org.example.patterns.factory.abstractfactory.model;

import org.example.patterns.factory.abstractfactory.factory.UIFactory;
import org.example.patterns.factory.abstractfactory.factory.Button;
import org.example.patterns.factory.abstractfactory.factory.InputField;

public class LightUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public InputField createInputField() {
        return new LightInputField();
    }
}