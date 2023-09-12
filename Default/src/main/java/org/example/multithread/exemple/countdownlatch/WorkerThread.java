package org.example.multithread.exemple.countdownlatch;

import java.util.concurrent.CountDownLatch;

class WorkerThread implements Runnable {
    private final CountDownLatch latch;

    public WorkerThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

        try {
            // Симулируем выполнение работы в потоке
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println(Thread.currentThread().getName() + " завершил выполнение.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            // Уменьшаем счетчик CountDownLatch после завершения работы
            latch.countDown();
        }

    }
}