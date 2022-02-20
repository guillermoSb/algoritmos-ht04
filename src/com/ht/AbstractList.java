package com.ht;

public abstract class AbstractList<E> implements List<E> {
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
