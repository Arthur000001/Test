package org.example.coretwo.generic.exemple.Generic;

import java.util.ArrayList;
import java.util.List;

import static org.example.coretwo.generic.exemple.Generic.Helper.addNumbers;
import static org.example.coretwo.generic.exemple.Generic.Helper.sum;

public class Generic {
    public static void start() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        /**
            В этом примере метод sum принимает список чисел, но не делает изменений в нем.
            Он использует PECS с ограничением <? extends Number>, чтобы обеспечить возможность чтения чисел
            из списка независимо от конкретного типа чисел.
        */
        System.out.println(sum(numbers));
        /**
            В этом примере метод addNumbers добавляет целые числа в список.
            Он использует PECS с ограничением <? super Integer>, чтобы обеспечить возможность добавления
            чисел в список любого супертипа от Integer.
        */
        addNumbers(numbers.stream().map(el -> (Number)el).toList());

        //---------------Итог:
        System.out.println(sum(numbers));
    }
}