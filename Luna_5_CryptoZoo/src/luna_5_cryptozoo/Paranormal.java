/********************************************************************************
 * Program Filename: Paranormal.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description:
 * Input:
 * Output:
 ********************************************************************************/
package luna_5_cryptozoo;
public class Paranormal extends Animal {
    private String foodType;
    private int foodAmt;
    //
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
