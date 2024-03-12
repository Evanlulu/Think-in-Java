package com.evanlu.thinkinjava.generic.mix;

public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(),mixin2 = new Mixin();
        mixin1.set("test String 1");
        mixin2.set("test String 2");
        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSeralNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSeralNumber());
    }
}
