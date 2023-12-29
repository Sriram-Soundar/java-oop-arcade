package Games.RockPaperScissors;

/**
 Sriram Soundarpandian
 @version 3.0
 */
public class Rock extends Hand
{
 public Rock(){
    super("Rock", 
    " _.-.-.-."+ "\n" + 
    ";_|_|_|_|_" + "\n" + 
    "|_|_|\\__  \\" + "\n" + 
    "|    . '  |" + "\n" + 
    "|   (    /" + "\n" + 
    " \\______/" + "\n"); 
    }
    
 public String whoWins(Hand handh){
   if (handh.name.equals("Rock")){
    return "It's a tie!";
    } 
    else if (handh.name.equals("Paper")){
    return "Player 2 wins!";
    }
    else if (handh.name.equals("Scissors")){
    return "Player 1 wins!";    
    }
    else {
    return "Something went wrong";
    }   
}
}
