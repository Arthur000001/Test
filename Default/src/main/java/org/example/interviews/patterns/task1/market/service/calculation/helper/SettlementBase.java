package org.example.interviews.patterns.task1.market.service.calculation.helper;

/**
 * База рассчета цены по каждой модели
 * */
public enum SettlementBase {
    SETTLEMENT_BASE_FOR_SPORT {
        @Override
        public double calculateRental(int period, int thisAmount) {
            thisAmount += 30;
            if (period > 2) {
                thisAmount += thisAmount + (period - 2) * 30;
            }
            return thisAmount;
        }
    },
    SETTLEMENT_BASE_FOR_REGULAR {
        @Override
        public double calculateRental(int period, int thisAmount) {
            return thisAmount + period * 10;
        }
    },
    SETTLEMENT_BASE_FOR_ELECTRIC {
        @Override
        public double calculateRental(int period, int thisAmount) {
            thisAmount += 15;
            if (period > 3) {
                thisAmount += (period - 3) * 15;
            }
            return thisAmount;
        }
    };

    public abstract double calculateRental(int period, int thisAmount);
}

