/********************************************************************************
 * Program Filename : Luna_5_Vendingmachine.java
 * Author : Luna, Andrew
 * Date : April 18, 2017
 * Description : Makes a vending machine that can be used
 * Input : user
 * Output: updated 
 ********************************************************************************/
package luna_5_vendingmachine;
import java.util.ArrayList;
import java.util.Scanner;

public class Luna_5_Vendingmachine {
    static String[][] machine = new String[3][3];
    static ArrayList<Candies> candies = new ArrayList<Candies>();
    public static void main(String[] args) {
        //candies to be used = skittles, snickers, hersheys, twix, almond joy, kit kat, starburst, m&ms, 100 grand
        double money;
        candiesMaker();
        System.out.println("Welcome to the vending machine!");
        System.out.println("How much money do you have?");
        System.out.print("$ :");
        Scanner scan = new Scanner(System.in);
        money = scan.nextDouble();
        System.out.println("Here is the vending machine");
        for (int i = 0; i < machine.length; i++) {
            for (int j = 0; j < machine.length; j++) {
                System.out.print(candies);
            }
        }
    } 
    public static void candiesMaker(){
        Candies candy1 = new Candies("Skittles", 8, 1.00);
        candies.add(candy1);
        Candies candy2 = new Candies("Snickers", 8, 1.25);
        candies.add(candy2);
        Candies candy3 = new Candies("Hersheys", 8, 1.00);
        candies.add(candy3);
        Candies candy4 = new Candies("Twix", 8, .75);
        candies.add(candy4);
        Candies candy5 = new Candies("Almond Joy", 8, .75);
        candies.add(candy5);
        Candies candy6 = new Candies("Kit Kat", 8, 1.00);
        candies.add(candy6);
        Candies candy7 = new Candies("Starburst", 8, .75);
        candies.add(candy7);
        Candies candy8 = new Candies("M&M's", 8, 1.25);
        candies.add(candy8);
        Candies candy9 = new Candies("100 Grand", 8, .90);
        candies.add(candy9);
    }
}