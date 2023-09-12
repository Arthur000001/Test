package org.example.multithread.exemple.LockCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionExample {
    public static void start() {
        System.out.println(Thread.currentThread().getName() + ": Создаем блокировку");
        Lock lock = new ReentrantLock();
        System.out.println(Thread.currentThread().getName() + ": Создаем объект Condition");
        Condition condition = lock.newCondition();

        // Поток ожидания
        Runnable awaitTask = () -> {
            System.out.println(Thread.currentThread().getName() + ": Захватываем блокировку");
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + ": Поток ожидает сигнала на условии");
                condition.await();
                System.out.println(Thread.currentThread().getName() + ": Просыпаемся и завершаем работу");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                System.out.println(Thread.currentThread().getName() + ": Освобождаем блокировку");
                lock.unlock();
            }
        };

        // Поток сигнализации
        Runnable signalTask = () -> {
            System.out.println(Thread.currentThread().getName() + ": Захватываем блокировку");
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + ": Небольшая пауза для имитации работы");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + ": Отправляем сигнал ожидающему потоку");
                condition.signal();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                System.out.println(Thread.currentThread().getName() + ": Освобождаем блокировку");
                lock.unlock();
            }
        };

        Thread awaitThread = new Thread(awaitTask);
        Thread signalThread = new Thread(signalTask);

        System.out.println(Thread.currentThread().getName() + ": Запускаем поток ожидания");
        awaitThread.start();

        try {
            System.out.println(Thread.currentThread().getName() + ": Дадим потоку ожидания начать ожидание");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main: Запускаем поток сигнализации");
        signalThread.start();

        try {
            System.out.println("Main: Ожидаем завершения потоков");
            awaitThread.join();
            signalThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
