/*******************************************************************************
 * Program Filename : Luna_5_Vendingmachine.java
 * Author : Luna, Andrew
 * Date : April 18, 2017
 * Description : Makes a vending machine that can be used
 * Input : user
 * Output: updated 
 ******************************************************************************/
package luna_5_vendingmachine;
import java.util.Scanner;

public class Luna_5_Vendingmachine {
    static Candies[][] candIes = new Candies[3][3];
    static double money;
    
    public static void main(String[] args) {
        System.out.println("Welcome to the vending machine!");
        System.out.println("Enter quit when not asking about number t leavin the machine.");
        System.out.println("How much money do you have?");
        System.out.print("$ : ");
        Scanner scan = new Scanner(System.in);
        money = scan.nextDouble();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        //intializes the candies 
        Candies candy1 = new Candies("Skittles", "Fruity", 8, 1.00, 170);
        candIes[0][0] = candy1;
        Candies candy2 = new Candies("Starburst", "Fruity", 8, .75, 160);
        candIes[0][1] = candy2;
        Candies candy3 = new Candies("Twix", "Chocolate Crisp", 8, .75, 286);
        candIes[0][2] = candy3;
        Candies candy4 = new Candies("Snickers", "Chocolate w/ nuts", 8, 1.25, 280);
        candIes[1][0] = candy4;
        Candies candy5 = new Candies("Milk Duds", "Chocolate w/ caramel", 8, 1.00, 170);
        candIes[1][1] = candy5;
        Candies candy6 = new Candies("Kit Kat", "Chocolate Crisp", 8, 1.00, 218);
        candIes[1][2] = candy6;
        Candies candy7 = new Candies("Hersheys", "Chocolate", 8, 1.00, 230);
        candIes[2][0] = candy7;
        Candies candy8 = new Candies("100 Grand", "Chocolate Crisp", 8, .90, 201);
        candIes[2][1] = candy8;
        Candies candy9 = new Candies("M&M's", "Chocolate w/ hard shell", 8, 1.25, 230);
        candIes[2][2] = candy9;
        candiesMaker();
    } 

    public static void candiesMaker(){
        String cname;
        boolean show = false;
        String buying;
        int amtofcand;
        int a;
        int b;
        System.out.println("Here is the vending machine");
        System.out.println("    1:           2:            3:     ");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1) + " : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(candIes[i][j].getName() + "     ");
            }
            System.out.println("");
        }
        System.out.println("Please enter the coordnates of the candy you would like to buy.");
        Scanner scae = new Scanner(System.in);
        System.out.print("Row : ");
        a = scae.nextInt() - 1;
        System.out.print("Column : ");
        b = scae.nextInt() - 1;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Name : " + candIes[a][b].getName());
        System.out.println("Type : " + candIes[a][b].getType());
        System.out.println("Price : $" + candIes[a][b].getPrc());
        System.out.println("Amount : " + candIes[a][b].getAmt());
        System.out.println("Calories : " + candIes[a][b].getCals());
        System.out.println("Would you like to but this item?");
        Scanner scaa = new Scanner(System.in);
        buying = scaa.nextLine().toLowerCase();
        if(buying.contains("yes")){
            System.out.println("How many?");
            Scanner scanner = new Scanner(System.in);
            amtofcand = scanner.nextInt();
            cname = scae.nextLine().toLowerCase();
            if (cname.contains("quit")) {
                System.out.println("Thanks for visiting the vending machine!");
                System.exit(0);
            }
            else{
                if (amtofcand > candIes[a][b].getAmt()) {
                    System.out.println("You cannot buy this many candies");
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    candiesMaker();
                }
                if(amtofcand*candIes[a][b].getPrc() > money){
                    System.out.println("You do not have enough money for this.");
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    candiesMaker();
                }else{
                    candIes[a][b].setAmt(candIes[a][b].getAmt() - amtofcand);
                    double temp = amtofcand * candIes[a][b].getPrc();
                    money = money-temp;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("You have $" + money +" left");
                    candiesMaker();
                }
            }
        }else if (buying.contains("no")) {
            System.out.println("Ok would you like to see the vending machine again?");
            Scanner scanner = new Scanner(System.in);
            buying = scanner.nextLine().toLowerCase();
            if(buying.contains("yes")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                candiesMaker();
            }else if (buying.contains("quit") || buying.contains("no")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Thanks for visiting the vending machine!");
                System.exit(0);
            }
        }else if(buying.contains("quit")){
            System.out.println("Thanks for visiting the vending machine!");
            System.exit(0);
        }
    }
}
