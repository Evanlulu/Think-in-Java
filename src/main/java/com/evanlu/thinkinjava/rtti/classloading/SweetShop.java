package com.evanlu.thinkinjava.rtti.classloading;

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Not find Gum");
        }
        System.out.println("After Class.forName");
        new Cookie();
        System.out.println("After create Cookie");
    }
}
