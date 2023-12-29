package Games.RockPaperScissors;

/**
Sriram Soundarpandian
@version 3.0
*/
public class Hand extends Ascii
{
    String name;

    public Hand(String name, String ascii){
        super(ascii);
        this.name = name;
    }

    public String toString(){
        return this.name + "\n" + this.ascii;
    }

    public String whoWins(Hand handh){
        return "Play the game to win!";
    }
}
