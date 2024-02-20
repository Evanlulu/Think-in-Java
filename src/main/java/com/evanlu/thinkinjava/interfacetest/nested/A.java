package com.evanlu.thinkinjava.interfacetest.nested;

public class A {
    interface B{
        void f();
    }

    public class BImp implements B{
        @Override
        public void f() {

        }
    }
    private class BImp2 implements B{
        @Override
        public void f() {

        }
    }
    public interface C{
        void f();
    }
    class CImp implements C{
        @Override
        public void f() {

        }
    }
    private class CImp2 implements C{
        @Override
        public void f() {

        }
    }

    private interface D{
        void f();
    }

    private class DImp implements D{
        @Override
        public void f() {

        }
    }
    public class DImp2 implements D{
        @Override
        public void f() {

        }
    }

    public D getD(){
        return  new DImp2();
    }
    private D dRef;
    public void receiveD(D d){
        dRef = d;
        dRef.f();
    }
}
