package Games.PetTrainer;

/**
 * Write a description of class Slime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Slime extends Pet
{
    int attack;
    public Slime(String name, int attack){
        super(name);
        this.attack = attack;
    }

    public String toString(){
        return "Slime " + name + " (attack = " + attack + ", health = " + health +
        ", energy = " + energy + ", happiness = " + happiness + ")";
    }
    
    public void cap(){
        if (happiness >= 10){
            int happiness = 10;
        }else if (health >= 10){
            int health = 10;
        }else if (energy > 10){
            int energy = 10;
        }else if (happiness <= 0){
            int happiness = 0;
        }else if (health <= 0){
            int health = 0;
        }else if (energy <= 0){
            int energy = 0;
        }else if (attack >= 10){
            int attack = 10;
        }else if(attack <= 0){
            int attack = 0;
        }
    }
    
    public String feed(){
        String slimeFeed = "";
        if (energy >= 7 && health >= 6){
            energy += 2;
            happiness += 2;
            this.cap();
            slimeFeed = "you fed" +name+ " the slime some jello and it was yummy!  -> +0 health, +2 energy, +2 happiness." ;
        }else{
            health -= 2;
            happiness -= 2;
            this.cap();
            slimeFeed = "You fed "+name+ " moldy boba... -> -2 health, +0 energy, -2 happiness.";
        }
        return slimeFeed;
    }

    public String walk(){
        String slimeWalk = "";
        if (energy < 5){
            health -= 1;
            happiness -= 2;
            attack -= 1;
            this.cap();
            slimeWalk = name + " was too tired for a walk... -> -1 health, -1 attack, -2 happiness.";
        }else {
            health += 2;
            happiness += 2;
            attack += 1;
            this.cap();
            slimeWalk = name + " really enjoyed the walk! And even met other slimes! -> +2 health, +1 attack, +2 happiness.";
        }
        return slimeWalk;
    }
}
