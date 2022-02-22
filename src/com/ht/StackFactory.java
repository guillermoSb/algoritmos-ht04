package com.ht;

public class StackFactory<E> {
    /**
     * Returns a Stack based on the type sent on the entry
     * V -> VectorStack
     * AL -> ArrayList
     * LS -> Simple Linked List
     * DL -> Double Linked list
     * @param entry
     * @return
     */
    public Stack<E> getStack(String entry) {
        if (entry.equals("V")) {
            return new VectorStack<E>(); // Vector Stack
        } else if (entry.equals("AL")) {
            return new ArrayListStack<E>(); // Array List Stack
        } else if (entry.equals("LS")) {
            return new ListStack<E>(new SimpleLinkedList<E>()); // Simple linked list stack
        } else if (entry.equals("DL")) {
            return new ListStack<E>(new DoubleLinkedList<>()); // Double Linked List Stack
        } else {return null;}
    }
}
