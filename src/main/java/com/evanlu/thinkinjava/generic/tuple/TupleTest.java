package com.evanlu.thinkinjava.generic.tuple;

public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return new TwoTuple<>("hi",47);
    }
    static ThreeTuple<Amphibian,String,Integer> g(){
        return new ThreeTuple<>(new Amphibian(),"hi",47);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(g());
    }
}
