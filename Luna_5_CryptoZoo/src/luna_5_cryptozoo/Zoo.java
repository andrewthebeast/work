/********************************************************************************
 * Program Filename: Zoo.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description: Creates the creatures and shows them
 * Input: animal and other classes
 * Output: 
 ********************************************************************************/
package luna_5_cryptozoo;
import java.util.*;
public class Zoo {
    private ArrayList<Animal> creatures = new ArrayList<Animal>();// list of creatures
    static Scanner scan = new Scanner(System.in);//Scanner
    static String input;//String for Scanner
     /***************************************************************************
     * Method: list()
     * Description: sets elements in the arraylist creatures
     * Parameters: classes mythical, paranormal, lingerling and creatures
     * Pre-Conditions: none
     * Post-Conditions: none
     **************************************************************************/
    public static void list(){
        Mythical animal1 = new Mythical("Fairy", "Woods", 0, "dreams", 20);//1st animal
        creatures.add(animal1);
        Mythical animal2 = new Mythical("Barney", "your dreams", 25, "songs", 100);// 2nd animal
        
        Mythical animal3 = new Mythical("Whale", "under the sea", 10, "flying fish", 75);//3rd Animal
        
        Paranormal animal4 = new Paranormal("Bigfoot", "forrest", 50);//4th animal
        
        Paranormal animal5 = new Paranormal("Lizard Man", "Lab", 40);//5th animal
        
        LingerLing animal6 = new LingerLing("Zombie", "graveyard", 35);//6th animal
        
        LingerLing animal7 = new LingerLing("Vampire", "the dark", 28);//7th animal
        
        LingerLing animal8 = new LingerLing("Werewolf", "", 1000);//8th animal
        
        FossilRelative animal9 = new FossilRelative("Dinosaur", "eggs", 15);//9th animal
        
        FossilRelative animal10 = new FossilRelative("Monkey", "the jungle", 20);//10th animal
        
    }
     /***************************************************************************
     * Method: showAll()
     * Description: displays the creatures
     * Parameters: arraylist dreatures
     * Pre-Conditions: none
     * Post-Conditions: displays the arraylist creature
     **************************************************************************/
    public static void showAll(ArrayList creatures){
        System.out.println("Here are your animals.");
        for (int i = 0; i < creatures.size(); i++) {
            System.out.println(creatures.get(i));
        }
    }
}
