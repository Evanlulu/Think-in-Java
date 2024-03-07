package com.evanlu.thinkinjava.generic.tuple;

public class ThreeTuple <A,B,C> extends TwoTuple {
    public final C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "third=" + third +
                '}';
    }
}
