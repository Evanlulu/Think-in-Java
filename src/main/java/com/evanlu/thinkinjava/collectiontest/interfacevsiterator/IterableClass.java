package com.evanlu.thinkinjava.collectiontest.interfacevsiterator;

import com.evanlu.thinkinjava.pets.Pet;

import java.util.Iterator;

public class IterableClass implements Iterable<String>{
    protected String[] words = "And that is how we know Earth to be banana-shaped.".split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
