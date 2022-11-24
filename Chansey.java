package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.specialAttacks.MudBomb;

public class Chansey extends Happiny {
    public Chansey(){
        super();
    }

    public Chansey(String name,int level){
        super(name,level);
        setType(Type.NORMAL);
        setStats(250,5,5,35,105,50);
        addMove(new MudBomb());
    }
}

