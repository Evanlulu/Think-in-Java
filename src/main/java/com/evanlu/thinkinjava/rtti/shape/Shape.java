package com.evanlu.thinkinjava.rtti.shape;

abstract class Shape {
    void draw(){
        System.out.println(this + ".draw()");
    }
    public abstract String toString();
}
