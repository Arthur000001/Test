package org.example.core.pecs.attempt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Attempt1 {
    /**
     * В этом примере List<? extends Number> допускает чтение элементов, но не допускает добавление элементов,
     * тогда как List<? super Integer> допускает добавление элементов типа Integer и всех его подклассов,
     * но не допускает чтение элементов с уверенностью в их типе.
     * */
    public static void start() {
        List<Integer> list = new ArrayList<>();
        consumerSuper(list);
        producerExtends(list);
        System.out.println(list.stream()
                .map(el -> Integer.toString(el))
                .collect(Collectors.joining(",")));
    }
    /**
     * List<? extends Number>:
     * Можно брать элементы из списка, но неизвестно, точно какого типа эти элементы.
     * Например, вы можете делать следующее:
     * */
    public static void producerExtends(List<? extends Number> numbers) {
        // Можно получать элементы
        Number number = numbers.get(0);
        // Однако, нельзя добавлять элементы в такой список, так как компилятор не знает точного типа элементов
        // и не может гарантировать их безопасность:
        // numbers.add(1); // Ошибка компиляции
        System.out.println("producerExtends: " + number.toString());
    }
    /**
     * List<? super Integer>:
     * Можно добавлять элементы в список, но только если они являются Integer или его подклассами.
     * Можно брать элементы из списка, но они будут рассматриваться как объекты типа Object.
     * Например, вы можете делать следующее:
     * */
    public static void consumerSuper(List<? super Integer> integers) {
        // Можно добавлять элементы типа Integer и его подклассов
        integers.add(10);integers.add(20);integers.add(30);integers.add(40);integers.add(50);integers.add(60);
        // Полученный элемент рассматривается как Object
        Object obj = integers.get(0);
        // Если вы попытаетесь получить элемент как Integer, вам придется выполнить явное приведение типов:
        Integer integer = (Integer) integers.get(0);
        System.out.println("consumerSuper: " + integer.toString());
    }
    /**
     *     Используйте List<? extends T> и List<? super T> в зависимости от вашего намерения с контейнером.
     *     Если вы только собираетесь читать данные, используйте extends, а если вы планируете добавлять данные,
     *     используйте super.
     * */

}