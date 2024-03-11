package com.evanlu.thinkinjava.generic.erase;

import java.lang.reflect.Array;

@SuppressWarnings("ALL")
public class GenericArrayTypeToken<T> {
    private T[] array;

    public GenericArrayTypeToken(Class<T> type,int sz) {
        array = (T[]) Array.newInstance(type,sz);
    }
    public void put(int index, T item){
        array[index] = item;
    }
    public T get(int index){ return array[index]; }
    public T[] rep(){ return array;}

    public static void main(String[] args) {
        GenericArrayTypeToken<Integer> gai = new GenericArrayTypeToken<>(Integer.class, 10);
        Integer[] rep = gai.rep();
    }
}
