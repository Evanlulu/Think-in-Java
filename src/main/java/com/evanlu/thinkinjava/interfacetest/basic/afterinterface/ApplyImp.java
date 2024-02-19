package com.evanlu.thinkinjava.interfacetest.basic.afterinterface;

public class ApplyImp {
    public static void process(Processor p, Object s){
        System.out.println("Using Processor" + p.name());
        System.out.println(p.process(s));
    }
}
