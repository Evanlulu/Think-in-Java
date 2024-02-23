package com.evanlu.thinkinjava.innerclasstest.excercise23;

public class B {
    static int i = 0;
    final int size;
    private U[] us;
    public B(int size){
        this.size = size;
        us = new U[size];
    }
    void insertU(U u){
        if (i <= size) {
            us[i] = u;
        }
    }

    void clean(int i){
        us[i] = null;
    }

    void use(){
        for (U u : us) {
            u.method1();
            u.method2();
            u.method3();
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B(10);
        b.insertU(a.getU());
        b.use();

    }

}
