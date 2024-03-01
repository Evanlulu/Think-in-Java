package com.evanlu.thinkinjava.string;

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void printTitle(){
        f.format("%-15s %5s %10s\n","Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n","----", "---", "-----");
    }
    public void print(String name, int qty, double price){
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans",4,4.25);
    }
}
