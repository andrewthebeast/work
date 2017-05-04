/*******************************************************************************
 * Program Filename : Luna_5_Vendingmachine.java
 * Author : Luna, Andrew
 * Date : April 18, 2017
 * Description : Makes a vending machine that can be used
 * Input : user
 * Output: updated 
 ******************************************************************************/
package luna_5_vendingmachine;
import java.util.ArrayList;
import java.util.Scanner;

public class Luna_5_Vendingmachine {
    static ArrayList<Candies> candies = new ArrayList<Candies>();
    static Candies[][][] candIes = new Candies[3][3][1];
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        //candies to be used = skittles, snickers, hersheys, twix, almond joy, kit kat, starburst, m&ms, 100 grand
        Candies candy1 = new Candies("Skittles", 8, 1.00, 170);
        candIes[0][0][0] = candy1;
        Candies candy2 = new Candies("Starburst", 8, .75, 160);
        candIes[0][1][0] = candy2;
        Candies candy3 = new Candies("Twix", 8, .75, 286);
        candIes[0][2][0] = candy3;
        Candies candy4 = new Candies("Snickers", 8, 1.25, 280);
        candIes[1][0][0] = candy4;
        Candies candy5 = new Candies("Almond Joy", 8, .75, 243);
        candIes[1][1][0] = candy5;
        Candies candy6 = new Candies("Kit Kat", 8, 1.00, 218);
        candIes[1][2][0] = candy6;
        Candies candy7 = new Candies("Hersheys", 8, 1.00, 230);
        candIes[2][0][0] = candy7;
        Candies candy8 = new Candies("100 Grand", 8, .90, 201);
        candIes[2][1][0] = candy8;
        Candies candy9 = new Candies("M&M's", 8, 1.25, 230);
        candIes[2][2][0] = candy9;
        candiesMaker();
    } 
    public static void candiesMaker(){
        double money;
        System.out.println("Welcome to the vending machine!");
        System.out.println("How much money do you have?");
//        System.out.print("$ : ");
//        Scanner scan = new Scanner(System.in);
//        money = scan.nextDouble();
        System.out.println("Here is the vending machine");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(candIes[i][j][0].getName() + "     ");
            }
            System.out.println("");
        }
    }
}
