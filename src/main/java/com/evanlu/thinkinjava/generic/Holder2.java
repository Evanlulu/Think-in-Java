package com.evanlu.thinkinjava.generic;

public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }
    public void set(Object a){ this.a = a; }

    public Object get(){ return a; }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new AutoMobile());
        AutoMobile a = (AutoMobile) holder2.get();
        holder2.set("NOT a AutoMobile");
        String s = (String) holder2.get();
        holder2.set(1);
        Integer x = (Integer) holder2.get();
    }
}
