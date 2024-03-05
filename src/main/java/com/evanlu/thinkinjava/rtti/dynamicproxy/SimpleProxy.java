package com.evanlu.thinkinjava.rtti.dynamicproxy;

public class SimpleProxy implements Interface{
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    @Override
    public void doSomething() {
        System.out.println("simple proxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}
