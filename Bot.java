package Games.RockPaperScissors;

/**
 * @Sriram Soundarapandian
 * @version 3 */
public class Bot
{
    public static Hand choose(){
        double choice = Math.random();   

        if (choice < (1.0/3.0)){
            return new Rock();   
        }
        else if(choice < (2.0/3.0)){
            return new Paper();
        }
        else{
            return new Scissors();
        }
    } 
}
