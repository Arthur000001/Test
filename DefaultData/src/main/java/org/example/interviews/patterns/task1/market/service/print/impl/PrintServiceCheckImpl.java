package org.example.interviews.patterns.task1.market.service.print.impl;

import org.example.interviews.patterns.task1.market.model.Customer;
import org.example.interviews.patterns.task1.market.service.print.PrintService;

import java.util.stream.Collectors;

public class PrintServiceCheckImpl implements PrintService {
    @Override
    public void printAllRentals(Customer customer, Double totalAmount, Double loyaltyPoints) {
        String result = "Rental Record for " + customer.getName() + "\n";
        result += customer.getGroupRentals().getRentals().stream()
                .map(e -> e.getCar().getPrintPriceCareWithTitle())
                .collect(Collectors.joining());
        result += "Amount price is " + totalAmount + " $\n";
        result += "You earned " + loyaltyPoints + " loyalty points";
        System.out.println(result);
    }
}
