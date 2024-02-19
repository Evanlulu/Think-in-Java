package com.evanlu.thinkinjava.interfacetest.basic.afterinterface;

import com.evanlu.thinkinjava.interfacetest.basic.waveform.BandPass;
import com.evanlu.thinkinjava.interfacetest.basic.waveform.LowPass;
import com.evanlu.thinkinjava.interfacetest.basic.waveform.Waveform;

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        ApplyImp.process(new FilterAdapter(new LowPass(1.0)), w);
        ApplyImp.process(
                new FilterAdapter(new BandPass(1.0, 2.0)), w);
    }
}
