package com.designpattern.memento.code;

import android.util.Log;

import com.designpattern.AbsMainCode;
import com.designpattern.memento.code.game.Gamer;
import com.designpattern.memento.code.game.Memento;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        Gamer gamer = new Gamer(100);               // 最初の所持金は100
        Memento memento = gamer.createMemento();    // 最初の状態を保存しておく
        for (int i = 0; i < 10; i++) {
            Log.e(TAG, "==== " + i);        // 回数表示
            Log.e(TAG, "現状:" + gamer);    // 現在の主人公の状態表示

            gamer.bet();    // ゲームを進める

            Log.e(TAG, "所持金は" + gamer.getMoney() + "円になりました。");

            // Mementoの取り扱いの決定
            if (gamer.getMoney() > memento.getMoney()) {
                Log.e(TAG, "    （だいぶ増えたので、現在の状態を保存しておこう）");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                Log.e(TAG, "    （だいぶ減ったので、以前の状態に復帰しよう）");
                gamer.restoreMemento(memento);
            }

            // 時間待ち
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            Log.e(TAG, "");
        }
    }
}
