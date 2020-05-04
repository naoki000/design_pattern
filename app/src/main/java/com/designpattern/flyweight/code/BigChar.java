package com.designpattern.flyweight.code;

import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private static String TAG = BigChar.class.getSimpleName();
    // �����̖��O
    private char charname;
    // �傫�ȕ�����\�����镶����('#' '.' '\n'�̗�)
    private String fontdata;
    // �R���X�g���N�^
    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("big" + charname + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }
    // �傫�ȕ�����\������
    public void print() {
        Log.e(TAG, fontdata);
    }
}
