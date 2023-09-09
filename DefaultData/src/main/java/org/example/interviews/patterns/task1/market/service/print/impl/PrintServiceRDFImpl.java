package org.example.interviews.patterns.task1.market.service.print.impl;

import org.example.interviews.patterns.task1.market.model.Customer;
import org.example.interviews.patterns.task1.market.service.print.PrintService;

public class PrintServiceRDFImpl implements PrintService {
    @Override
    public void printAllRentals(Customer customer, Double totalAmount, Double loyaltyPoints) {
        System.out.println("PDF File");
    }
}
