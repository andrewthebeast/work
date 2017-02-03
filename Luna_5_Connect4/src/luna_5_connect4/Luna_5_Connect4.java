/********************************************************************************
 * Program Filename : Luna_5_Connect4.java
 * Author : Luna, Andrew
 * Date : January 13, 2016
 * Description : Makes a connect four game
 * Input : user 
 * Output: connect four game
 ********************************************************************************/
package luna_5_connect4;
import java.util.*;
public class Luna_5_Connect4 {
    final static int height = 6;//height of game board
    final static int length = 6;//length of board
    final static int bottem = height-1;// the lowwest row of the board
    static char board[][] = new char[length][height];//makes the game board
    static Scanner scanner = new Scanner(System.in);//scanner
    static String p1name;
    static String p2name;
    public static void main(String[] args){
        System.out.println("Welcome to Connect Four.\nPlease enter player one's name.");
        p1name = scanner.nextLine();
        System.out.println("Please enter player two's name");
        p2name = scanner.nextLine();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                board[i][j] = '■';
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        player1turn();
    }
    /****************************************************************************
     * Method: player1turn
     * Description: This method collects and sets the 1st players input
     * Parameters: none all static variables
     * Pre-Conditions: has to be called
     * Post-Conditions: none
     ****************************************************************************/
    public static void player1turn(){
        // spaces out the methods
        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }
        //prints the board
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        //collects player 1s input
        System.out.println(p1name +"'s turn\nPlease enter the colum you want to place your piece.");
        int colum = scanner.nextInt();
        colum--;
        int num = 1;
        boolean go = true;
        while(true){
            //sets player 1's chip to the desired location
            if(colum > length){
                System.out.println("That is not a vaild place");
                player1turn();
            }else{
                if(board[bottem][colum]== '■'){
                    board[bottem][colum] = '●';
                    player1check();
                }else if (board[bottem][colum] == '●' || board[bottem][colum] == '○') {
                    if (board[bottem - num][colum] == '■') {
                        board[bottem- num][colum] = '●';
                        player1check();
                    }
                }
            }
            num += 1;
            if(num == length){
                System.out.println("That column is full");
                break;
            }
        }
    }
    /****************************************************************************
     * Method: player2turn
     * Description: This method collects and sets the 2nd players input
     * Parameters: none all static variables
     * Pre-Conditions: has to be called
     * Post-Conditions: none
     ****************************************************************************/
    public static void player2turn(){
        // spaces out the methods
        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }
        //prints the board
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        //collects player 2s input
        System.out.println(p2name +"'s turn\nPlease enter the colum you want to place your piece.");
        int colum = scanner.nextInt();
        colum--;
        int num = 1;
        boolean go = true;
        while(true){
            //sets player 1's chip to the desired location
            if(colum > length){
                System.out.println("That is not a vaild place");
                player2turn();
            }else{
                if(board[bottem][colum]== '■'){
                    board[bottem][colum] = '○';
                    player2check();
                    player1turn();
                }else if (board[bottem][colum] == '●' || board[bottem][colum] == '○') {
                    if (board[bottem - num][colum] == '■') {
                        board[bottem- num][colum] = '○';
                        player2check();
                        player1turn();
                    }
                }
            }
            num += 1;
            if(num == length){
                System.out.println("That column is full");
                break;
            }
        }
    }
    /****************************************************************************
     * Method: player1check
     * Description: This method checks if player 1 has four chips in a row
     * Parameters: none all static variables
     * Pre-Conditions: has to be called
     * Post-Conditions: none
     ****************************************************************************/
    public static void player1check(){
        //checks the vetical
        boolean check = true;
        while (check) {
            for (int i = 0; i < length; i+= 1) {
                for (int j = 0; j < height; j+=1) {
                    int inarow = 0;
                    if(board[i][j] == '●'){
                        inarow++;
                    }else{
                        inarow = 0;
                    }if(inarow == 4){
                        System.out.println(p1name + " Wins!");
                        check = false;
                    }
                }
            }
            //checks horizontal
            for (int j = 0; j < height; j+=1) {
                for (int i = 0; i < length; i+= 1) {
                    int inarow = 0;
                    if(board[i][j] == '●'){
                        inarow++;
                    }else{
                        inarow = 0;
                    }if(inarow == 4){
                        System.out.println(p1name + " Wins!");
                        check = false;
                    }
                }
            }
        }
        player2turn();
    }
    /****************************************************************************
     * Method: player2check
     * Description: This method checks if player 2 has four chips in a row
     * Parameters: none all static variables
     * Pre-Conditions: has to be called
     * Post-Conditions: none
     ****************************************************************************/
    public static void player2check(){
        player1turn();
    }
}
