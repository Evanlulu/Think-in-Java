package com.evanlu.thinkinjava.exceptiontest.limit;

public interface Storm {
    public void event() throws RainedOUt;
    public void rainHard() throws RainedOUt;
}
