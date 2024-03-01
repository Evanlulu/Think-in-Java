package com.evanlu.thinkinjava.exceptiontest.trycatch;

public class CleanupIdiom {
    public static void main(String[] args) {
        NeedsCleanup nc1 = new NeedsCleanup();
        try {

        }finally {
            nc1.dispose();
        }
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {

        }finally {
            nc2.dispose();
            nc3.dispose();
        }
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {

                }finally {
                    nc5.dispose();
                }
            }catch (ConstructionException e){
                System.out.println(e);
            }finally {
                nc4.dispose();
            }
        }catch (ConstructionException e){
            System.out.println(e);
        }
    }
}
