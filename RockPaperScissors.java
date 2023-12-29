package Games.RockPaperScissors;
import Games.AGame;
import java.util.Scanner;
/**
 * Write a description of class RockPaperScissors here.
 *
 * @author (your name)
 * @version 3.0
 */
public class RockPaperScissors extends AGame
{
    public RockPaperScissors() {
        super("RockPaperScissors");
    }

    public void play(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sriram's Rock Paper Scissors Tournament!");
        while(true){
            System.out.println("How many players? (1 or 2)");
            int numPlayers = -1;
            while(numPlayers < 1 || numPlayers > 2){
                try{
                    numPlayers = Integer.parseInt(scanner.nextLine());
                }catch(Exception e){
                    System.out.println("Input is not a number, please enter a number");
                    continue;
                }
                if (numPlayers < 1 || numPlayers > 2){
                    System.out.println("Error: You can only play with one or two players. Please enter a 1 or 2");
                    numPlayers = Integer.parseInt(scanner.nextLine());
                }
            }
            Hand playerhand = null;
            while(playerhand == null){
                System.out.println("First Player, input a valid weapon:");
                String playerInput = scanner.nextLine();
                playerhand = whatHand(playerInput);
            }
            System.out.println(playerhand);
            Hand playerTwohand = null;
            if(numPlayers == 1){
                playerTwohand = Bot.choose();
            }else{
                while(playerTwohand == null){
                    System.out.println("Second Player, input a valid weapon:");
                    String playerTwoInput = scanner.nextLine();
                    playerTwohand = whatHand(playerTwoInput);
                }
            }
            System.out.println(playerTwohand);
            System.out.println(playerhand.whoWins(playerTwohand));

            System.out.println("Press q to quit or any other key to continue");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("q")){
                break;
            }
        }
    }

    public Hand whatHand(String playerHand){
        playerHand = playerHand.toLowerCase();
        if (playerHand.equals("rock")){
            Rock p1hand = new Rock();
            return p1hand;
        }
        else if (playerHand.equals("paper")){
            Paper p1hand = new Paper();
            return p1hand;
        }
        else if (playerHand.equals("scissors")){
            Scissors p1hand = new Scissors();
            return p1hand;
        }
        else {
            return null;
        }
    }
}
