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
    private String type;
    private int amt;
    private double prc;
    private int cals;
    
     public Candies(String a,String b, int c, double d, int e){
        this.name = a;
        this.type = b;
        this.amt = c;
        this.prc = d;
        this.cals = e;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
