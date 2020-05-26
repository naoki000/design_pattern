package com.designpattern.basic.proxy.code;

import android.util.Log;

//Printerクラスは、インスタンス生成にじかんがかかる
//なのでprint()するまで、インスタンスを生成しないでPrinterに必要な処理を代わりにやっておく
//PrinterとPrinterProxyは同じ、Printableを実装しており、Mainでは、このクラスを用いることで、間接的に思いPrinterのクラスを使うことができる
//(printするまでの情報をセットしたりできる)
public class PrinterProxy implements Printable {
    private static String TAG = PrinterProxy.class.getSimpleName();

    private String name;
    private Printable real;
    private String classname;

    PrinterProxy(){
    }

    PrinterProxy(String name, String classname){
        this.name = name;
        this.classname = classname;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String name) {
        realize();
        real.print(name);
    }

    private synchronized void realize() {
        //これで、このクラスがPrinterを知らなくてもよくなる
        try {
            if (real == null) {
                real = (Printable) Class.forName(classname).newInstance();
                real.setPrinterName(name);
            }
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
