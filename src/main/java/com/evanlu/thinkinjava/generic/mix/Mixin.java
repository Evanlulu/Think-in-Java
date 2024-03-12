package com.evanlu.thinkinjava.generic.mix;

public class Mixin extends BasicImp implements TimeStamped, SerialNumbered{
    private TimeStamped timeStamped = new TimeStampedImp();
    private SerialNumbered serialNumbered = new SerialNumberedImp();
    @Override
    public long getSeralNumber() {
        return serialNumbered.getSeralNumber();
    }

    @Override
    public long getStamp() {
        return timeStamped.getStamp();
    }
}
