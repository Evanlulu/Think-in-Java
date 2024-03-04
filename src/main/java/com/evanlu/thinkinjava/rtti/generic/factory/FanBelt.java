package com.evanlu.thinkinjava.rtti.generic.factory;

public class FanBelt extends Belt{
    public static class Factory implements com.evanlu.thinkinjava.rtti.generic.factory.Factory<FanBelt> {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
