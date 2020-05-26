package com.designpattern.basic.visitor.code;

public abstract class Entry implements Element {
    private static String TAG = Entry.class.getSimpleName();

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + " {" + getSize() + "}";
    }
}

