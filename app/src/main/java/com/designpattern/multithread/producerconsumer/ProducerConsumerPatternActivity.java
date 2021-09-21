package com.designpattern.multithread.producerconsumer;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.producerconsumer.code.Main;

import java.util.ArrayList;

public class ProducerConsumerPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = ProducerConsumerPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("producerとconsumerが別スレッドをで動くとき、安全にデータを渡すため");
        strings.add("producerとconsumerの橋渡し役となりスレッド間のズレを埋める");
        strings.add("スレッド間の処理進行に左右されないように一つchannel役を用意することが大切");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("データを安全に受け渡しする。");
        return strings;
    }
}
