/********************************************************************************
 * Program Filename: FossilRelative.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description:
 * Input:
 * Output:
 ********************************************************************************/
package luna_5_cryptozoo;
public class FossilRelative extends LingerLing {
     /***************************************************************************
     * Method: FossilRelative()
     * Description: makes a class constructor
     * Parameters: name, orgin, and dangerrating
     * Pre-Conditions: none
     * Post-Conditions: sets name, orgin and danger rating
     **************************************************************************/
    public FossilRelative(String name, String origin, int dangerrating){
        super(name, origin, dangerrating);
    }
        /***************************************************************************
     * Method: foodperWeek()
     * Description: sets the foodperweek
     * Parameters: none
     * Pre-Conditions: none
     * Post-Conditions: sets foodperweek
     **************************************************************************/
    public int foodperWeek(){
        return 1;
    }
}
