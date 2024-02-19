package com.evanlu.thinkinjava.interfacetest.basic.waveform;

public class HighPass {
    double cutoff;
    public HighPass(double cutoff){this.cutoff = cutoff;}
    public Waveform process(Waveform input){
        return input;
    }
}
