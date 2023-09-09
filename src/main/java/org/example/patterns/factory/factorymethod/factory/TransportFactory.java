package org.example.patterns.factory.factorymethod.factory;

import org.example.patterns.factory.factorymethod.model.Transport;

public abstract class TransportFactory {
    public void planDelivery() {
        Transport transport = createTransport();
        transport.drive();
    }

    // Фабричный метод, который должны реализовать подклассы
    abstract Transport createTransport();
}