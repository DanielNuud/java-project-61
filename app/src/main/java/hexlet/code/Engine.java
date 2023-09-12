package hexlet.code;

import hexlet.code.games.GCDGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class Engine {

    public static void game(String gameNumber, String username) {
        int correctAnswersCount = 0;
        String correctAnswer = "";
        int winNumber = 3;

        while (correctAnswersCount != winNumber) {

            switch (gameNumber) {
                case "2":
                    correctAnswer = EvenGame.evenCheck();
                    break;
                case "3":
                    correctAnswer = CalcGame.calc();
                    break;
                case "4":
                    correctAnswer = GCDGame.gcd();
                    break;
                case "5":
                    correctAnswer = ProgressionGame.progression();
                    break;
                case "6":
                    correctAnswer = PrimeGame.prime();
                    break;
                default:
                    break;
            }

            var userInput = new Scanner(System.in).nextLine().toLowerCase().trim();
            if (correctAnswer.equals(userInput)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userInput + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + username + "!");
                break;
            }
        }

        if (correctAnswersCount == winNumber) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
