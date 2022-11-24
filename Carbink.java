package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.physicalAttacks.Facade;
import ru.ifmo.se.pokemon.statAttacks.CalmMind;
import ru.ifmo.se.pokemon.statAttacks.Confide;
import ru.ifmo.se.pokemon.statAttacks.Harden;

public class Carbink extends Pokemon{
    public Carbink(){
        super();
    }
    public Carbink(String name,int level){
        super(name,level);
        setType(Type.ROCK,Type.FAIRY);
        setStats(50,50,150,50,150,50);
        setMove(new CalmMind(),new Harden(),new Confide(), new Facade());
    }

}