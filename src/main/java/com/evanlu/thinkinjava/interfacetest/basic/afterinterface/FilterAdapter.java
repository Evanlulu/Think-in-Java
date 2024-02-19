package com.evanlu.thinkinjava.interfacetest.basic.afterinterface;

import com.evanlu.thinkinjava.interfacetest.basic.waveform.Filter;
import com.evanlu.thinkinjava.interfacetest.basic.waveform.Waveform;

public class FilterAdapter implements Processor{
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }
    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
