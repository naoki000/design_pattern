package com.designpattern.basic.abstractfactory.code.factory;

import android.util.Log;
//基本singleton

public abstract class Factory {
    private static String TAG = Factory.class.getSimpleName();

    public static Factory getFactory(String classname) {
        Factory factory = null;

        try {
            //注意:このインスタンスの生成方法では、必ず引数無しのコンストラクタが呼ばれる
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "not match");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }

    public abstract Link createL(String caption, String url);

    public abstract Tray createT(String caption);

    public abstract Page createP(String title, String author);
}
