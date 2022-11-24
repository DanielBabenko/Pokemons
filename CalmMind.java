package ru.ifmo.se.pokemon.statAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class CalmMind extends StatusMove {
    @Override
    protected String describe(){
        return " применяет Calm Mind!";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }
}
