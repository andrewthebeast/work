/*******************************************************************************
 * Program Filename : Luna_5_BitParity.java
 * Author : Luna, Andrew
 * Date : May10th, 2017
 * Description : Asks the user for their name in binary then uses the hemming code to transform the name
 * Input : users name
 * Output: Hemming code up dated
 ******************************************************************************/
package luna_5_bitparity;
import java.util.Scanner;
import java.util.ArrayList;
public class Luna_5_Bitparity {
    static Scanner scan = new Scanner(System.in);
    static String name;
    static String newname;
    static ArrayList<ASCIIcode> asciicode = new ArrayList<ASCIIcode>();
    public static void main(String[] args) {
        makeConverter();
        System.out.println("Please enter your name in ascii");
        name = scan.nextLine();
    }
    
    public static void makeConverter(){
        //lowercase letters
        ASCIIcode lettera = new ASCIIcode(97, 01100001);
        asciicode.add(lettera);
        ASCIIcode letterb = new ASCIIcode(98, 01100010);
        asciicode.add(letterb);
        ASCIIcode letterc = new ASCIIcode(99, 01100011);
        asciicode.add(letterc);
        ASCIIcode letterd = new ASCIIcode(100, 01100100);
        asciicode.add(letterd);
        ASCIIcode lettere = new ASCIIcode(101, 01100101);
        asciicode.add(lettere);
        ASCIIcode letterf = new ASCIIcode(102, 01100110);
        asciicode.add(letterf);
        ASCIIcode letterg = new ASCIIcode(103, 01100111);
        asciicode.add(letterg);
        ASCIIcode letterh = new ASCIIcode(104, 01101000);
        asciicode.add(letterh);
        ASCIIcode letteri = new ASCIIcode(105, 01101001);
        asciicode.add(letteri);
        ASCIIcode letterj = new ASCIIcode(106, 01101010);
        asciicode.add(letterj);
        ASCIIcode letterk = new ASCIIcode(107, 01101011);
        asciicode.add(letterk);
        ASCIIcode letterl = new ASCIIcode(108, 01101100);
        asciicode.add(letterl);
        ASCIIcode letterm = new ASCIIcode(109, 01101101);
        asciicode.add(letterm);
        ASCIIcode lettern = new ASCIIcode(110, 01101110);
        asciicode.add(lettern);
        ASCIIcode lettero = new ASCIIcode(111, 01101111);
        asciicode.add(lettero);
        ASCIIcode letterp = new ASCIIcode(112, 01110000);
        asciicode.add(letterp);
        ASCIIcode letterq = new ASCIIcode(113, 01110001);
        asciicode.add(letterq);
        ASCIIcode letterr = new ASCIIcode(114, 01110010);
        asciicode.add(letterr);
        ASCIIcode letters = new ASCIIcode(115, 01110011);
        asciicode.add(letters);
        ASCIIcode lettert = new ASCIIcode(116, 01110100);
        asciicode.add(lettert);
        ASCIIcode letteru = new ASCIIcode(117, 01110101);
        asciicode.add(letteru);
        ASCIIcode letterv = new ASCIIcode(118, 01110110);
        asciicode.add(letterv);
        ASCIIcode letterw = new ASCIIcode(119, 01110111);
        asciicode.add(letterw);
        ASCIIcode letterx = new ASCIIcode(120, 01111000);
        asciicode.add(letterx);
        ASCIIcode lettery = new ASCIIcode(121, 01100001);
        asciicode.add(lettery);
        ASCIIcode letterz = new ASCIIcode(122, 01111010);
        asciicode.add(letterz);
        //capital letters
        ASCIIcode letterA = new ASCIIcode(65, 01000001);
        asciicode.add(letterA);
        ASCIIcode letterB = new ASCIIcode(66, 01000010);
        asciicode.add(letterB);
        ASCIIcode letterC = new ASCIIcode(67, 01000011);
        asciicode.add(letterC);
        ASCIIcode letterD = new ASCIIcode(68, 01000100);
        asciicode.add(letterD);
        ASCIIcode letterE = new ASCIIcode(69, 01000101);
        asciicode.add(letterE);
        ASCIIcode letterF = new ASCIIcode(70, 01000110);
        asciicode.add(letterF);
        ASCIIcode letterG = new ASCIIcode(71, 01000111);
        asciicode.add(letterG);
        ASCIIcode letterH = new ASCIIcode(72, 01001000);
        asciicode.add(letterH);
        ASCIIcode letterI = new ASCIIcode(73, 01001001);
        asciicode.add(letterI);
        ASCIIcode letterJ = new ASCIIcode(74, 01001010);
        asciicode.add(letterJ);
        ASCIIcode letterK = new ASCIIcode(75, 01001011);
        asciicode.add(letterK);
        ASCIIcode letterL = new ASCIIcode(76, 01001100);
        asciicode.add(letterL);
        ASCIIcode letterM = new ASCIIcode(77, 01001101);
        asciicode.add(letterM);
        ASCIIcode letterN = new ASCIIcode(78, 01001110);
        asciicode.add(letterN);
        ASCIIcode letterO = new ASCIIcode(79, 01001111);
        asciicode.add(letterO);
        ASCIIcode letterP = new ASCIIcode(80, 01010000);
        asciicode.add(letterP);
        ASCIIcode letterQ = new ASCIIcode(81, 01010001);
        asciicode.add(letterQ);
        ASCIIcode letterR = new ASCIIcode(82, 01010010);
        asciicode.add(letterR);
        ASCIIcode letterS = new ASCIIcode(83, 01010011);
        asciicode.add(letterS);
        ASCIIcode letterT = new ASCIIcode(84, 01010100);
        asciicode.add(letterT);
        ASCIIcode letterU = new ASCIIcode(85, 01010101);
        asciicode.add(letterU);
        ASCIIcode letterV = new ASCIIcode(86, 01010110);
        asciicode.add(letterV);
        ASCIIcode letterW = new ASCIIcode(87, 0100111);
        asciicode.add(letterW);
        ASCIIcode letterX = new ASCIIcode(88, 01011000);
        asciicode.add(letterX);
        ASCIIcode letterY = new ASCIIcode(89, 01000001);
        asciicode.add(letterY);
        ASCIIcode letterZ = new ASCIIcode(90, 01011010);
        asciicode.add(letterZ);
    }
}
