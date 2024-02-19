package com.evanlu.thinkinjava.interfacetest.afterinterface;

import com.evanlu.thinkinjava.interfacetest.processor.Processor;

import java.util.Arrays;

public class SplitterImp extends StringProcessor {
    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
