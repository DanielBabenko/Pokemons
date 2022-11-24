package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.specialAttacks.Scald;
import ru.ifmo.se.pokemon.specialAttacks.WaterPulse;
import ru.ifmo.se.pokemon.physicalAttacks.Facade;

public class Clamperl extends Pokemon {
    public Clamperl(){
        super();
    }
    public Clamperl (String name,int level){
        super(name,level);
        setType(Type.WATER);
        setStats(35,64,85,74,55,32);
        setMove(new WaterPulse(),new Facade(),new Scald());
    }
}

