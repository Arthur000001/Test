package org.example.patterns.bulding;

import lombok.Data;

/**
 * Конкретный строитель
 * */
@Data
public class ConcreteComputerBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private int storage;

    @Override
    public void buildProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void buildRAM(int ram) {
        this.ram = ram;
    }

    @Override
    public void buildStorage(int storage) {
        this.storage = storage;
    }

    public Computer getResult() {
        return new Computer(processor, ram, storage);
    }
}