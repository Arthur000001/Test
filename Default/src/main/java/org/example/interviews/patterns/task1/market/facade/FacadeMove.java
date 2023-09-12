package org.example.interviews.patterns.task1.market.facade;


import org.example.interviews.patterns.task1.market.model.Customer;

/**
 * Фасад для какого-нибудь действия клиента, к примеру сходить посчитать цену машин и напечатать чек ;)
 * */
public interface FacadeMove {
    void calculateAndPrintCheck(Customer customer);
}
