package com.designpattern.multithread.producerconsumer.code;

import android.util.Log;

public class Table {
    private static String TAG = Table.class.getSimpleName();
    //このクラスが、producerとconsumerのやり取りをしている
    // putとtakeはGuardedSuspensionパターンで書かれsyncronizedされているが、これを使うクラスEaterやMakerは
//他のスレッドのことを特に気にする必要ない
    private final String[] buffer;
    private int tail;  // ����put����ꏊ
    private int head;  // ����take����ꏊ
    private int count; // buffer���P�[�L��

    public Table(int count) {
        this.buffer = new String[count];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    // �P�[�L��u��
    public synchronized void put(String cake) throws InterruptedException {
        Log.d(TAG, Thread.currentThread().getName() + " puts " + cake);
        while (count >= buffer.length) {
            //ガード条件　!(count >= buffer.length)
            wait();
        }
        buffer[tail] = cake;
        tail = (tail + 1) % buffer.length;
        count++;
        notifyAll();
    }

    // �P�[�L�����
    public synchronized String take() throws InterruptedException {
        while (count <= 0) {
            wait();
        }
        String cake = buffer[head];
        head = (head + 1) % buffer.length;
        count--;
        notifyAll();
        Log.e(TAG, Thread.currentThread().getName() + " takes " + cake);
        return cake;
    }
}
