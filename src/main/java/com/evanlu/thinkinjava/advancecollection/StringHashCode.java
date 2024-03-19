package com.evanlu.thinkinjava.advancecollection;

public class StringHashCode {
    public static void main(String[] args) {
        String[] s = "Hello Hello".split(" ");
        System.out.println(s[0].hashCode());
        System.out.println(s[1].hashCode());
    }
}
