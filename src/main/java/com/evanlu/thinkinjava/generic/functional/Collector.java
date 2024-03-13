package com.evanlu.thinkinjava.generic.functional;

public interface Collector <T> extends UnaryFunction<T,T>{
    T result();
}
