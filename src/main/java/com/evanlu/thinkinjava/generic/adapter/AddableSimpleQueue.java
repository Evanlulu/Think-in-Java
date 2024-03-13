package com.evanlu.thinkinjava.generic.adapter;

public class AddableSimpleQueue <T> extends SimpleQueue<T> implements Addable<T>{
    @Override
    public void add(T t) {
        super.add(t);
    }
}
