package Day11.Task2.Model;

import Day11.Task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {


    static final int HEAL_AMOUNT = 25;

    static final int HEAL_TEAMMATE_AMOUNT = 20;
    public Paladin(){
        physDef = 0.5;
        magDef = 0.2;
        physAttack = 15;

    }


    @Override
    public void HealHimself() {
    if (health + HEAL_AMOUNT > MAX_HEALTH){
        health = MAX_HEALTH;
    }else {
        health += HEAL_AMOUNT;
    }


    }

    @Override
    public void HealTeammate(Hero h) {
    if (h.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH){
        h.health = MAX_HEALTH;
    }else {
        h.health += HEAL_TEAMMATE_AMOUNT;
    }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
