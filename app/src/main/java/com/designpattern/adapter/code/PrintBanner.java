package com.designpattern.adapter.code;

public class PrintBanner implements IPrint {

    //委譲パターン
    private Banner banner;
    public PrintBanner(String str) {
        banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

//public class PrintBanner extends Banner implements IPrint {
//
//    public PrintBanner(String str) {
//        super(str);
//    }
//
//    @Override
//    public void printWeak() {
//        showWithParen();
//    }
//
//    public PrintBanner(String str) {
//        super(str);
//    }
//
//    @Override
//    public void printWeak() {
//        showWithParen();
//    }
}
