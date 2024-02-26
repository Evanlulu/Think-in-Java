package com.evanlu.thinkinjava.collectiontest.adapter;

import com.evanlu.thinkinjava.collectiontest.interfacevsiterator.IterableClass;

import java.util.*;

public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed(){
        return () -> new Iterator<String>() {
            int current = words.length - 1;

            @Override
            public boolean hasNext() {
                return current > -1;
            }

            @Override
            public String next() {
                return words[current--];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable<String> randomized(){
        return () -> {
            ArrayList<String> shuffled = new ArrayList<>(Arrays.asList(words));
            Collections.shuffle(shuffled, new Random(47));
            return shuffled.iterator();
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for (String s : mic.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : mic.randomized()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : mic) {
            System.out.print(s + " ");
        }
    }
}
