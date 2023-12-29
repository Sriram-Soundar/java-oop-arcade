package Games.RockPaperScissors;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LogicTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LogicTests
{
    @Test

    public void rockscissorsTest(){

        //assertEquals(expected, actual);

        Hand rock = new Rock();

        Hand scissors = new Scissors();

        assertEquals("Player 1 wins!",rock.whoWins(scissors));

    }

 

    @Test

    public void rockpaperTest(){

        //assertEquals(expected, actual);

        Hand rock = new Rock();

        Hand paper = new Paper();

        assertEquals("Player 2 wins!",rock.whoWins(paper));

    }

 

    @Test

    public void rockrockTest(){

        //assertEquals(expected, actual);

        Hand rock = new Rock();

        Hand roll = new Rock();

        assertEquals("It's a tie!",rock.whoWins(roll));

    }
    
    public void paperscissorsTest(){

        //assertEquals(expected, actual);

        Hand paper = new Paper();

        Hand scissors = new Scissors();

        assertEquals("Player 2 wins!",paper.whoWins(scissors));

    }

 

    @Test

    public void paperpaperTest(){

        //assertEquals(expected, actual);

        Hand paper = new Paper();

        Hand paperr = new Paper();

        assertEquals("It's a tie!",paper.whoWins(paperr));

    }

 

    @Test

    public void paperrockTest(){

        //assertEquals(expected, actual);

        Hand paper = new Paper();

        Hand rock = new Rock();

        assertEquals("Player 1 wins!",paper.whoWins(rock));

    }
    
    public void scissorsscissorsTest(){

        //assertEquals(expected, actual);

        Hand scissors = new Scissors();

        Hand scissorstwo = new Scissors();

        assertEquals("It's a tie!",scissors.whoWins(scissorstwo));

    }

 

    @Test

    public void scissorspaperTest(){

        //assertEquals(expected, actual);

        Hand scissors = new Scissors();

        Hand paper = new Paper();

        assertEquals("Player 1 wins!",scissors.whoWins(paper));

    }

 

    @Test

    public void scissorsrockTest(){

        //assertEquals(expected, actual);

        Hand scissors = new Scissors();

        Hand rock = new Rock();

        assertEquals("Player 2 wins!",scissors.whoWins(rock));

    }
    
    
}
