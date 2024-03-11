package com.evanlu.thinkinjava.generic.erase;

public abstract class GenericWithCreate <T>{
    final T element;
    GenericWithCreate(){
        element = create();
    }
    abstract T create();
}
