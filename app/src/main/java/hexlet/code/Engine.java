package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int WIN_NUMBER = 3;

    public static int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }
    public static String getRandomStringNumber(int max) {
        return Integer.toString((int) (Math.random() * max));
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void game(String[][] game, String username) {
        int correctAnswersCount = 0;
        int round = 0;

        while (correctAnswersCount != WIN_NUMBER) {

            System.out.println("Question: " + game[round][0]);
            System.out.print("Your answer: ");
            var userInput = new Scanner(System.in).nextLine().toLowerCase().trim();

            if (game[round][1].equals(userInput)) {
                System.out.println("Correct!");
                correctAnswersCount++;
                round++;
            } else {
                System.out.println("'" + userInput + "' is wrong answer ;(. "
                        + "Correct answer was '" + game[round][1] + "'.\n"
                        + "Let's try again, " + username + "!");
                break;
            }
        }

        if (correctAnswersCount == WIN_NUMBER) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
