package com.evanlu.thinkinjava.generic.tuple;

public class FourTuple <A,B,C,D> extends ThreeTuple{
    public final D fourth;

    public FourTuple(A first, B second, C third, D fourth) {
        super(first, second, third);
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "FourTuple{" +
                "fourth=" + fourth +
                '}';
    }
}
