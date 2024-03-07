package com.evanlu.thinkinjava.generic;

public class Holder3<T> {
    private T a ;
    public Holder3(T a) {
        this.a = a;
    }
    public void set(T a){ this.a = a; }

    public T get(){ return a; }

    public static void main(String[] args) {
        Holder3<AutoMobile> h3 = new Holder3<>(new AutoMobile());
        AutoMobile autoMobile = h3.get();
//        h3.set("Not a AutoMobile");
    }
}
