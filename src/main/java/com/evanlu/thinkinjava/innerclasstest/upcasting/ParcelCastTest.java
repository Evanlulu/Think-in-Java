package com.evanlu.thinkinjava.innerclasstest.upcasting;

public class ParcelCastTest {
    private class PContents implements Contents{
        private int i = 11;

        @Override
        public int values() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }

    public static void main(String[] args) {
        ParcelCastTest p = new ParcelCastTest();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
//        ParcelCastTest.PContents pc = p.new PContents();
    }
}
