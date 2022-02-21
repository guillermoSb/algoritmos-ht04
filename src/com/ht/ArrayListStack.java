package com.ht;
import java.util.ArrayList;

public class ArrayListStack implements Stack<Double> {

    ArrayList<Double> data;

    ArrayListStack() {
        data = new ArrayList<Double>();
    }

    @Override
    public void add(Double item){
        data.add(item);
    }

    @Override
    public Double remove(){
        if (!empty()) { // checks for an empty Stack
            double value = data.get(data.size() - 1);
            data.remove(data.size() - 1); // removes the poped element             
            return value;
        }    else {
            System.out.print("The stack is already empty  ");
            return -1.0;
        }
    }

    @Override
    public Double peek(){
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
