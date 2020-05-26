package com.designpattern.basic.proxy.code;

import android.util.Log;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        //PrinterとPrinterProxyは同じ、Printableを実装しており、Mainでは、このクラスを用いることで、間接的に思いPrinterのクラスを使うことができる
        // (printするまでの情報をセットしたりできる)
        Printable printable = new PrinterProxy("Alice" , Printer.class.getName());
        Log.e(TAG, "name = " + printable.getPrinterName());
        printable.setPrinterName("Bob");
        Log.e(TAG, "name = " + printable.getPrinterName());
        printable.print("hello");//ここでやっと重いPrinterクラスが作成される。ここまでの処理を早くできる
    }
}
