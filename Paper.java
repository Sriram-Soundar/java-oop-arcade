package Games.RockPaperScissors;

/**
 Sriram Soundarpandian
 @version 3.0
 */
 public class Paper extends Hand
{
 public Paper(){
    super("Paper",
    "       _______" + "\n" +

"  ____(____     \\" + "\n" +  

" (________       |" + "\n" +

"(_________       |" + "\n" +

" (________       |" + "\n" + 

"  (___________  /" + "\n"); 
    }
 public String whoWins(Hand handh){
   if (handh.name.equals("Paper")){
    return "It's a tie!";
    } 
    else if (handh.name.equals("Scissors")){
    return "Player 2 wins!";
    }
    else if (handh.name.equals("Rock")){
    return "Player 1 wins!";    
    }
    else {
    return "Something went wrong";
    }   
}
}
