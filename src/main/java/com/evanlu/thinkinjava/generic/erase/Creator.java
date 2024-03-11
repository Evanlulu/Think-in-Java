package com.evanlu.thinkinjava.generic.erase;

public class Creator extends GenericWithCreate{
    @Override
    Object create() {
        return new X();
    }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
