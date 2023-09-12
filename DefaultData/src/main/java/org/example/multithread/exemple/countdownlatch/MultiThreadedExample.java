package org.example.multithread.exemple.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MultiThreadedExample {
    public static void start() throws InterruptedException {
        int threadCount = 5;
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            Thread workerThread = new Thread(new WorkerThread(latch));
            workerThread.start();
        }

        // Ожидаем, пока все потоки завершат выполнение
        latch.await();

        System.out.println("Все потоки завершили выполнение. Программа завершена.");
    }
}