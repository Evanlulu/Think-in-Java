package com.evanlu.thinkinjava.interfacetest.factory;

public class Implementation2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
