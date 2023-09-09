package org.example.interviews.patterns.task1.market.service.calculation.impl;

import org.example.interviews.patterns.task1.market.model.Rental;
import org.example.interviews.patterns.task1.market.service.calculation.CalculationService;
import org.example.interviews.patterns.task1.market.service.calculation.helper.SettlementBase;

import java.util.List;

public final class CalculationServiceLoyaltlyPointImpl implements CalculationService {

    @Override
    public Double calculatePartial(Rental rental, int thisAmount) {
        double loyaltyPoints = rental.getLoyaltyPoints();
        loyaltyPoints++;
        return rental.getCar().getPriceCode().equals(SettlementBase.SETTLEMENT_BASE_FOR_REGULAR)
                && rental.getPeriod() > 1 ? loyaltyPoints + 1 : loyaltyPoints;
    }

    @Override
    public Double calculateTotal(List<Rental> rentals) {
        return rentals.stream()
                .map(Rental::getLoyaltyPoints)
                .reduce(0.0, Double::sum);
    }

}
