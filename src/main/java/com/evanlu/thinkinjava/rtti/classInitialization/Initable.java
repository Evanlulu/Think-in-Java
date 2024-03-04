package com.evanlu.thinkinjava.rtti.classInitialization;

public class Initable {
    static final int staticFinal = 47;
    static final int StaticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}
