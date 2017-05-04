/*******************************************************************************
 * Program Filename : Candies.java
 * Author : Luna, Andrew
 * Date : April 18, 2017
 * Description : class candies creates the array list candies
 * Input : user
 * Output: updated 
 ******************************************************************************/
package luna_5_vendingmachine;
public class Candies {
    private String name;
    private int amt;
    private double prc;
    private int cals;
    
     public Candies(String a, int b, double c, int d){
        this.name = a;
        this.amt = b;
        this.prc = c;
        this.cals = d;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public double getPrc() {
        return prc;
    }

    public void setPrc(double prc) {
        this.prc = prc;
    }

    public int getCals() {
        return cals;
    }

    public void setCals(int cals) {
        this.cals = cals;
    }
     
}
