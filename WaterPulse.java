package ru.ifmo.se.pokemon.specialAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WaterPulse extends SpecialMove {
    public WaterPulse (){
        this.type = Type.WATER;
        this.power = 60.0;
        this.accuracy = 1.0;
    }

    @Override
    protected String describe(){
        return " применяет Water Pulse!";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2){p.confuse();}
    }
}

