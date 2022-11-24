package ru.ifmo.se.pokemon.physicalAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;
public class Facade extends PhysicalMove {
    public Facade (){
        this.type = Type.NORMAL;
        this.power = 70.0;
        this.accuracy = 1.0;
    }

    @Override
    protected String describe(){
        return " использует Facade!";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.BURN | p.getCondition() == Status.PARALYZE | p.getCondition() == Status.POISON) {
            this.power *= 2;
        }
    }
}
