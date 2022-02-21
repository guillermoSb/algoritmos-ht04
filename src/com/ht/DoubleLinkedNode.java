package com.ht;

public class DoubleLinkedNode<E> {
    protected E data;   // Store the node data
    protected DoubleLinkedNode<E> nextElement; // Store a reference to the next element
    protected DoubleLinkedNode<E> previousElement; // Store a reference to the prev element

    /**
     * Create a node with all the params.
     * @param data
     * @param nextElement
     */
    public DoubleLinkedNode(E data, DoubleLinkedNode<E> previousElement,DoubleLinkedNode<E> nextElement) {
        this.data = data;
        this.nextElement = nextElement;
        this.previousElement = previousElement;
    }

    /**
     * Create a Node with only the data (nextElement is null).
     * @param data
     */
    public DoubleLinkedNode(E data) {
        this(data, null, null);
    }

    /**
     * Get the next Node
     * @return
     */
    public DoubleLinkedNode<E> next() {return this.nextElement;}

    public DoubleLinkedNode<E> previous() {return this.previousElement;}

    /**
     * Set the next node
     * @param next
     */
    public void setNext(DoubleLinkedNode<E> next) {
        this.nextElement = next;
    }

    /**
     * Set the previous node
     * @param next
     */
    public void setPrevious(DoubleLinkedNode<E> previousElement) {
        this.previousElement = previousElement;
    }

    /**
     * Get the current value for the data
     * @return
     */
    public E value() {
        return this.data;
    }

    /**
     * Set the new value for data
     * @param value
     */
    public void setValue(E value) {
        this.data = value;
    }

}
