package com.designpattern.visitor.code;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private static String TAG = Directory.class.getSimpleName();
    private String name;                    // ディレクトリの名前
    private ArrayList directory = new ArrayList();      // ディレクトリエントリの集合

    public Directory(String name) {         // コンストラクタ
        this.name = name;
    }

    public String getName() {               // 名前を得る
        return name;
    }

    public int getSize() {                  // サイズを得る
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {         // エントリの追加
        directory.add(entry);
        return this;
    }

    public Iterator iterator() {
        return directory.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

