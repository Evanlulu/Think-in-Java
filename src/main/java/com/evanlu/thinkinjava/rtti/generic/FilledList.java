package com.evanlu.thinkinjava.rtti.generic;

import java.util.ArrayList;
import java.util.List;

public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }
    public List<T> create(int nElments){
        List<T> result = new ArrayList<>();
        try {
            for (int i = 0; i < nElments; i++) {
                result.add(type.newInstance());
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> f1 = new FilledList<>(CountedInteger.class);
        System.out.println(f1.create(15));
    }
}
