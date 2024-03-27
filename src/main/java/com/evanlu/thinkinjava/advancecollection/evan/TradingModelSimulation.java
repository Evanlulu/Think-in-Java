package com.evanlu.thinkinjava.advancecollection.evan;

import java.text.DecimalFormat;
import java.util.Random;

public class TradingModelSimulation {

    public static void main(String[] args) {

        Random random = new Random();
        for (int j = 1; j < 1000; j++){
            int trades = 10000;
            int wins = 0;
            int winPro = 0;
            int lossPro = 0;
            int losses = 0;
            int profit = 0;
            int winPrice = 3*j;
            for (int i = 0; i < trades; i++) {
                int position = 0;
                boolean onBoard = true;
                boolean onBoardTrail = true;
                int positionsOpened = 1;
                int triggerPrice = 10;
                int loosePrice = -j;
                int max= 0;


                while (true) {
                    int movement = random.nextInt(100) < 49 ? 1 : -1;
                    position += movement;
//                    if (movement == 1 && max == position) //移動停損
//                        max++;
//                        loosePrice++;
                    if (position == winPrice) {
                        wins++;
                        winPro += position;
                        profit += winPrice;
//                        System.out.println("win trade :" + winPrice);
                        onBoard = false;
                    } else
                        if (onBoardTrail && position <= loosePrice) {
                        if (position >= 0){
                            wins++;
                            winPro += position;
                        }else {
                            losses++;
                            lossPro += position;

                        }
                        profit += position;
                    } else
                        if (onBoard && position <= loosePrice) {

                    }
                }
            }
            double winRate = (wins / (double) trades) * 100;
            System.out.print("Exp: $" + profit / (double) trades + "  J = " + j);
            System.out.print("    winExp : " + winPro/wins + "  lossExp : " + lossPro/(trades - wins));
            System.out.print("    ExpRatio : " +  -(winPro/wins)/(double)(lossPro/(trades - wins)));
            System.out.println("   Win rate: " + winRate + "%      ");
        }

    }
}
