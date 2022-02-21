package com.ht;
import java.util.Vector;

public class VectorStack implements Stack<Double> {

    Vector<Double> data;

    VectorStack() {
        data = new Vector<Double>();
    }

    @Override
    public void add(Double item) {
        data.add(item);
    }

    @Override
    public Double remove() {
        return data.remove(size() - 1);
    }

    @Override
    public Double peek() {
        return data.get(size() - 1);
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return data.size();
    }
  
}
