package com.designpattern.multithread.activeobject.code.util.activeobject;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

// ActiveObject�C���^�t�F�[�X�̎����N���X
class ActiveObjectImpl implements ActiveObject {
    private final ExecutorService service = Executors.newSingleThreadExecutor();

    // �T�[�r�X�̏I��
    public void shutdown() {
        service.shutdown();
    }

    // �߂�l�̂���Ăяo��
    public Future<String> makeString(final int count, final char fillchar) {
        // ���N�G�X�g
        class MakeStringRequest implements Callable<String> {
            public String call() {
                char[] buffer = new char[count];
                for (int i = 0; i < count; i++) {
                    buffer[i] = fillchar;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
                return new String(buffer);
            }
        }
        // ���N�G�X�g�̔��s
        return service.submit(new MakeStringRequest());
    }

    // �߂�l�̂Ȃ��Ăяo��
    public void displayString(final String string) {
        // ���N�G�X�g
        class DisplayStringRequest implements Runnable {
            public void run() {
                try {
                    System.out.println("displayString: " + string);
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }
        }
        // ���N�G�X�g�̔��s
        service.execute(new DisplayStringRequest());
    }
}
