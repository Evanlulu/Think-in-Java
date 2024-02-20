package com.evanlu.thinkinjava.interfacetest.factory.example;

public class Games {
    public static void playGame(GameFactory gameFactory){
        Game s = gameFactory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
