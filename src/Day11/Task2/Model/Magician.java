package Day11.Task2.Model;

import Day11.Task2.Interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    int magicAttack = 20;

    public Magician(){
        physDef = 0;
        magDef = 0.8;
        physAttack = 5;

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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
