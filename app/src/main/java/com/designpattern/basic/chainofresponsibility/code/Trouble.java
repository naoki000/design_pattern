package com.designpattern.basic.chainofresponsibility.code;

public class Trouble {
    private int number;

    public Trouble(int number) {    // �g���u���̐���
        this.number = number;
    }

    public int getNumber() {        // �g���u���ԍ��𓾂�
        return number;
    }

    public String toString() {      // �g���u���̕�����\��
        return "[Trouble " + number + "]";
    }
}
