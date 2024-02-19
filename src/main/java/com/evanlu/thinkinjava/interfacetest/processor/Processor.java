package com.evanlu.thinkinjava.interfacetest.processor;


public class Processor  {
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}
