package com.evanlu.thinkinjava.innerclasstest.framework;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c){ eventList.add(c); }
    public void run(){
        while (!eventList.isEmpty())
            for (Event event : new ArrayList<Event>(eventList)) {
                if(event.ready()){
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }

            }

    }
}
