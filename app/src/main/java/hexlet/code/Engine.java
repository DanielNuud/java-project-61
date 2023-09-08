package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import java.util.Scanner;

public class Engine {

    public static void game(int gamechoice, String username) {
        var correctAnswers = 0;
        String correctAnswer = "";

        while (correctAnswers != 3) {

            switch (gamechoice) {
                case 2:
                    correctAnswer = EvenGame.evenCheck();
                    break;
                case 3:
                    correctAnswer = CalcGame.calc();
                default:
                    break;
            }

            var userInput = new Scanner(System.in).next();
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
