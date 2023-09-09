package org.example.interviews.leetcode.task2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergingArrays {
    public static void start() {

        int [] mass1 = new int[]{3, 4, 5, 6, 7};
        int [] mass2 = new int[]{1, 2, 8, 9, 10};
        //int [] mass = getMassVariant1(mass1, mass2);
        int [] mass = getMassVariant2(mass1, mass2);
        IntStream.of(mass).forEach(el -> System.out.print(" " + el));
    }

    public static int [] getMassVariant2(int [] mass1, int [] mass2) {
        return IntStream.concat(Arrays.stream(mass1), Arrays.stream(mass1))
                .sorted()
                .toArray();
    }

    public static int [] getMassVariant1(int [] mass1, int [] mass2) {
        int size = mass1.length + mass2.length;
        int [] massNew = new int[mass1.length + mass2.length];
        for (int j = 0; j < size; j++) {
            for (int l = 1; l < size; l++) {
                if (mass1[j] < mass2[l]) {
                    massNew[j] = mass2[l];
                }
            }
        }
        return massNew;
    }
}