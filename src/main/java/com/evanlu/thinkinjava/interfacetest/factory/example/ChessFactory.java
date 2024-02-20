package com.evanlu.thinkinjava.interfacetest.factory.example;

public class ChessFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Chess();
    }
}
