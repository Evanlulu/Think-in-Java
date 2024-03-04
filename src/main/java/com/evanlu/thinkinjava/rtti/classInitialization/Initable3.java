package com.evanlu.thinkinjava.rtti.classInitialization;

public class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}
