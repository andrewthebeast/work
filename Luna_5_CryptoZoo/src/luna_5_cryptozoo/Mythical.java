/********************************************************************************
 * Program Filename: Mythical.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description:
 * Input:
 * Output:
 ********************************************************************************/
package luna_5_cryptozoo;
public class Mythical extends Animal {
    private String foodType;
    private int foodAmt;
     /***************************************************************************
     * Method: Mythical()
     * Description: makes a class constructor
     * Parameters: name, orgin, and dangerrating, int, and int
     * Pre-Conditions: none
     * Post-Conditions: set name, orgin and danger rating, food type and sood amount
     **************************************************************************/
    public Mythical(String name, String origin, int dangerrating, String type, int amt){
        super(name, origin, dangerrating);
        this.foodType = type;
        this.foodAmt = amt;
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
