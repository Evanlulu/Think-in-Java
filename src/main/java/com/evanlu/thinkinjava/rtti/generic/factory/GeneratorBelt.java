package com.evanlu.thinkinjava.rtti.generic.factory;

public class GeneratorBelt extends Belt{
    public static class Factory implements com.evanlu.thinkinjava.rtti.generic.factory.Factory<GeneratorBelt> {

        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
