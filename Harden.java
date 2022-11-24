package ru.ifmo.se.pokemon.statAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class Harden extends StatusMove {
    @Override
    protected String describe(){
        return " применяет Harden!";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }
}

