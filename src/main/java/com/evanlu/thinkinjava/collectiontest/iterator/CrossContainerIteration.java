package com.evanlu.thinkinjava.collectiontest.iterator;

import com.evanlu.thinkinjava.pets.Pet;
import com.evanlu.thinkinjava.pets.Pets;

import java.util.*;

public class CrossContainerIteration {
    public static void display(Iterator<Pet> its){
        while (its.hasNext()){
            Pet p = its.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(petsTS.iterator());
        display(petsHS.iterator());
        display(pets.iterator());
        display(petsLL.iterator());
    }
}
