package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void hello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String inputName = new Scanner(System.in).nextLine();
        System.out.println("Hello, " + inputName + "!");
    }
}
