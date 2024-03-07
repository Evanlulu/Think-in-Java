package com.evanlu.thinkinjava.generic.generator;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
    private int n ;

    public IterableFibonacci(int n) {
        this.n = n;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0 ;
            }

            @Override
            public Integer next() {
                n --;
                return IterableFibonacci.this.next();
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer i : new IterableFibonacci(18)) {
            System.out.print(i + " ");
        }
    }
}
