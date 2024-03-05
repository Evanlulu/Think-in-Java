package com.evanlu.thinkinjava.rtti.dynamicproxy;

public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
//        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
