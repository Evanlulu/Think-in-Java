package com.evanlu.thinkinjava.rtti.generic.factory;

public class PowerSteeringBelt extends Belt{
    public static class Factory implements com.evanlu.thinkinjava.rtti.generic.factory.Factory<PowerSteeringBelt> {

        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
