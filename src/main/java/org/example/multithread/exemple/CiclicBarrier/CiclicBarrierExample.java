package org.example.multithread.exemple.CiclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static org.example.multithread.helper.Constants.THREE;

public class CiclicBarrierExample {
    public static void start() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(THREE, () -> {
            System.out.println("All threads have reached the barrier.");
        });

        for (int i = 0; i < THREE; i++) {
            Thread thread = new Thread(() -> {
                System.out.println("Thread is ready and waiting at the barrier.");
                try {
                    cyclicBarrier.await(); // Ожидание других потоков
                } catch (InterruptedException | BrokenBarrierException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Thread has passed the barrier.");
            });
            thread.start();
        }
    }
}
