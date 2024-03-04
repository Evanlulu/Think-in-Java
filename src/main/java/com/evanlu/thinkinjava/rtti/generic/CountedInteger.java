package com.evanlu.thinkinjava.rtti.generic;

public class CountedInteger {
    private static long counter;
    private final long id = counter ++;
    @Override
    public String toString(){
        return Long.toString(id);
    }
}
