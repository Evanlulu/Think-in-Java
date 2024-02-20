package com.evanlu.thinkinjava.interfacetest.limitinterface;

import java.util.Random;

public class RandomDoubles {
    /**
     * 利用設配器克服 適配器實現多重繼承
     */

    private static Random rand = new Random(47);
    public double next(){ return rand.nextDouble(); }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}
