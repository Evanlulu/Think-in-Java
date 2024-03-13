package com.evanlu.thinkinjava.generic.adapter;

import com.evanlu.thinkinjava.generic.generator.Coffee;
import com.evanlu.thinkinjava.generic.generator.Latte;
import com.evanlu.thinkinjava.generic.generator.Mocha;

import java.util.ArrayList;
import java.util.List;

public class Fill2Test {
    public static void main(String[] args) {
        List<Coffee> carrier = new ArrayList<Coffee>();
        Fill2.fill(
                new AddableCollectionAdapter<Coffee>(carrier),
                Coffee.class,
                3
        );
        Fill2.fill(
                Adapter.collectionAdapter(carrier),
                Latte.class,
                2
        );
        for (Coffee coffee : carrier) {
            System.out.println(coffee);
        }
        System.out.println("---------------------------------");
        AddableSimpleQueue<Coffee> coffees = new AddableSimpleQueue<>();
        Fill2.fill(coffees, Mocha.class, 4);
        Fill2.fill(coffees, Latte.class, 1);
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }
    }
}
