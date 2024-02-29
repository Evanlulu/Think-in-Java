package com.evanlu.thinkinjava.exceptiontest.limit;

public class StormyInning extends Inning implements Storm{

    public StormyInning() throws RainedOUt,BaseballException {}
    public StormyInning(String s) throws  Foul, BaseballException{}
    public void event(){}

    @Override
    public void atBat() throws PopFoul {}

    @Override
    public void rainHard() throws RainedOUt {}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        }catch (PopFoul e){
            System.out.println("Pop foul");
        } catch (RainedOUt e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (RainedOUt e) {
            System.out.println("Rain out");
        } catch (Foul e){
            System.out.println("Foul");
        } catch (Strike e){
            System.out.println("Strike");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
