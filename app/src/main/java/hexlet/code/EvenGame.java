package hexlet.code;

import java.util.Scanner;

public class EvenGame {
    public static void evenCheck(String username) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnswers = 0;

        while (correctAnswers != 3) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userInput = new Scanner(System.in).nextLine();

            String correctAnswer = "";
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

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
