package com.evanlu.thinkinjava.interfacetest.afterinterface;

import com.evanlu.thinkinjava.interfacetest.processor.Splitter;
import com.evanlu.thinkinjava.interfacetest.processor.Upcase;

public class ApplyImp {
    public static void process(Processor p, Object s){
        System.out.println("Using Processor" + p.name());
        System.out.println(p.process(s));
    }
}
