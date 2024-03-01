package com.evanlu.thinkinjava.exceptiontest.trycatch;

public class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose(){
        System.out.println("Needs cleanup" + id + " disposed");
    }
}
