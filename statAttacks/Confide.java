package ru.ifmo.se.pokemon.statAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class Confide extends StatusMove {
    @Override
    protected String describe(){
        return " применяет Confide!";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK,-1);
    }
}
