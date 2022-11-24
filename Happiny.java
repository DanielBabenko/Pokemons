package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.specialAttacks.FireBlast;
import ru.ifmo.se.pokemon.statAttacks.Refresh;

public class Happiny extends Pokemon {
    public Happiny(){
        super();
    }

    public Happiny(String name, int level){
        super(name,level);
        setStats(100,5,5,15,65,30);
        setType(Type.NORMAL);
        setMove(new FireBlast(),new Refresh());
    }
}

