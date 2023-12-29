package Games.PetTrainer;

/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
    String breed;
    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    public String toString(){
        return breed + " " + name + " (health = " + health + ", energy = " + 
        energy +  ", happiness = " + happiness + ")";
    }

    public String feed(){
        String dogFeed = "";
        if (energy >= 7 && health >= 6){
            energy += 2;
            happiness += 2;
            this.cap();
            dogFeed = breed + " " + name + " eats all the cookies and is loving life -> +0 health, +2 energy, +2 happiness." ;
        }else{
            health -= 2;
            happiness -= 2;
            this.cap();
            dogFeed = breed + " " + name + " got sick from eating a bad cookie:( -> -2 health, +0 energy, -2 happiness.";
        }
        return dogFeed;
    }

    public String walk(){
        String dogWalk = "";
        if (energy < 5){
            health -= 1;
            happiness -= 3;
            this.cap();
            dogWalk = breed + " " + name + " was too tired for a walk... -> -1 health, +0 energy, -3 happiness.";
        }else {
            health += 2;
            happiness += 2;
            energy -= 1;
            this.cap();
            dogWalk = breed + " " + name + " really enjoyed the walk! -> +2 health, -1 energy, +2 happiness.";
        }
        return dogWalk;
    }
}
