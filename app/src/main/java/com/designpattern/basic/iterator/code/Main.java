package com.designpattern.basic.iterator.code;

import android.util.Log;

import com.designpattern.AbsMainCode;

import java.util.Iterator;

public class Main extends AbsMainCode {

    @Override
    protected void main() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.mBooks[0] = new Book("zero");
        bookShelf.mBooks[1] = new Book("one");
        bookShelf.mBooks[2] = new Book("two");
        bookShelf.mBooks[3] = new Book("tree");

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            Log.e("book", book.getName());
        }
    }
}
