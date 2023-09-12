package org.example.patterns.decorator.model;

import org.example.patterns.decorator.CoffeeDecorator;

public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.7;
    }
}