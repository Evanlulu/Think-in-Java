package com.evanlu.thinkinjava.innerclasstest.callback;

public class Callee1 implements Incremnetable{
    private int i = 0;
    @Override
    public void increment() {
        i ++;
        System.out.println(i);
    }
}
