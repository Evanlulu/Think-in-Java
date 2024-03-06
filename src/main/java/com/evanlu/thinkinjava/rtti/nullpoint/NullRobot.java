package com.evanlu.thinkinjava.rtti.nullpoint;

import java.lang.reflect.Proxy;

public class NullRobot {
    public static Robot newNullRobot(Class<? extends Robot> type){
        return (Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[]{Null.class, Robot.class},
                new NullRobotProxyHandler(type)
        );
    }

    public static void main(String[] args) {
        Robot[] bots = {
                new SnowRemovalRobot("SnowBee"),
                newNullRobot(SnowRemovalRobot.class)
        };
        for (Robot bot : bots) {
            Robot.Test.test(bot);
        }
    }
}
