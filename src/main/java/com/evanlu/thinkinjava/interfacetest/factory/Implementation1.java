package com.evanlu.thinkinjava.interfacetest.factory;

public class Implementation1 implements Service{
    Implementation1(){}
    @Override
    public void method1() {
        System.out.println("Imple1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Imple1 method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };//匿名內部類
}
