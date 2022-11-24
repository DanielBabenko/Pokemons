package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.specialAttacks.ChargeBeam;

public class Blissey extends Chansey{
    public Blissey(){
        super();
    }

    public Blissey(String name,int level){
        super(name,level);
        setType(Type.NORMAL);
        setStats(255,10,10,75,135,55);
        addMove(new ChargeBeam());
    }
}
