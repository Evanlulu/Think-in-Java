package com.evanlu.thinkinjava.exceptiontest;

public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        }catch (SimpleException e){
            System.out.println("Caught it !");
        }
    }
}
