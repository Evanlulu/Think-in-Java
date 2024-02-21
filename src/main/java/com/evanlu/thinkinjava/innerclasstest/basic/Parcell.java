package com.evanlu.thinkinjava.innerclasstest.basic;

public class Parcell {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){ return label; }
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public Contents contents(){
        return new Contents();
    }

    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("Tasmania");

        Parcell p2 = new Parcell();
        Contents contents = p2.contents();

    }

}
