package Games.TicTacToe;

/**
 * Board for playing tic-tac-toe
 *
 * @author Prof Prairie
 * @author Sriram Soundarapandian
 * @version 1.1
 */
public class Board 
{
    private int size;
    private char [][] board;

    /**
     * Constructor initializes all spots to underscore.
     * 
     * @param size: the dimensions of the square board.
     */
    Board(int size){
        this.size = size;
        this.board = new char[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size ; j++){
                board[i][j]= '_';
            }
        }
    }

    /**
     * toString method prints the board as a square
     * @return String representing the printed board
     */

    public String toString(){
        String pboard = "  ";
        for(int i = 0; i < size; i++){
            pboard += i + " ";
        }  
        pboard += "\n";
        for(int i = 0; i < size; i++){
            pboard += i + " ";
            for(int j = 0; j < size; j++){
                pboard += board[i][j] + " ";
            }
            pboard += "\n";
        }
        System.out.println(pboard);
        return pboard;

    }

    /**
     * Checks to see if the specified move is valid on the current board.
     * 
     * @param move: represents the potential move.
     */
    public boolean isValidMove(Move move){
        boolean valid; 
        if (!(move.row >= 0 && move.row < this.size)){
            valid = false;
        }else if(!(move.column >= 0 && move.column < this.size)){
            valid = false;
        }else if(!(board[move.row][move.column] == '_')){
            valid = false;
        }else{
            valid = true;
        }
        return valid;
    }

    /**
     * Checks to see if a player has won the game.
     * 
     * @param character: the player's character.
     * 
     * @return boolean if the specified player has won.
     */
    public boolean isWinner(char c){
        boolean win;
        int winCount = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == c){
                    winCount += 1;
                }else{
                    win = false;
                }
            }
            if(winCount == size){
                return true;
            }else{
                winCount = 0;
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[j][i] == c){
                    winCount += 1;
                }else{
                    win = false;
                }
            }
            if(winCount == size){
                return true;
            }else{
                winCount = 0;
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == j && board[i][j] == c){
                    winCount += 1;
                }else{
                    win = false;
                }
            }
        }
        if(winCount == size){
            return true;
        }else{
            winCount = 0;
        }

        for(int i = size - 1; i >= 0; i--){
            for(int j = 0; j < size; j++){
                if(i+j == size - 1 && board[i][j] == c){
                    winCount += 1;
                }else{
                    win = false;
                }
            }
        }
        if(winCount == size){
            return true;
        }else{
            winCount = 0;
        }

        return false;
    }

    /**
     * Places the move on the board.
     * @throws ThinkingOutsideTheBoxException for invalid move
     * @param move the move to place on the board
     * @return boolean representing if the move won the game.
     */
    public boolean makeMove(Move move) throws ThinkingOutsideTheBoxException{
        if(isValidMove(move) == false){
            throw new ThinkingOutsideTheBoxException("Invalid Move, please try again!");
        }else{
            board[move.row][move.column] = move.symbol;
        }

        if(isWinner(move.symbol) == true){
            return true;
        }else{
            return false;
        }
    }  
}

