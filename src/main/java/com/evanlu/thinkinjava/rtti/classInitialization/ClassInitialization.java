package com.evanlu.thinkinjava.rtti.classInitialization;

import com.evanlu.thinkinjava.interfacetest.nested.E;

import java.util.Random;

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("After Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.StaticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.evanlu.thinkinjava.rtti.classInitialization.Initable3");
        System.out.println("After create Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}
