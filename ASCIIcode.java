*******************************************************************************
 * Program Filename : Luna_5_BitParity.java
 * Author : Luna, Andrew
 * Date : MAy 11th, 2017
 * Description : creates a class constructor to hold and get ascii and binary values
 * Input : none
 * Output : ascii and binary values
 ******************************************************************************/
package luna_5_bitparity;
public class ASCIIcode {
    int asciinum;
    int binaryval;
    public ASCIIcode(int b , int c){
        asciinum = b;
        binaryval = c;
    }

    public double getAsciinum() {
        return asciinum;
    }

    public void setAsciinum(int asciinum) {
        this.asciinum = asciinum;
    }

    public double getBinaryval() {
        return binaryval;
    }

    public void setBinaryval(int binaryval) {
        this.binaryval = binaryval;
    }
}
