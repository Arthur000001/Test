package org.example.multithread.exemple.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
    public static void start() {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

        //Producer
        new Thread(() -> {
           int i = 0;
           while (true) {
               try {
                   arrayBlockingQueue.put(++i);
                   System.out.println("Producer put: " + i + " " + arrayBlockingQueue);
                   Thread.sleep(1500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }).start();

        //Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer take: " + j + " " + arrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
