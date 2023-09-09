package org.example.patterns.factory.abstractfactory.factory;

import org.example.patterns.factory.abstractfactory.factory.Button;
import org.example.patterns.factory.abstractfactory.factory.InputField;

public interface UIFactory {
    Button createButton();
    InputField createInputField();
}