package com.ht;

public class ListStack<E> implements Stack<E> {

    List<E> data;

    ListStack(List<E> data) {
        this.data = data;
    }

    @Override
    public void add(E item) {
        data.add(item);
    }

    @Override
    public E remove() {
        return data.remove();
    }

    @Override
    public E peek() {
        return data.getLast();
    }

    @Override
    public boolean empty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }
}

