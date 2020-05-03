package com.designpattern.decorator.code;

public class FullBorder extends Border {
    private static String TAG = FullBorder.class.getSimpleName();

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;

    }

    public String getRowText(int row) {         // 指定した行の内容
        if (row == 0) {                                                 // 上端の枠
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {                      // 下端の枠
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {                                                        // それ以外
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {         // 文字chをcount個連続させた文字列を作る
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }

}