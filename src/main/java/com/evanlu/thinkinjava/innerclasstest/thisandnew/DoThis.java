package com.evanlu.thinkinjava.innerclasstest.thisandnew;

public class DoThis {
    void f(){
        System.out.println("DoThis.f()");
    }
    public class Inner{
        public DoThis outer(){
            return DoThis.this;
        }
    }
    public Inner inner(){
        return  new Inner();
    }

    public static void main(String[] args) {
        DoThis dt = new DoThis();
        DoThis.Inner dti = dt.inner();
        dti.outer().f();

        Inner testNew = dt.new Inner();
    }
}
