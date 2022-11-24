package ru.ifmo.se.pokemon.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast(){
        this.type = Type.FIRE;
        this.power = 110.0;
        this.accuracy = 0.85;
    }
    @Override
    protected String describe(){
        return " зажигает с Fire Blast!";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.hasType(Type.FIRE)) {
            Effect e = new Effect().chance(0.1).turns(1);
            e.burn(p);
        }
    }
}
