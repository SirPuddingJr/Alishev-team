package Day11.Task2;

import Day11.Task2.Model.Magician;
import Day11.Task2.Model.Paladin;
import Day11.Task2.Model.Shaman;
import Day11.Task2.Model.Warrior;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.HealTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.HealHimself();
        System.out.println(paladin);

        for (int i = 0; i < 5; i++){
           warrior.physicalAttack(magician);
            System.out.println(magician);


        }



    }
}
