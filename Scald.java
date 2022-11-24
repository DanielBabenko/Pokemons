package ru.ifmo.se.pokemon.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald(){
        this.type = Type.WATER;
        this.power = 80.0;
        this.accuracy = 1.0;
    }

    @Override
    protected String describe(){
        return " заряжает Scald!";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.3).turns(1);
        e.burn(p);
        }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.FREEZE){
            Effect unfreeze = new Effect().turns(-1).condition(Status.NORMAL);
            p.setCondition(unfreeze);
        }
    }
}

