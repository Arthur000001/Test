package org.example.interviews.patterns.task1.market.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Модель клиента
 * */
@Data
@AllArgsConstructor
public class Customer {
    private String name;
    private GroupRentals groupRentals;
}
