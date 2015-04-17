package com.company;

import java.util.ArrayList;

/**
 * Created by vladimir on 17.04.15.
 */
public class Stack<T> {
    ArrayList<T> objects = new ArrayList<T>();

    public void push (T element) {
        objects.add(element);
    }

    public T pop() {
        T temp =  objects.get(objects.size()-1);
        objects.remove(objects.size()-1);
        return temp;
    }

    public int size() {
        return objects.size();
    }
}
