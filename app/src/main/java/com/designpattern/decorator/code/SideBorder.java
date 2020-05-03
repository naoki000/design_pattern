package com.designpattern.decorator.code;

public class SideBorder extends Border {
    private static String TAG = SideBorder.class.getSimpleName();

    private char c;

    public SideBorder(Display display, char c) {
        super(display);
        this.c = c;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return c + display.getRowText(row) + c;
    }
}
