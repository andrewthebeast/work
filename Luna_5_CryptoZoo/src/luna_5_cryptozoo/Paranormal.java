/********************************************************************************
 * Program Filename: Paranormal.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description: class constructor makes getters and setters
 * Input: animal
 * Output: mythical class constructor
 ********************************************************************************/
package luna_5_cryptozoo;
public class Paranormal extends Animal {
    private String foodType;// states the food type
    private int foodAmt;//states the food amount
     /***************************************************************************
     * Method: Paranormal()
     * Description: makes a class constructor
     * Parameters: name, orgin, and dangerrating
     * Pre-Conditions: none
     * Post-Conditions: set name, orgin and danger rating, foodtype and foodamt
     **************************************************************************/
    Paranormal(String name, String origin, int dangerrating){
        super(name, origin, dangerrating);
        foodType = "meat";
        foodAmt = 5;
    }
    // Getters and Setters
    public String getFoodType() {
        return foodType;
    }
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    public int getFoodAmt() {
        return foodAmt;
    }
    public void setFoodAmt(int foodAmt) {
        this.foodAmt = foodAmt;
    }
}
