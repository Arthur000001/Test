package org.example.interviews.patterns.task1.market.model.typecar;

import org.example.interviews.patterns.task1.market.service.calculation.helper.SettlementBase;
import org.example.interviews.patterns.task1.market.model.Car;

/**
 * Реализация под модели машин Electrical
 * */
public class ElectricalCar extends Car {
    public ElectricalCar(String title, SettlementBase priceCode, double price) {
        super(title, priceCode, price);
    }
}
