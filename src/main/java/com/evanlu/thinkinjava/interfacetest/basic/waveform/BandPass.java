package com.evanlu.thinkinjava.interfacetest.basic.waveform;

public class BandPass extends Filter{
    double lowCutoff;
    double highCutoff;
    public BandPass(double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    @Override
    public  Waveform process(Waveform input){return  input;}
}
