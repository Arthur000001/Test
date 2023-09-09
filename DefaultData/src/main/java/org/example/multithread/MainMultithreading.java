package org.example.multithread;

import org.example.multithread.exemple.ArrayBlockingQueue.ArrayBlockingQueueExample;
import org.example.multithread.exemple.CiclicBarrier.CiclicBarrierExample;
import org.example.multithread.exemple.LockCondition.LockConditionExample;
import org.example.multithread.exemple.Phaser.PhaserExampleV2;
import org.example.multithread.exemple.Reactor.ReactorJustExemple;
import org.example.multithread.exemple.TwoWayCommunicationV1.TwoWayCommunication1;
import org.example.multithread.exemple.TwoWayCommunicationV2.TwoWayCommunication2;

import java.util.concurrent.ExecutionException;

public class MainMultithreading {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //FutureTask.start();
        //ThreadLocalExampler.start();
        //StreamForkJoin.start();
        //TwoWayCommunication1.start();
        //TwoWayCommunication2.start();
        //CiclicBarrierExample.start();
        //PhaserExampleV2.start();
        //LockConditionExample.start();
        //ArrayBlockingQueueExample.start();
        ReactorJustExemple.start();
    }
}
