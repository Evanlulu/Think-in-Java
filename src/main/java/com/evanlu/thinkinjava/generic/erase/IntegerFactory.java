package com.evanlu.thinkinjava.generic.erase;

public class IntegerFactory implements FactoryI<Integer>{
    @Override
    public Integer create() {
        return new Integer(0);
    }
}
