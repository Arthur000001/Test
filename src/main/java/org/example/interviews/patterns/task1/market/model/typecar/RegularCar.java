package org.example.interviews.patterns.task1.market.model.typecar;

import org.example.interviews.patterns.task1.market.service.calculation.helper.SettlementBase;
import org.example.interviews.patterns.task1.market.model.Car;

/**
 * Реализация под модели машин Regular
 * */
public class RegularCar extends Car {
    public RegularCar(String title, SettlementBase settlementBase, double price) {
        super(title, settlementBase, price);
    }
}
