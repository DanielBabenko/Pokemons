package ru.ifmo.se.pokemon.specialAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MudBomb extends SpecialMove {
    public MudBomb(){
        this.type = Type.GROUND;
        this.power = 65.0;
        this.accuracy = 0.85;
    }
    @Override
    protected String describe(){
        return " кидает Mud Bomb!";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.3){
            p.setMod(Stat.ACCURACY,-1);
        }
    }
}
