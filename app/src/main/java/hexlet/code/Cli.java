package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String hello() {
        System.out.print("May I have your name? ");
        String inputName = new Scanner(System.in).nextLine();
        System.out.println("Hello, " + inputName + "!");
        return inputName;
    }
}
