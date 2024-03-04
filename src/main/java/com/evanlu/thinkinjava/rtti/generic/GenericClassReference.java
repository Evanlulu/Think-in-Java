package com.evanlu.thinkinjava.rtti.generic;

public class GenericClassReference {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
//        Class<Number> generciNuberClass = Integer.class;
//        genericIntClass = double.class;
        Class<?> testIntClass = int.class;
        testIntClass = double.class;
    }
}
