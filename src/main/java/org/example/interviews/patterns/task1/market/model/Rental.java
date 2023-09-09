package org.example.interviews.patterns.task1.market.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Модель аренды
 * */
@Data
@AllArgsConstructor
public class Rental {
    private Car car;
    private int period;
    private double loyaltyPoints;
}
