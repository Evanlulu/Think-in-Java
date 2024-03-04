package com.evanlu.thinkinjava.rtti.generic.individual;

import com.evanlu.thinkinjava.pets.Pet;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    private static String[] typeNames = {
            "com.evanlu.thinkinjava.pets.Mutt",
            "com.evanlu.thinkinjava.pets.Pug",
            "com.evanlu.thinkinjava.pets.EgyptianMau",
            "com.evanlu.thinkinjava.pets.Manx",
            "com.evanlu.thinkinjava.pets.Cymric",
            "com.evanlu.thinkinjava.pets.Rat",
            "com.evanlu.thinkinjava.pets.Mouse",
            "com.evanlu.thinkinjava.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    private static void loader(){
        try {
            for (String name : typeNames) {
                types.add(
                        (Class<? extends Pet>)Class.forName(name)
                );
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static {
        loader();
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
