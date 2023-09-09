package org.example.multithread.exemple.ThreadLocal;

public class ThreadLocalExampler {
    public static void start() {
        Runnable task = () -> {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + Constants.THREAD_LOCAL.get());
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
