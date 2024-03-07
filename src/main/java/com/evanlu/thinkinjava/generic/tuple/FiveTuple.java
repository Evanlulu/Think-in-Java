package com.evanlu.thinkinjava.generic.tuple;

public class FiveTuple <A,B,C,D,E> extends FourTuple{
    public final E fifth;

    public FiveTuple(A first, B second, C third, D fourth, E fifth) {
        super(first, second, third, fourth);
        this.fifth = fifth;
    }

    @Override
    public String toString() {
        return "FiveTuple{" +
                "fifth=" + fifth +
                '}';
    }
}
