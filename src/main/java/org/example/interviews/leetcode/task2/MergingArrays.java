package org.example.interviews.leetcode.task2;

public class MergingArrays {
    public static void start() {

        int [] mass1 = new int[]{3, 4, 5, 6, 7};
        int [] mass2 = new int[]{1, 2, 8, 9, 10};
        int [] mass = getMass(mass1, mass2);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }

    public static int [] getMass(int [] mass1, int [] mass2) {
        //int counter = 0;
        int [] mass = new int[mass1.length + mass2.length];
        int [] massNew = new int[mass1.length + mass2.length];
/*
        for (int i = 0; i < mass1.length; i++) {
            mass[counter] = mass1[i];
            counter++;
        }
        for (int i = 0; i < mass2.length; i++) {
            mass[counter] = mass2[i];
            counter++;
        }
        */
        for (int j = 0; j < mass.length; j++) {
            for (int l = 1; l < mass.length; l++) {
                if (mass1[j] < mass2[l]) {
                    massNew[j] = mass2[l];
                }
            }
        }
        return mass;
    }
}