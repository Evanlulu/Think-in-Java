package com.evanlu.thinkinjava.interfacetest.basic.afterinterface;

import java.util.Arrays;

public class SplitterImp extends StringProcessor {
    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
