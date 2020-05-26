package com.designpattern.basic.composite.code;

public abstract class Entry {
    private static String TAG = Entry.class.getSimpleName();

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " {" + getSize() + "}";
    }
}

