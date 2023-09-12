package org.example.patterns.factory.factorymethod.model;

import lombok.Data;

/**
 * Конкретные продукты
 * */
@Data
public class Car implements Transport {
    private String name;
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}