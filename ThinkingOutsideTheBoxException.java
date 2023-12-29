package Games.TicTacToe;

/**
 * Write a description of class ThinkingOutsideTheBoxException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThinkingOutsideTheBoxException extends IllegalArgumentException
{
    ThinkingOutsideTheBoxException(){}

    ThinkingOutsideTheBoxException(String msg){
        super(msg);
    }
}
