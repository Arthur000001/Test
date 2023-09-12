package org.example.interviews.coreknowledge.task2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergingArrays {
    public static void start() {
        System.out.println("[RESULT TASK 2]:");
        int [] mass1 = new int[]{3, 4, 5, 6, 7};
        int [] mass2 = new int[]{1, 2, 8, 9, 10};
        //mass = getMassVariant2(mass1, mass2);
        print("Mass2: ", getMassVariant2(mass1, mass2));
        print("Mass3: ", getMassVariant3(mass1, mass2));
    }

    public static int [] getMassVariant4(int[] mass1, int[] mass2) {
        return IntStream.concat(Arrays.stream(mass1), Arrays.stream(mass2)).sorted().toArray();
    }

    public static int [] getMassVariant3(int[] mass1, int[] mass2) {
        return IntStream.concat(
                Arrays.stream(mass1),
                Arrays.stream(mass2)
        ).sorted().toArray();
    }
    public static int [] getMassVariant2(int [] mass1, int [] mass2) {
        return IntStream
                .concat(Arrays.stream(mass1), Arrays.stream(mass2))
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

    public static void print(String nameMass, int [] mass) {
        System.out.print(nameMass);
        IntStream.of(mass).forEach(el -> System.out.print(" " + el));
        System.out.println();
    }
}