package org.example.patterns.bulding;

import lombok.Data;

/**
 * Директор
 * */
@Data
public class Director {
    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructGamingComputer() {
        builder.buildProcessor("Intel i9");
        builder.buildRAM(32);
        builder.buildStorage(512);
    }

    public void constructOfficeComputer() {
        builder.buildProcessor("Intel i5");
        builder.buildRAM(8);
        builder.buildStorage(256);
    }
}