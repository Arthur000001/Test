package org.example.interviews.patterns.task1.market.model;

import org.example.interviews.patterns.task1.market.service.calculation.helper.SettlementBase;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Общая модель для машин
 * */
@Data
@AllArgsConstructor
public abstract class Car {
    private String title;
    private SettlementBase priceCode;
    private double price;
    public String getPrintPriceCareWithTitle() {
        return "\t" + title + "\t" + price + " $\n";
    }
}
