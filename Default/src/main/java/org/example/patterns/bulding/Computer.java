package org.example.patterns.bulding;

import lombok.Data;

/**
 * Продукт
 * */
@Data
public class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }
}