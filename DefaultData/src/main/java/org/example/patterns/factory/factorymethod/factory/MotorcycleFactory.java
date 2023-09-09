package org.example.patterns.factory.factorymethod.factory;

import lombok.Data;
import org.example.patterns.factory.factorymethod.model.Motorcycle;
import org.example.patterns.factory.factorymethod.model.Transport;

@Data
public class MotorcycleFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Motorcycle();
    }
}