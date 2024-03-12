package com.evanlu.thinkinjava.generic.mix;

public class BasicImp implements Basic{
    private String value;
    @Override
    public void set(String val) {
        value = val;
    }

    @Override
    public String get() {
        return value;
    }
}
