/********************************************************************************
 * Program Filename: Animal.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description: Creates a name origin and rating for animals
 * Input:
 * Output:
 ********************************************************************************/
package luna_5_cryptozoo;
import java.util.*;
public abstract class Animal implements ZooAnimal{
    private String name;
    private String origin;
    private int dangerrating;
    private boolean onTour = false;
    //
    public Animal(String a, String b, int c){
        this.name = a;
        this.origin = b;
        this.dangerrating = c;
    }
    //
    public String toString(){
        return "Animal : " + name + "\n Orgin : " + origin + "\n Danger Rating" + dangerrating;
    }
    //Getters and Setters
    public boolean isOnTour() {
        return onTour;
    }
    public void setOnTour(boolean onTour) {
        this.onTour = onTour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOrgin(String origin) {
        this.origin = origin;
    }
    public void setDangerrating(int dangerrating) {
        this.dangerrating = dangerrating;
    }
}
