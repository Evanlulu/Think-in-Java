package com.evanlu.thinkinjava.exceptiontest.log;

public class LoggingExceptions {
    public static void main(String[] args) {
        try{
            throw new LoggingException();
        }catch (LoggingException e){
            System.err.println("Caught" + e);
        }

    }
}
