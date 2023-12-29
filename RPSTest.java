package Games.RockPaperScissors;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RPSTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RPSTest
{
    /**
     * Default constructor for test class RPSTest
     */
    public RPSTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }
  @Test

    public void rockTest(){

        //assertEquals(expected, actual);

        Hand rock = new Rock();

        String expected = " _.-.-.-.\n;_|_|_|_|_\n|_|_|\\__  \\\n|    . '  |\n|   (    /\n \\______/\n"; 

        assertEquals(expected, rock.ascii);

    }

 

    @Test

    public void paperTest(){

        //assertEquals(expected, actual);

        Hand paper = new Paper();

        String expected = "       _______\n  ____(____     \\\n (________       |\n(_________       |\n (________       |\n  (___________  /\n";

        assertEquals(expected, paper.ascii);

    }

 

    @Test

    public void scissorsTest(){

        //assertEquals(expected, actual);

        Hand scissors = new Scissors();

        String expected = "    .-.\n    | |    / )\n    | |   / /\n    | |  / /\n _.-| |_/ /\n; \\( \\   /\n|\\_)\\ \\  |\n|    ) \\ |\n|   (    /\n \\______/\n";

        assertEquals(expected, scissors.ascii);

    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
