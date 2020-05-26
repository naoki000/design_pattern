package com.designpattern.basic.iterator.code;

import java.util.Iterator;

public class BookShelfIterator implements Iterator {

    protected BookShelf mBookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        mBookShelf = bookShelf;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < mBookShelf.mBooks.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = mBookShelf.mBooks[index];
        index++;
        return book;
    }
}
