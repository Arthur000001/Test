package org.example.interviews.patterns.task1.market.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Модель группы Rental
 * */
@Data
@AllArgsConstructor
public class GroupRentals {
    private List<Rental> rentals;
    double totalAmount;
    double totalLoyaltyPoints;
}
