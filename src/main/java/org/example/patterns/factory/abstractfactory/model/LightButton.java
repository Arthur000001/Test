package org.example.patterns.factory.abstractfactory.model;

import org.example.patterns.factory.abstractfactory.factory.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a light button");
    }
}