package com.evanlu.thinkinjava.exceptiontest.limit;

abstract class Inning {
    public Inning() throws BaseballException{}
    public void event() throws BaseballException{}
    public abstract void atBat() throws Strike, Foul;
    public  void walk(){}
}
