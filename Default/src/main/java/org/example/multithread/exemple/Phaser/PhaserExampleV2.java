package org.example.multithread.exemple.Phaser;

import java.util.concurrent.Phaser;

import static org.example.multithread.helper.Constants.ONE;

public class PhaserExampleV2 {
    public static void start() {
        Phaser phaser = new Phaser(ONE); // Создаем Phaser с одним зарегистрированным участником (главным потоком)

        // Запускаем главный поток и потоки, которые будут добавлены динамически
        Thread mainThread = new Thread(() -> {
            System.out.println("MainThread " + Thread.currentThread().getId() + " started.");
            for (int i = 1; i <= 3; i++) {
                // Добавляем новый поток в Phaser
                phaser.register();
                Thread workerThread = new Thread(() -> {
                    System.out.println("WorkerThread " + Thread.currentThread().getId() + " started.");
                    phaser.arriveAndAwaitAdvance(); // Ожидаем другие потоки
                    System.out.println("WorkerThread " + Thread.currentThread().getId() + " finished.");
                    phaser.arriveAndDeregister(); // Удаляем поток из Phaser
                });
                workerThread.start();
            }
            // Даем команду всем добавленным потокам перейти к следующей фазе
            phaser.arriveAndDeregister(); // Удаляем главный поток из Phaser
            System.out.println("MainThread " + Thread.currentThread().getId() + " deregister.");
        });

        mainThread.start();

        // Даем время всем потокам завершиться
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
