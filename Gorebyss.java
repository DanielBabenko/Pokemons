package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.specialAttacks.ShadowBall;

public class Gorebyss extends Clamperl {
    public Gorebyss(){
        super();
    }

    public Gorebyss(String name, int level){
        super(name,level);
        setType(Type.WATER);
        setStats(55,84,105,114,75,52);
        addMove(new ShadowBall());
    }
}

