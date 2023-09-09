package org.example.multithread.exemple.TwoWayCommunicationV1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static org.example.multithread.helper.Constants.MESSAGE;
import static org.example.multithread.helper.Constants.TWO;

public class TwoWayCommunication1 {
    public static void start() {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(TWO);

        Thread sender = new Thread(() -> {
            try {
                queue.put(MESSAGE);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread receiver = new Thread(() -> {
            try {
                String message = queue.take();
                System.out.println("Receiver received: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        sender.start();
        receiver.start();
    }
}
