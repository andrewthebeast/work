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
        int a;
        System.out.println("how many letters are in your name?");
        a = scan.nextInt();
        int[] nameinascii = new int[a];
        System.out.println("If the number begings with zero please do not enter the zero");
        for (int i = 0; i < a; i++) {
            System.out.println("What is the " + (i+1) + " letter in your name.");
            int temp = scan.nextInt();
            nameinascii[i] = temp;
        }
        System.out.println("Changing your name");
        for (int i = 0; i < nameinascii.length; i++) {
            for (int j = 0; j < asciicode.size(); j++) {
                if(nameinascii[i] == asciicode.get(j).asciinum){
                    nameinascii[i] = asciicode.get(j).binaryval;
                }
            }
        }
        convert(nameinascii);
    }
    
    public static void makeConverter(){
        //lowercase letters
        ASCIIcode lettera = new ASCIIcode(97, 1100001);
        asciicode.add(lettera);
        ASCIIcode letterb = new ASCIIcode(98, 1100010);
        asciicode.add(letterb);
        ASCIIcode letterc = new ASCIIcode(99, 1100011);
        asciicode.add(letterc);
        ASCIIcode letterd = new ASCIIcode(100, 1100100);
        asciicode.add(letterd);
        ASCIIcode lettere = new ASCIIcode(101, 1100101);
        asciicode.add(lettere);
        ASCIIcode letterf = new ASCIIcode(102, 1100110);
        asciicode.add(letterf);
        ASCIIcode letterg = new ASCIIcode(103, 1100111);
        asciicode.add(letterg);
        ASCIIcode letterh = new ASCIIcode(104, 1101000);
        asciicode.add(letterh);
        ASCIIcode letteri = new ASCIIcode(105, 1101001);
        asciicode.add(letteri);
        ASCIIcode letterj = new ASCIIcode(106, 1101010);
        asciicode.add(letterj);
        ASCIIcode letterk = new ASCIIcode(107, 1101011);
        asciicode.add(letterk);
        ASCIIcode letterl = new ASCIIcode(108, 1101100);
        asciicode.add(letterl);
        ASCIIcode letterm = new ASCIIcode(109, 1101101);
        asciicode.add(letterm);
        ASCIIcode lettern = new ASCIIcode(110, 1101110);
        asciicode.add(lettern);
        ASCIIcode lettero = new ASCIIcode(111, 1101111);
        asciicode.add(lettero);
        ASCIIcode letterp = new ASCIIcode(112, 1110000);
        asciicode.add(letterp);
        ASCIIcode letterq = new ASCIIcode(113, 1110001);
        asciicode.add(letterq);
        ASCIIcode letterr = new ASCIIcode(114, 1110010);
        asciicode.add(letterr);
        ASCIIcode letters = new ASCIIcode(115, 1110011);
        asciicode.add(letters);
        ASCIIcode lettert = new ASCIIcode(116, 1110100);
        asciicode.add(lettert);
        ASCIIcode letteru = new ASCIIcode(117, 1110101);
        asciicode.add(letteru);
        ASCIIcode letterv = new ASCIIcode(118, 1110110);
        asciicode.add(letterv);
        ASCIIcode letterw = new ASCIIcode(119, 1110111);
        asciicode.add(letterw);
        ASCIIcode letterx = new ASCIIcode(120, 1111000);
        asciicode.add(letterx);
        ASCIIcode lettery = new ASCIIcode(121, 1100001);
        asciicode.add(lettery);
        ASCIIcode letterz = new ASCIIcode(122, 1111010);
        asciicode.add(letterz);
        //capital letters
        ASCIIcode letterA = new ASCIIcode(65, 1000001);
        asciicode.add(letterA);
        ASCIIcode letterB = new ASCIIcode(66, 1000010);
        asciicode.add(letterB);
        ASCIIcode letterC = new ASCIIcode(67, 1000011);
        asciicode.add(letterC);
        ASCIIcode letterD = new ASCIIcode(68, 1000100);
        asciicode.add(letterD);
        ASCIIcode letterE = new ASCIIcode(69, 1000101);
        asciicode.add(letterE);
        ASCIIcode letterF = new ASCIIcode(70, 1000110);
        asciicode.add(letterF);
        ASCIIcode letterG = new ASCIIcode(71, 1000111);
        asciicode.add(letterG);
        ASCIIcode letterH = new ASCIIcode(72, 1001000);
        asciicode.add(letterH);
        ASCIIcode letterI = new ASCIIcode(73, 1001001);
        asciicode.add(letterI);
        ASCIIcode letterJ = new ASCIIcode(74, 1001010);
        asciicode.add(letterJ);
        ASCIIcode letterK = new ASCIIcode(75, 1001011);
        asciicode.add(letterK);
        ASCIIcode letterL = new ASCIIcode(76, 1001100);
        asciicode.add(letterL);
        ASCIIcode letterM = new ASCIIcode(77, 1001101);
        asciicode.add(letterM);
        ASCIIcode letterN = new ASCIIcode(78, 1001110);
        asciicode.add(letterN);
        ASCIIcode letterO = new ASCIIcode(79, 1001111);
        asciicode.add(letterO);
        ASCIIcode letterP = new ASCIIcode(80, 1010000);
        asciicode.add(letterP);
        ASCIIcode letterQ = new ASCIIcode(81, 1010001);
        asciicode.add(letterQ);
        ASCIIcode letterR = new ASCIIcode(82, 1010010);
        asciicode.add(letterR);
        ASCIIcode letterS = new ASCIIcode(83, 1010011);
        asciicode.add(letterS);
        ASCIIcode letterT = new ASCIIcode(84, 1010100);
        asciicode.add(letterT);
        ASCIIcode letterU = new ASCIIcode(85, 1010101);
        asciicode.add(letterU);
        ASCIIcode letterV = new ASCIIcode(86, 1010110);
        asciicode.add(letterV);
        ASCIIcode letterW = new ASCIIcode(87, 100111);
        asciicode.add(letterW);
        ASCIIcode letterX = new ASCIIcode(88, 1011000);
        asciicode.add(letterX);
        ASCIIcode letterY = new ASCIIcode(89, 1000001);
        asciicode.add(letterY);
        ASCIIcode letterZ = new ASCIIcode(90, 1011010);
        asciicode.add(letterZ);
    }
    
    public static void convert(int [] nameinascii){
        for (int i = 0; i < nameinascii.length; i++) {
            
        }
    }
}
