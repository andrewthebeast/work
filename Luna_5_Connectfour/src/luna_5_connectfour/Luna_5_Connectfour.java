/********************************************************************************
 * Program Filename : Luna_5_Connect4.java
 * Author : Luna, Andrew
 * Date : January 13, 2016
 * Description : Makes a connect four game
 * Input : user 
 * Output: connect four game
 ********************************************************************************/
package luna_5_connectfour;
import java.util.*;
public class Luna_5_Connectfour {
    static char[][] board = new char[6][7];//makes the game board
    static int input;//collects input
    static String playeronesname;
    static String playertwosname;
        public static void main(String[] args) {
        //collects player ones name
        System.out.println("Please enter player one's name.");
        Scanner playeronename = new Scanner(System.in);
        playeronesname = playeronename.nextLine();
        //collects player twos name
        System.out.println("Please enter player two's name.");
        Scanner playertwoname = new Scanner(System.in);
        playertwosname = playertwoname.nextLine();
        //starts the game
        System.out.println("Please press enter to begin");
        Scanner enter = new Scanner(System.in);
        String res;
        res = enter.nextLine();
        if(res.contains("")){
            //prints 10 lines
            for(int i = 0;i < 10;i++){
                System.out.println(" ");
            }
            player1();
        }
    }
    /***************************************************************************
     * Method: player1()
     * Description: Player ones turn
     * Parameters: board, playeronesname, input
     * Pre-Conditions: player has to begin the game
     * Post-Conditions: player 
     **************************************************************************/
    public static void player1(){
        //player 1 move
        for (int i = 0; i < 6; i++) {
            System.out.print("X ");
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j] + "X ");
            }
            System.out.println();
        }
        System.out.println("Player 1's turn");
        System.out.println("Which row would you like to place your chip in?");
        Scanner input1 = new Scanner(System.in);
        input = input1.nextInt();
        
    }
}

