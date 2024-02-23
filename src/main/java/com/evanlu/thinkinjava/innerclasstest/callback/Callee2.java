package com.evanlu.thinkinjava.innerclasstest.callback;

import com.evanlu.thinkinjava.interfacetest.nested.A;

public class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incremnetable{

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }
    Incremnetable getCallbackReference(){
        return new Closure();
    }
}
