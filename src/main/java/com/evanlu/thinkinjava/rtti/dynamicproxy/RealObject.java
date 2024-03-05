package com.evanlu.thinkinjava.rtti.dynamicproxy;

public class RealObject implements Interface{
    @Override
    public void doSomething() {
        System.out.println("do somethings");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("something Else " + arg);
    }
}
