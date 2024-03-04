package com.evanlu.thinkinjava.rtti.generic.individual;

import com.evanlu.thinkinjava.pets.*;

import java.util.HashMap;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer>{
        public void count(String type){
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else
                put(type, quantity + 1);

        }
    }
    public static void countPets(PetCreator creator){
        PetCounter petCounter = new PetCounter();
        for (Pet pet : creator.createArray(20)) {
            System.out.println(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet)
                petCounter.count("Pet");
            if (pet instanceof Dog)
                petCounter.count("Dog");
            if (pet instanceof Cat)
                petCounter.count("Cat");
            if (pet instanceof Rat)
                petCounter.count("Rat");
        }
        System.out.println();
        System.out.println(petCounter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
