package org.example.interviews.patterns.task1.market.service.calculation.impl;

import crm.market.model.Rental;
import org.example.interviews.patterns.task1.market.service.calculation.CalculationService;

import java.util.List;

public final class CalculationServicePriceRentalImpl implements CalculationService {

    @Override
    public Double calculatePartial(Rental rental, int thisAmount) {
        return rental.getCar().getPriceCode().calculateRental(rental.getPeriod(), thisAmount);
    }

    @Override
    public Double calculateTotal(List<Rental> rentals) {
        return rentals.stream()
                .map(el -> el.getCar().getPrice())
                .reduce(0.0, Double::sum);
    }
}
