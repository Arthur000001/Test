package org.example.multithread.exemple.TwoWayCommunicationV2;

import java.util.concurrent.Exchanger;

import static org.example.multithread.helper.Constants.MESSAGE;

public class TwoWayCommunication2 {
    public static void start() {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("Thread1 sending: " + MESSAGE);
                exchanger.exchange(MESSAGE);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                String receivedMessage = exchanger.exchange(null);
                System.out.println("Thread2 received: " + receivedMessage);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        thread1.start();
        thread2.start();
    }
}
