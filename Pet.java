package Games.PetTrainer;

/**
Sriram Soundarapandian */
public class Pet
{
    String name;
    int health;
    int happiness;
    int energy;

    public Pet(String name){
        this.name = name;
        this.health = 5;
        this.happiness = 5;
        this.energy = 5;
    }

    public String toString(){
        return "Pet " + name + " (health = " + health + ", energy = " + energy + 
        ", happiness = " + happiness + ")";
    }   

    public String feed(){
        return "";
    }

    public String walk(){
        return "";
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
        }
    }
}
