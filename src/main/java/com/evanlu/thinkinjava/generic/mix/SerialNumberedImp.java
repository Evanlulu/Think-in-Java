package com.evanlu.thinkinjava.generic.mix;

public class SerialNumberedImp implements SerialNumbered{
    private static long counter = 1;
    private final long serialNumber = counter++;
    @Override
    public long getSeralNumber() {
        return serialNumber;
    }
}
