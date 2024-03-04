package com.evanlu.thinkinjava.rtti.generic.factory;

public class FuelFilter extends Filter{
    public static class Factory implements com.evanlu.thinkinjava.rtti.generic.factory.Factory<FuelFilter> {

        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
