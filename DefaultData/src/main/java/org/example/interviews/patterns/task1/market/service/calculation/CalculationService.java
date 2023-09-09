package org.example.interviews.patterns.task1.market.service.calculation;

import org.example.interviews.patterns.task1.market.model.Rental;

import java.util.List;

/**
 * Сервис для расчета стоимости аренды машины
 * */
public interface CalculationService {
    Double calculatePartial(Rental rental, int thisAmount);

    Double calculateTotal(List<Rental> rentals);

}
