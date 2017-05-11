/*******************************************************************************
 * Program Filename : Luna_5_BitParity.java
 * Author : Luna, Andrew
 * Date : May 10th, 2017
 * Description : Asks the user for their name in binary then uses the hemming code to transform the name
 * Input : users name
 * Output: Hemming code up dated
 ******************************************************************************/
package luna_5_bitparity;
import java.util.Scanner;
import java.util.ArrayList;
public class Luna_5_Bitparity {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<ASCIIcode> asciicode = new ArrayList<ASCIIcode>();
    public static void main(String[] args) {
        makeConverter();
        
    }
    
    public static void makeConverter(){
        ASCIIcode lettera = new ASCIIcode('a', 097.0, 01100001);
        asciicode.add(lettera);
        ASCIIcode letterb = new ASCIIcode('b', 098.0, 01100010);
        asciicode.add(letterb);
        ASCIIcode letterc = new ASCIIcode('c', 099.0, 01100001);
        asciicode.add(letterc);
        ASCIIcode letterd = new ASCIIcode('d', 100.0, 01100001);
        asciicode.add(letterd);
        ASCIIcode lettere = new ASCIIcode('e', 101.0, 01100001);
        asciicode.add(lettere);
        ASCIIcode letterf = new ASCIIcode('f', 102.0, 01100001);
        asciicode.add(letterf);
        ASCIIcode letterg = new ASCIIcode('g', 103.0, 01100001);
        asciicode.add(letterg);
        ASCIIcode letterh = new ASCIIcode('h', 104.0, 01100001);
        asciicode.add(letterh);
        ASCIIcode letteri = new ASCIIcode('i', 105.0, 01100001);
        asciicode.add(letteri);
        ASCIIcode letterj = new ASCIIcode('j', 106.0, 01100001);
        asciicode.add(letterj);
        ASCIIcode letterk = new ASCIIcode('k', 107.0, 01100001);
        asciicode.add(letterk);
        ASCIIcode letterl = new ASCIIcode('l', 108.0, 01100001);
        asciicode.add(letterl);
        ASCIIcode letterm = new ASCIIcode('m', 109.0, 01100001);
        asciicode.add(letterm);
        ASCIIcode lettern = new ASCIIcode('n', 110.0, 01100001);
        asciicode.add(lettern);
        ASCIIcode lettero = new ASCIIcode('o', 111.0, 01100001);
        asciicode.add(lettero);
        ASCIIcode letterp = new ASCIIcode('p', 112.0, 01100001);
        asciicode.add(letterp);
        ASCIIcode letterq = new ASCIIcode('q', 113.0, 01100001);
        asciicode.add(letterq);
        ASCIIcode letterr = new ASCIIcode('r', 114.0, 01100001);
        asciicode.add(letterr);
        ASCIIcode letters = new ASCIIcode('s', 115.0, 01100001);
        asciicode.add(letters);
        ASCIIcode lettert = new ASCIIcode('t', 116.0, 01100001);
        asciicode.add(lettert);
        ASCIIcode letteru = new ASCIIcode('u', 117.0, 01100001);
        asciicode.add(letteru);
        ASCIIcode letterv = new ASCIIcode('v', 118.0, 01100001);
        asciicode.add(letterv);
        ASCIIcode letterw = new ASCIIcode('w', 119.0, 01100001);
        asciicode.add(letterw);
        ASCIIcode letterx = new ASCIIcode('x', 120.0, 01100001);
        asciicode.add(letterx);
        ASCIIcode lettery = new ASCIIcode('y', 121.0, 01100001);
        asciicode.add(lettery);
        ASCIIcode letterz = new ASCIIcode('z', 122.0, 01100001);
        asciicode.add(letterz);
        //capital letters
        ASCIIcode letterA = new ASCIIcode('A', 097.0, 01100001);
        asciicode.add(letterA);
        ASCIIcode letterB = new ASCIIcode('B', 098.0, 01100010);
        asciicode.add(letterB);
        ASCIIcode letterC = new ASCIIcode('C', 099.0, 01100001);
        asciicode.add(letterC);
        ASCIIcode letterD = new ASCIIcode('D', 100.0, 01100001);
        asciicode.add(letterD);
        ASCIIcode letterE = new ASCIIcode('E', 101.0, 01100001);
        asciicode.add(letterE);
        ASCIIcode letterF = new ASCIIcode('F', 102.0, 01100001);
        asciicode.add(letterF);
        ASCIIcode letterG = new ASCIIcode('G', 103.0, 01100001);
        asciicode.add(letterG);
        ASCIIcode letterH = new ASCIIcode('H', 104.0, 01100001);
        asciicode.add(letterH);
        ASCIIcode letterI = new ASCIIcode('I', 105.0, 01100001);
        asciicode.add(letterI);
        ASCIIcode letterJ = new ASCIIcode('J', 106.0, 01100001);
        asciicode.add(letterJ);
        ASCIIcode letterK = new ASCIIcode('K', 107.0, 01100001);
        asciicode.add(letterK);
        ASCIIcode letterL = new ASCIIcode('L', 108.0, 01100001);
        asciicode.add(letterL);
        ASCIIcode letterM = new ASCIIcode('M', 109.0, 01100001);
        asciicode.add(letterM);
        ASCIIcode letterN = new ASCIIcode('N', 110.0, 01100001);
        asciicode.add(letterN);
        ASCIIcode letterO = new ASCIIcode('O', 111.0, 01100001);
        asciicode.add(letterO);
        ASCIIcode letterP = new ASCIIcode('P', 112.0, 01100001);
        asciicode.add(letterP);
        ASCIIcode letterQ = new ASCIIcode('Q', 113.0, 01100001);
        asciicode.add(letterQ);
        ASCIIcode letterR = new ASCIIcode('R', 114.0, 01100001);
        asciicode.add(letterR);
        ASCIIcode letterS = new ASCIIcode('S', 115.0, 01100001);
        asciicode.add(letterS);
        ASCIIcode letterT = new ASCIIcode('T', 116.0, 01100001);
        asciicode.add(letterT);
        ASCIIcode letterU = new ASCIIcode('U', 117.0, 01100001);
        asciicode.add(letterU);
        ASCIIcode letterV = new ASCIIcode('V', 118.0, 01100001);
        asciicode.add(letterV);
        ASCIIcode letterW = new ASCIIcode('W', 119.0, 01100001);
        asciicode.add(letterW);
        ASCIIcode letterX = new ASCIIcode('X', 120.0, 01100001);
        asciicode.add(letterX);
        ASCIIcode letterY = new ASCIIcode('Y', 121.0, 01100001);
        asciicode.add(letterY);
        ASCIIcode letterZ = new ASCIIcode('Z', 122.0, 01100001);
        asciicode.add(letterZ);
    }
}