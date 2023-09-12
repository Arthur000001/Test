package org.example.interviews.patterns.task1.market.facade.impl;


import org.example.interviews.patterns.task1.market.facade.FacadeMove;
import org.example.interviews.patterns.task1.market.model.Customer;
import org.example.interviews.patterns.task1.market.model.GroupRentals;
import org.example.interviews.patterns.task1.market.model.Rental;
import org.example.interviews.patterns.task1.market.service.calculation.CalculationService;
import org.example.interviews.patterns.task1.market.service.calculation.impl.CalculationServiceLoyaltlyPointImpl;
import org.example.interviews.patterns.task1.market.service.calculation.impl.CalculationServicePriceRentalImpl;
import org.example.interviews.patterns.task1.market.service.print.PrintService;
import org.example.interviews.patterns.task1.market.service.print.impl.PrintServiceCheckImpl;

import java.util.List;

public class FacadeMoveImpl implements FacadeMove {
    private static final PrintService printServiceCheck = new PrintServiceCheckImpl();
    private static final CalculationService calcServiceLoyaltlyPoint = new CalculationServiceLoyaltlyPointImpl();
    private static final CalculationService calcServicePriceRental = new CalculationServicePriceRentalImpl();
    public void calculateAndPrintCheck(Customer customer) {
        List<Rental> rentals = customer.getGroupRentals().getRentals();
        rentals.forEach(el -> {
            el.getCar().setPrice(calcServicePriceRental.calculatePartial(el, 0));
            el.setLoyaltyPoints(calcServiceLoyaltlyPoint.calculatePartial(el, 0));
        });
        GroupRentals groupRentals = customer.getGroupRentals();
        groupRentals.setTotalAmount(calcServicePriceRental.calculateTotal(rentals));
        groupRentals.setTotalLoyaltyPoints(calcServiceLoyaltlyPoint.calculateTotal(rentals));
        printServiceCheck.printAllRentals(customer, groupRentals.getTotalAmount(), groupRentals.getTotalLoyaltyPoints());
    }
}
