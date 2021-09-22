package com.designpattern.multithread.twophrasetermination.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        System.out.println("main: BEGIN");
        try {
            // �X���b�h�̋N��
            CountupThread t = new CountupThread();
            t.start();

            // �������Ԃ�������
            Thread.sleep(10000);

            // �X���b�h�̏I���v��
            System.out.println("main: shutdownRequest");
            t.shutdownRequest();

            System.out.println("main: join");

            // �X���b�h�̏I����҂�
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main: END");
    }
}
