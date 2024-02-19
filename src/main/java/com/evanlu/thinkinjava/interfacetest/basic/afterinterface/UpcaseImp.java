package com.evanlu.thinkinjava.interfacetest.basic.afterinterface;


public class UpcaseImp extends StringProcessor {
    @Override
    public String process(Object input) {
        return  ((String)input).toUpperCase();
    }

}
