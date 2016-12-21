/********************************************************************************
 * Program Filename: LingerLing.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description:
 * Input:
 * Output:
 ********************************************************************************/
package luna_5_cryptozoo;
public class LingerLing extends Animal {
    private String foodType;
    private int foodAmt;
    //
    public LingerLing(String name, String origin, int dangerrating){
        super(name, origin, dangerrating);
    }
    // Getters and Setters
    public String getFoodType() {
        return "none";
    }
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    public int getFoodAmt() {
        return 0;
    }
    public void setFoodAmt(int foodAmt) {
        this.foodAmt = foodAmt;
    }
}
