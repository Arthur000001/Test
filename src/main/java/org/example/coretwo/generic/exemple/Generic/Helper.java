package org.example.coretwo.generic.exemple.Generic;

import java.util.List;

public class Helper {
    public static int sum(List<? extends Number> numbers) {
        Integer total = 0;
        for (Number num : numbers) {
            total += num.intValue();
        }
        return total;
    }

    public static void addNumbers(List<? super Number> numbers) {
        numbers.add(40);
        numbers.add(50);
    }
}
