/********************************************************************************
 * Program Filename: Zoo.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description: Creates the creatures and shows them
 * Input:
 * Output:
 ********************************************************************************/
package luna_5_cryptozoo;
import java.util.*;
public class Zoo {
    private ArrayList<Animal> creatures = new ArrayList<Animal>();// list of creatures
    static Scanner scan = new Scanner(System.in);//Scanner
    static String input;//String for Scanner
    //method
    public static void list(){
        Mythical animal1 = new Mythical("Fairy", "Woods", 0, "dreams", 20);
        creatures.add(animal1);
        Mythical animal2 = new Mythical("Barney", "your dreams", 25, "songs", 100);
        
        Mythical animal3 = new Mythical("Whale", "under the sea", 10, "flying fish", 75);
        
        Paranormal animal4 = new Paranormal("", "", 0);
        
        Paranormal animal5 = new Paranormal("", "", 0);
        
        LingerLing animal6 = new LingerLing("", "", 0);
        
        LingerLing animal7 = new LingerLing("", "", 0);
        
        LingerLing animal8 = new LingerLing("", "", 0);
        
    }
    //method
    public static void showAll(ArrayList creatures){
        System.out.println("Here are your animals.");
        for (int i = 0; i < creatures.size(); i++) {
            System.out.println(creatures.get(i));
        }
    }
}
