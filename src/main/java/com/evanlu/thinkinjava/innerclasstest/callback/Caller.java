package com.evanlu.thinkinjava.innerclasstest.callback;

public class Caller {
    private Incremnetable callBackReference;
    Caller(Incremnetable cbh){
        callBackReference = cbh;
    }
    void go(){ callBackReference.increment(); }
}
