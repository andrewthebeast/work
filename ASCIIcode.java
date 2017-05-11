/*******************************************************************************
 * Program Filename : Luna_5_BitParity.java
 * Author : Luna, Andrew
 * Date : MAy 11th, 2017
 * Description : creates a class constructor to hold and get ascii and binary values
 * Input : none
 * Output: ascii and binary values
 ******************************************************************************/
package luna_5_bitparity;
public class ASCIIcode {
    char letter;
    double asciinum;
    double binaryval;
    public ASCIIcode(char a, double b , double c){
        letter = a;
        asciinum = b;
        binaryval = c;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public double getAsciinum() {
        return asciinum;
    }

    public void setAsciinum(double asciinum) {
        this.asciinum = asciinum;
    }

    public double getBinaryval() {
        return binaryval;
    }

    public void setBinaryval(double binaryval) {
        this.binaryval = binaryval;
    }
    
    
}
