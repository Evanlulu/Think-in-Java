package com.evanlu.thinkinjava.interfacetest.waveform;

public class Filter{
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return  input;
    }
}
