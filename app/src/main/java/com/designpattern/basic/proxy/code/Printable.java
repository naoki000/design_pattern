package com.designpattern.basic.proxy.code;

public interface Printable  {
    static String TAG = Printable.class.getSimpleName();
    void setPrinterName(String name);
    String getPrinterName();
    void print(String name);
}
