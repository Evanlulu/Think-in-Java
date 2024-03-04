package com.evanlu.thinkinjava.rtti.generic.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part {
    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactor.size());
        return partFactor.get(n).create();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactor = new ArrayList<>();
    static {
        partFactor.add(new FuelFilter.Factory());
        partFactor.add(new AirFilter.Factory());
        partFactor.add(new CabinAirFilter.Factory());
        partFactor.add(new OilFilter.Factory());
        partFactor.add(new FanBelt.Factory());
        partFactor.add(new PowerSteeringBelt.Factory());
        partFactor.add(new GeneratorBelt.Factory());

    }
}
