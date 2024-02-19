package com.evanlu.thinkinjava.interfacetest.basic.processor;

import java.util.Arrays;

public class Splitter extends Processor{
    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
