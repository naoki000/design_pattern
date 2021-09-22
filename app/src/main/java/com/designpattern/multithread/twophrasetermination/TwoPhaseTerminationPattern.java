package com.designpattern.multithread.twophrasetermination;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.twophrasetermination.code.Main;

import java.util.ArrayList;

public class TwoPhaseTerminationPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = TwoPhaseTerminationPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("スレッド終了時、終了処理をきちんと行ってから終了するパターン");
        strings.add("安全に終了すること、必ず終了処理を行う事、終了要求を出したら出来るだけ早く終了すること");
        strings.add("");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("");
        return strings;
    }
}
