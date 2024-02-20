package com.evanlu.thinkinjava.interfacetest.nested;

public class NestingInterfaces {
    public class BImp implements A.B {
        @Override
        public void f() {

        }
    }
    class CImp implements A.C{

        @Override
        public void f() {
        }
    }

//    class DImp implements A.D{
//
//        @Override
//        public void f() {
//
//        }
//    }

    class EImp implements E{
        @Override
        public void g() {

        }
    }
    class EGImp implements E.G{
        @Override
        public void f() {

        }
    }
    class EImp2 implements E{
        @Override
        public void g() {

        }
        class EG implements E.G{
            @Override
            public void f() {

            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
//        A.D ad = a.getD();
//        A.DImp2 di2 = a.getD();
//        a.getD().f();
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
