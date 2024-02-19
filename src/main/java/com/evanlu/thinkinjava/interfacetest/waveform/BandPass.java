package com.evanlu.thinkinjava.interfacetest.waveform;

public class BandPass {
    double lowCutoff;
    double highCutoff;
    public BandPass(double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public  Waveform process(Waveform input){return  input;}
}
