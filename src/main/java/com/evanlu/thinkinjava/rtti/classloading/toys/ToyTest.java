package com.evanlu.thinkinjava.rtti.classloading.toys;

public class ToyTest {
    static void pringInfo(Class cc){
        System.out.println("Class name" + cc.getName() + "is interface ? "
        + cc.isInterface() );
        System.out.println("Simple name :" + cc.getSimpleName());
        System.out.println("Canonical name :" + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null ;
        try {
            c = Class.forName("com.evanlu.thinkinjava.rtti.classloading.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("can't find fancyToy");
            System.exit(1);
        }
        pringInfo(c);
        for (Class anInterface : c.getInterfaces()) {
            pringInfo(anInterface);
            Class up = c.getSuperclass();
            Object obj = null;
            try {
                obj = up.newInstance();
            } catch (InstantiationException e) {
                System.out.println("can't instantiate");
                System.exit(1);
            } catch (IllegalAccessException e) {
                System.out.println("can't access");
                System.exit(1);
            }
            pringInfo(obj.getClass());
        }
    }
}
