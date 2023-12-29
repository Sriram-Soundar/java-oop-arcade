package Games.RockPaperScissors;

/**
Sriram Soundarpandian
@version 3.0
*/
public class Scissors extends Hand
{
    public Scissors(){
        super("Scissors",
            "    .-."+ "\n" + 
            "    | |    / )" + "\n" + 
            "    | |   / /" + "\n" + 
            "    | |  / /" + "\n" + 
            " _.-| |_/ /" + "\n" + 
            "; \\( \\   /" + "\n" + 
            "|\\_)\\ \\  |" + "\n" + 
            "|    ) \\ |" + "\n" + 
            "|   (    /" + "\n" + 
            " \\______/" + "\n");
    }

    public String whoWins(Hand handh){
        if (handh.name.equals("Scissors")){
            return "It's a tie!";
        } 
        else if (handh.name.equals("Rock")){
            return "Player 2 wins!";
        }
        else if (handh.name.equals("Paper")){
            return "Player 1 wins!";    
        }
        else {
            return "Something went wrong";
        }   
    }
}

