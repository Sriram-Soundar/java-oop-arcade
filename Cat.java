package Games.PetTrainer;

/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Pet
{
    String color;
    public Cat(String name, String color){
        super(name);
        this.color = color;
    }

    public String toString(){
        return color + " cat " + name + " (health = " + health + ", energy = " +
        energy + ", happiness = " + happiness + ")";
    }

    public String feed(){
        double luck = Math.random(); 
        String catFeed = "";
        if (luck < 0.5){
            energy += 2;
            happiness += 2;
            this.cap();
            catFeed = color + " cat " + name + " had a yummy meal :) -> +0 health, +2 energy, +2 happiness." ;
        }else{
            happiness -= 2;
            this.cap();
            catFeed = color + " cat " + name + " rejects the food! -> +0 health, +0 energy, -2 happiness.";
        }
        return catFeed;
    }

    public String walk(){
        double luck = Math.random();
        String catWalk = "";
        if (luck < 0.5){
            health -= 2;
            energy += 3;;
            happiness += 2;
            this.cap();
            catWalk = color + " cat " + name + " ate a snack instead -> -2 health, +3 energy, +2 happiness.";
        }else if (energy < 5){
            happiness -= 2;
            health += 1; 
            this.cap();
            catWalk = color + " cat " + name + " went on a walk but tripped and fell! -> +0 health, +0 energy, -2 happiness.";
        }else {
            health += 3;
            energy -= 1;
            this.cap();
            catWalk = color + " cat " + name + " had a wonderful walk! -> +3 health, -1 energy, +0 happiness.";
        }
        return catWalk;
    }
}
