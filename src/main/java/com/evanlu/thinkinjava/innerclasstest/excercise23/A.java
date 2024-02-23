package com.evanlu.thinkinjava.innerclasstest.excercise23;

public class A {
    U getU(){
        return new U() {
            @Override
            public void method1() {
                System.out.println("method1");
            }

            @Override
            public void method2() {
                System.out.println("method2");
            }

            @Override
            public void method3() {
                System.out.println("method3");
            }
        };
    }
}
