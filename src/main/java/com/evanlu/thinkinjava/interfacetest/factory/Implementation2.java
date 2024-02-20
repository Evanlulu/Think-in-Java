package com.evanlu.thinkinjava.interfacetest.factory;

public class Implementation2 implements Service{
    Implementation2(){}
    @Override
    public void method1() {
        System.out.println("Imple2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Imple2 method2");
    }
}
