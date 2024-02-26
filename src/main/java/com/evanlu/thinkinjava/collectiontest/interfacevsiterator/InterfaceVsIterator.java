package com.evanlu.thinkinjava.collectiontest.interfacevsiterator;

import com.evanlu.thinkinjava.pets.Pet;
import com.evanlu.thinkinjava.pets.Pets;

import java.util.*;

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it){
        while (it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void display(Collection<Pet> it){
        for (Pet p : it) {
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        HashSet<Pet> petSet = new HashSet<>(pets);
        LinkedHashMap<String, Pet> pMap = new LinkedHashMap<>();
        String[] names = ("Palph, Eric, Robin, Lacey, Britney, Sam, Spot, Fluffy").split(", ");
        for (int i = 0; i < names.length; i++)
            pMap.put(names[i], pets.get(i));
        display(pets);
        display(petSet);
        display(pets.iterator());
        display(petSet.iterator());
        System.out.print(pMap);
        System.out.println();
        System.out.print(pMap.keySet());
        System.out.println();
        display(pMap.values());
        display(pMap.values().iterator());


    }

}
