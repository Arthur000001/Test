package org.example.interviews.patterns.task1.market.service.print;

import org.example.interviews.patterns.task1.market.model.Customer;

/**
 * Сервис для вывода на экран информации и стоимости аренды машин
 * */
public interface PrintService {
    void printAllRentals(Customer customer, Double totalAmount, Double loyaltyPoints);
}
