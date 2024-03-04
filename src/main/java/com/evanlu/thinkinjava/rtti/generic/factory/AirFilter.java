package com.evanlu.thinkinjava.rtti.generic.factory;

public class AirFilter extends Filter{
    public static class Factory implements com.evanlu.thinkinjava.rtti.generic.factory.Factory<AirFilter> {

        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
