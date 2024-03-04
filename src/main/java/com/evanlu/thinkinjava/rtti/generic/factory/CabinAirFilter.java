package com.evanlu.thinkinjava.rtti.generic.factory;

public class CabinAirFilter extends Filter{
    public static class Factory implements com.evanlu.thinkinjava.rtti.generic.factory.Factory<CabinAirFilter> {

        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
