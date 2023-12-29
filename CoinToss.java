package Games.CoinToss;
import Games.AGame;
public class CoinToss extends AGame {
    public CoinToss(){
        super("CoinToss");
    }
    public void play() {
     System.out.println("Lets flip a coin!");
     double randomNum = Math.random();
     if (randomNum < 0.5){
         System.out.println("You flipped a heads!");
     }else{
         System.out.println("You flipped a tails!");
     }
    }
}
