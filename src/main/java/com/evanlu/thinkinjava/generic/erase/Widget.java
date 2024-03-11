package com.evanlu.thinkinjava.generic.erase;

public class Widget {
    public static class Factory implements FactoryI<Widget>{
        @Override
        public Widget create() {
            return new Widget();
        }
    }

}
