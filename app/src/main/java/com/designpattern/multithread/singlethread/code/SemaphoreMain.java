package com.designpattern.multithread.singlethread.code;

import java.util.Random;
import java.util.concurrent.Semaphore;

//Semaphoreを使った制御
//最大でNこまで実行できるように制御したいときに使う（singlethreadexecutionは一つのスレッド限定）
class Log {
    public static void println(String s) {
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }
}

class BoundedResource {
    private final Semaphore semaphore;
    private final int permits;
    private final static Random random = new Random(314159);

    public BoundedResource(int permits) {
        this.semaphore = new Semaphore(permits);
        this.permits = permits;
    }

    public void use() throws InterruptedException {
        semaphore.acquire();
        try {
            doUse();
        } finally {
            //必ずfinallyでrelease
            semaphore.release();
        }
    }

    protected void doUse() throws InterruptedException {
        Log.println("BEGIN: used = " + (permits - semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("END:   used = " + (permits - semaphore.availablePermits()));
    }
}

class CustomUserThread extends Thread {
    private final static Random random = new Random(26535);
    private final BoundedResource resource;

    public CustomUserThread(BoundedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            while (true) {
                resource.use();
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {
        }
    }
}

public class SemaphoreMain {
    private static String TAG = SemaphoreMain.class.getSimpleName();

    public static void main(String[] args) {
        //例として3個のスレッドを同時実行
        BoundedResource resource = new BoundedResource(3);

        for (int i = 0; i < 10; i++) {
            new CustomUserThread(resource).start();
        }
    }
}