package org.example.multithread.exemple.FutureTask;

import java.util.Random;

public class Helper {
    public static Integer getRandomInteger(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static java.util.concurrent.FutureTask<Integer> getTask() {
        return new java.util.concurrent.FutureTask<>(() -> {
            Thread.sleep(5000);
            return getRandomInteger(0, 100);
        });
    }
}
