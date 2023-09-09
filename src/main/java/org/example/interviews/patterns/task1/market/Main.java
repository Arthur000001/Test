package org.example.interviews.patterns.task1.market;

import crm.market.facade.FacadeMove;
import crm.market.facade.impl.FacadeMoveImpl;
import crm.market.model.Customer;
import crm.market.model.GroupRentals;
import crm.market.model.Rental;
import crm.market.model.typecar.ElectricalCar;
import crm.market.model.typecar.RegularCar;
import crm.market.model.typecar.SportCar;

import java.util.Arrays;
import java.util.List;

import static crm.market.service.calculation.helper.SettlementBase.*;

public class Main {
    private static final FacadeMove facadeMove = new FacadeMoveImpl();
    public static final List<Rental> RENTALS = Arrays.asList(
            new Rental(new SportCar("Ferrari F40", SETTLEMENT_BASE_FOR_SPORT, 0.0), 1, 0),
            new Rental(new RegularCar("Ford Focus", SETTLEMENT_BASE_FOR_REGULAR, 0.0), 4, 0),
            new Rental(new ElectricalCar("Tesla model 3", SETTLEMENT_BASE_FOR_REGULAR, 0.0), 5, 0)
    );

    public static void main(String[] args) {
        Customer customer = new Customer("Vasiliy Pupkin",
                new GroupRentals(RENTALS, 0.0, 0));
        facadeMove.calculateAndPrintCheck(customer);
    }
}