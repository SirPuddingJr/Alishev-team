package Day11.Task2.Model;

public class Warrior extends Hero {

     public Warrior(){
         physDef = 0.8;
         physAttack = 30;

     }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
