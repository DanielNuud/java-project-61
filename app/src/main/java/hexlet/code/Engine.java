package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.CalcGame;

import java.util.Scanner;

public class Engine {
    static final int NUMBER_OF_ROUNDS = 3;

    public static void description(String numOfDescription) {
        switch (numOfDescription) {
            case "2" -> EvenGame.evenDesc();
            case "3" -> CalcGame.calcDesc();
            case "4" -> GCDGame.gcdDesc();
            case "5" -> ProgressionGame.progressionDesc();
            case "6" -> PrimeGame.primeDesc();
            default -> throw new IllegalStateException("Unexpected value: " + numOfDescription);
        }
    }
    public static String engine(String[][] game, String numOfDescription) {

        String username = Cli.hello();

        description(numOfDescription);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + game[i][0]);
            System.out.print("Your answer: ");
            var userInput = new Scanner(System.in)
                    .nextLine()
                    .toLowerCase()
                    .trim();

            if (game[i][1].equals(userInput)) {
                System.out.println("Correct!");
            } else {
                return "'" + userInput + "' is wrong answer ;(. "
                        + "Correct answer was '" + game[i][1] + "'.\n"
                        + "Let's try again, " + username + "!";
            }
        }
        return "Congratulations, " + username + "!";
    }
}
