package Day11.Task2.Model;

import Day11.Task2.Interfaces.Healer;
import Day11.Task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Healer {

    int magicAttack = 15;
    static final int HEAL_AMOUNT = 50;

    static final int HEAL_TEAMMATE_AMOUNT = 30;
    public Shaman(){
        physDef = 0.2;
        magDef = 0.2;
        physDef = 10;
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
    public void magicalAttack(Hero h) {
        double attackScore = magicAttack * (1 - h.magDef);
        if (h.health - attackScore < MIN_HEALTH){
            h.health = MIN_HEALTH;
        }else {
            h.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
