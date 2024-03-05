package com.evanlu.thinkinjava.rtti.reflecttest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    private static String[] className = {
            "com.evanlu.thinkinjava.rtti.reflecttest.ShowMethods"
    };
    private static String usage = "usage : \n" +
            "ShowMethods qualifi]ed.class.name\n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified.class.name word" +
            "\nTo search for Methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (className.length < 1){
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(className[0]);
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();
            if(className.length == 1){
                for (Method method : methods) {
                    System.out.println(
                            p.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor ctor : constructors) {
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                }
                lines = methods.length + constructors.length;
            }else {
                for (Method method : methods) {
                    if (method.toString().indexOf(className[1]) != -1){
                        System.out.println(
                                p.matcher(method.toString()).replaceAll("")
                        );
                        lines ++;
                    }
                }for (Constructor ctor : constructors) {
                    if (ctor.toString().indexOf(className[1]) != -1){
                        System.out.println(
                                p.matcher(ctor.toString()).replaceAll("")
                        );
                        lines ++;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class : " + e);
        }

    }
}
