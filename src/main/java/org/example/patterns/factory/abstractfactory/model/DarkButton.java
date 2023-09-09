package org.example.patterns.factory.abstractfactory.model;

import org.example.patterns.factory.abstractfactory.factory.Button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a dark button");
    }
}