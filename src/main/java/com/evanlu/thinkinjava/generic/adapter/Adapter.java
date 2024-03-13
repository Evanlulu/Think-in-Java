package com.evanlu.thinkinjava.generic.adapter;

import java.util.Collection;

public class Adapter {
    public static <T> Addable<T> collectionAdapter(Collection<T> c){
        return new AddableCollectionAdapter<>(c);
    }
}
