package com.evanlu.thinkinjava.generic.functional;

public class IntegerSubracter implements Combiner<Integer> {
    @Override
    public Integer combine(Integer x, Integer y) {
        return  x - y ;
    }
}
