package com.evanlu.thinkinjava.interfacetest.factory;

public class Implementation1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation1();
    }
}
