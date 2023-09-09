package org.example.multithread.exemple.StreamAPIForkJoinPool;

import java.util.Arrays;

public class StreamForkJoin {
    public static void start() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        long sum = Arrays.stream(array)
                .parallel() // Активирует параллельную обработку
                .filter(x -> x % 2 == 0)
                .sum();

        System.out.println("Sum of even numbers: " + sum);
    }
}
