package com.evanlu.thinkinjava.generic.decorator;

public class Decoration {
    public static void main(String[] args) {
        TimeStamped t = new TimeStamped(new Basic());
        TimeStamped t1 = new TimeStamped(new SerialNumbered(new Basic()));

//        t1.getSerialNumber();
        SerialNumbered s = new SerialNumbered(new Basic());
        SerialNumbered s1 = new SerialNumbered(new TimeStamped(new Basic()));
    }
}
