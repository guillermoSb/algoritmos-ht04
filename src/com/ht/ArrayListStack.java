package com.ht;
import java.util.ArrayList;

public class ArrayListStack<E> implements Stack<E> {

    ArrayList<E> data;

    ArrayListStack() {
        data = new ArrayList<E>();
    }

    @Override
    public void add(E item){
        data.add(item);
    }

    @Override
    public E remove(){
        if (!empty()) { // checks for an empty Stack
            E value = data.get(data.size() - 1);
            data.remove(data.size() - 1); // removes the poped element             
            return value;
        }    else {
            System.out.print("The stack is already empty  ");
            return null;
        }
    }

    @Override
    public E peek(){
        return data.get(data.size() - 1);
    }

    @Override
    public boolean empty(){
        return size() == 0;
    }

    @Override
    public int size(){
        return data.size();
    }

}
