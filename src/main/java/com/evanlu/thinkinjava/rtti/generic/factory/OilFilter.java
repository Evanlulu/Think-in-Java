package com.evanlu.thinkinjava.rtti.generic.factory;

public class OilFilter extends Filter{
    public static class Factory implements com.evanlu.thinkinjava.rtti.generic.factory.Factory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
