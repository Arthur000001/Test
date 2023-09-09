package org.example.patterns.factory.abstractfactory.model;

import org.example.patterns.factory.abstractfactory.factory.InputField;

public class DarkInputField implements InputField {
    @Override
    public void render() {
        System.out.println("Render a dark input field");
    }
}