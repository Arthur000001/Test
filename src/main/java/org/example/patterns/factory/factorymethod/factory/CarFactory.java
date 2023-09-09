package org.example.patterns.factory.factorymethod.factory;

import lombok.Data;
import org.example.patterns.factory.factorymethod.model.Car;
import org.example.patterns.factory.factorymethod.model.Transport;

@Data
public class CarFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Car();
    }
}