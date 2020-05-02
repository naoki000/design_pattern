package com.designpattern.iterator.code;

import java.util.Iterator;

public class BookShelf implements Aggregate {

    //listでやる
    public Book[] mBooks;

    public BookShelf(int max) {
        mBooks = new Book[max];
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
