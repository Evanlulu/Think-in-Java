package com.evanlu.thinkinjava.generic.generator;

public class GeneratorMethods {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GeneratorMethods generatorMethods = new GeneratorMethods();
        generatorMethods.f("");
        generatorMethods.f(1);
        generatorMethods.f(1.0);
        generatorMethods.f(1.0F);
        generatorMethods.f('c');
        generatorMethods.f(generatorMethods);
    }

}
