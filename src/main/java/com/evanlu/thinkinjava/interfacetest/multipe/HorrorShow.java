package com.evanlu.thinkinjava.interfacetest.multipe;

public class HorrorShow {
    static void u(Monster b){ b.menace(); }
    static void v(DangerousMonster d){
        d.menace();
        d.destoroy();
    }
    static void w(Lethal l){ l.kill(); }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeeryBadVampire();
        w(vlad);
        v(vlad);
        u(vlad);
    }
}
