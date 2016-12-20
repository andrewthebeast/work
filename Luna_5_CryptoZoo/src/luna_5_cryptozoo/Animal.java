/********************************************************************************
 * Program Filename: Animal.java
 * Author:
 * Date:
 * Description:
 * Input:
 * Output:
 ********************************************************************************/
package luna_5_cryptozoo;
import java.util.*;
public abstract class Animal implements ZooAnimal{
    public String name;
    public String orgin;
    public int dangerrating;
    public Animal(String a, String b, int c){
        this.name = a;
        this.orgin = b;
        this.dangerrating = c;
    }
    public static void toString(){
        
    }
}
