package ru.ifmo.se.pokemon.statAttacks;

import ru.ifmo.se.pokemon.*;

public class Refresh extends StatusMove {

    @Override
    protected String describe(){
        return " восстанивливается через Refresh!";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if(p.getCondition() == Status.BURN|p.getCondition() == Status.POISON|p.getCondition() == Status.PARALYZE){
            Effect refresh = new Effect().condition(Status.NORMAL);
            p.setCondition(refresh);
        }
    }
}
