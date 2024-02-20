package com.evanlu.thinkinjava.interfacetest.factory.example;

public class CheckersFactory implements GameFactory{
    public Game getGame(){
        return  new Checkers();
    }
}
