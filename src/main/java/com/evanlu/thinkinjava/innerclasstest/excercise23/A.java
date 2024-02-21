package com.evanlu.thinkinjava.innerclasstest.excercise23;

public class A {
    U getU(){
        return new U() {
            @Override
            public void method1() {

            }

            @Override
            public void method2() {

            }

            @Override
            public void method3() {

            }
        };
    }
}
