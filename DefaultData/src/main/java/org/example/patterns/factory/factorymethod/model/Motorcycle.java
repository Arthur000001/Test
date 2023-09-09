package org.example.patterns.factory.factorymethod.model;

import lombok.Data;

@Data
public class Motorcycle implements Transport {
    private String name;
    @Override
    public void drive() {
        System.out.println("Driving a motorcycle");
    }
}