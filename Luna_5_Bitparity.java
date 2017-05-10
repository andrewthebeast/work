/*******************************************************************************
 * Program Filename : Luna_5_BitParity.java
 * Author : Luna, Andrew
 * Date : May 10th, 2017
 * Description : Asks the user for their name in binary then uses the hemming code to transform the name
 * Input : users name
 * Output: Hemming code up dated
 ******************************************************************************/
package luna_5_bitparity;
import java.util.Scanner;
public class Luna_5_Bitparity {
    static int a = 0;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.println("Welcome please enter the number of characters in your name");
        num = scan.nextInt();
        String[] name = new String[num];
        for (int i = 1; i < name.length; i++) {
            String input;
            System.out.println("Please enter the " + i + " letter of your name");
            input = scan.nextLine();
            name[i] = input;
        }
        changeName(name);
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
    
    public static void changeName(String[] name){
        for (int i = 0; i < name.length; i++) {
            
        }
    }
}