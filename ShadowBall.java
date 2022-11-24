package ru.ifmo.se.pokemon.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        this.type = Type.GHOST;
        this.power = 80.0;
        this.accuracy = 1.0;
    }

    @Override
    protected String describe(){
        return " кастует Shadow Ball!";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.2){
            p.setMod(Stat.SPECIAL_DEFENSE,-1);
        }
    }

}
