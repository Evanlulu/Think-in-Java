package com.evanlu.thinkinjava.exceptiontest;

public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throw MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throw MyException from g()");
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
        try {
            g();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
    }
}
