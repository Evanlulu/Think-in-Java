package com.evanlu.thinkinjava.rtti.classInitialization;

public class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}
