package com.evanlu.thinkinjava.collectiontest.interfacevsiterator;

import com.evanlu.thinkinjava.pets.Pet;

import java.util.Collection;
import java.util.Iterator;

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it){
        while (it.hasNext()){
            Pet p = it.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void display(Collection<Pet> it){
        for (Pet p : it) {
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

}
