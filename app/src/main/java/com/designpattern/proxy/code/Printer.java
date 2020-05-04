package com.designpattern.proxy.code;

import android.util.Log;

//こいつはproxy経由で呼ばれているか、直接呼ばれるかは考えない（Proxyと依存性がない）
public class Printer implements Printable {
    private static String TAG = Printer.class.getSimpleName();
    private String name;

    //このprinterは、インスタンス生成時の処理が重い
    public Printer() {
        heavyJob("make Printer instance");
    }

    public Printer(String name) {                   // �R���X�g���N�^
        this.name = name;
        heavyJob("make Printer instance " + name );
    }

    public void setPrinterName(String name) {       // ���O�̐ݒ�
        this.name = name;
    }

    public String getPrinterName() {                // ���O�̎擾
        return name;
    }

    public void print(String string) {              // ���O�t���ŕ\��
       Log.e(TAG, "=== " + name + " ===");
       Log.e(TAG, string);
    }

    private void heavyJob(String msg) {             //重い作業
        Log.e(TAG, msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            Log.e(TAG, ".");
        }
       Log.e(TAG, "done");
    }
}
