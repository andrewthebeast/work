package val;
import java.util.Scanner;
public class Val {
    static Scanner scanner = new Scanner(System.in);
    static String input, name;
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        name = scanner.nextLine();
        System.out.println("Hello "+ name+" wlecome to this questionaire!\nLet's begin");
        System.out.println("Do you like bears?");
        input = scanner.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\nDo you like chocolate?");
        input = scanner.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\nNow the final question\nAre you ready?");
        input = scanner.nextLine();
        if (input.contains("yes")) {
            System.out.println("Will you be my Valentine");
            input = scanner.nextLine();
            if (input.contains("yes")) {
                System.out.println("YAY");
            }else{
                System.out.println("Are you sure?");
            }
        }else{
            System.out.println("\n\n\n\n\n\n\n\n\n\nHow About Now?");
            input = scanner.nextLine();
            if (input.contains("yes")) {
                System.out.println("Will you be my Valentine");
                input = scanner.nextLine();
                if (input.contains("yes")) {
                    System.out.println("YAY");
                }else{
                    System.out.println("Are you sure?");
                }
            }
        }
    }   
}