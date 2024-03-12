package com.evanlu.thinkinjava.generic.mix;

import java.util.Date;

public class TimeStampedImp implements TimeStamped{

    private final long timeStamp;

    public TimeStampedImp() {
        this.timeStamp = new Date().getTime();
    }

    @Override
    public long getStamp() {
        return timeStamp;
    }
}
