package org.example.multithread.exemple.FutureTask;

import java.util.concurrent.ExecutionException;

/**
 *     >  Запуска асинхронных задач: Вы можете обернуть вашу задачу в FutureTask и передать его в исполнение в отдельный поток,
 *         используя, например, ExecutorService.
 *     >  Получения результата: Вы можете получить результат задачи, когда он станет доступным. Если задача еще не выполнена,
 *         вызов метода get() будет блокировать текущий поток до тех пор, пока результат не будет доступен.
 *     >  Проверки наличия результата: Вы можете проверить, завершилась ли задача и доступен ли результат, с помощью метода isDone().
 *     >  Отмены задачи: Вы можете попытаться отменить задачу, вызвав метод cancel(). Отмененная задача не обязательно завершится,
 *         но вы сможете проверить, была ли она успешно отменена.
 */
public class FutureTask {

    public static void start() throws ExecutionException, InterruptedException {
        java.util.concurrent.FutureTask<Integer> futureTask1 = Helper.getTask();
        java.util.concurrent.FutureTask<Integer> futureTask2 = Helper.getTask();
        java.util.concurrent.FutureTask<Integer> futureTask3 = Helper.getTask();

        Thread thread1 = new Thread(futureTask1);
        Thread thread2 = new Thread(futureTask2);
        Thread thread3 = new Thread(futureTask3);

        thread1.start();
        thread2.start();
        thread3.start();

        Integer result1 = futureTask1.get();
        Integer result2 = futureTask2.get();
        Integer result3 = futureTask3.get();

        System.out.println("Результат: " + result1 + "|" + result2 + "|" + result3);
    }
}