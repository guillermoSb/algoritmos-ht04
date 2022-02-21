package com.ht;

public class DoubleLinkedList<E> extends AbstractList<E>{

    protected DoubleLinkedNode<E> head;
    protected DoubleLinkedNode<E> tail;
    protected int count;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addFirst(E value) {
        head = new DoubleLinkedNode<E>(value, null, head);  // Add the new value at the start
        if(tail == null) tail = head;   // Set the new tail
        count ++;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) return null; // The list should not be empty
        return head.value();
    }

    @Override
    public E getLast() {
        if (isEmpty()) return null;
        return tail.value();
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        DoubleLinkedNode<E> temp = head;
        head = head.next();
        if(head == null) {
            tail = null;
        } else {
            head.setPrevious(null);
        }
        count --;
        return temp.value();
    }

    @Override
    public E remove() {
        if (isEmpty()) return null;
        DoubleLinkedNode<E> temp = tail;
        tail = tail.previous();
        if(tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count --;
        return temp.value();
    }

    @Override
    public void add(E value) {
        tail = new DoubleLinkedNode<E>(value, tail, null);
        if(head == null) head = tail;  // Assign the head to the tail if it is the first element
        count ++;
    }
}
