package ru.ifmo.se.pokemon.specialAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(){
        this.type = Type.ELECTRIC;
        this.power = 50.0;
        this.accuracy = 0.9;
    }
    @Override
    protected String describe(){
        return " использует Charge Beam!";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.7) {
            p.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }
}
