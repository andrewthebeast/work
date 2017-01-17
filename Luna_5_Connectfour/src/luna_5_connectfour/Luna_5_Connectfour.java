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
        public static void main(String[] args) {
        System.out.println("Please enter 1 to play");
        //collects response
        String res;
        Scanner reso = new Scanner(System.in);
        res = reso.nextLine();
        if(res.contains("1")){
           game(); 
        }
    }
    public static void game(){
        //player 1 move
        for (int i = 0; i < 6; i++) {
            System.out.print("X ");
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j] + "X ");
            }
            System.out.println();
        }
        System.out.println("Player 1's turn");
        System.out.println("what row would you like to place your chip?");
        Scanner input1 = new Scanner(System.in);
        input = input1.nextInt();
        
    }
}

