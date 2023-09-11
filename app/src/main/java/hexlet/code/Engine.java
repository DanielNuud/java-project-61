package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {

    public static void game(int gameNumber, String username) {
        var correctAnswers = 0;
        String correctAnswer = "";

        while (correctAnswers != 3) {

            switch (gameNumber) {
                case 2:
                    correctAnswer = EvenGame.evenCheck();
                    break;
                case 3:
                    correctAnswer = CalcGame.calc();
                    break;
                case 4:
                    correctAnswer = GCDGame.gcd();
                    break;
                case 5:
                    correctAnswer = ProgressionGame.progression();
                    break;
                case 6:
                    correctAnswer = PrimeGame.prime();
                    break;
                default:
                    break;
            }

            var userInput = new Scanner(System.in).nextLine();
            if (correctAnswer.equals(userInput)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userInput + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + username + "!");
                break;
            }
        }

        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
