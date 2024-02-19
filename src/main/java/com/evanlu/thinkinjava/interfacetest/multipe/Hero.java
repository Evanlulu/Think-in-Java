package com.evanlu.thinkinjava.interfacetest.multipe;

public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly{

    @Override
    public void fly() {}

    @Override
    public void swim() {}
}
