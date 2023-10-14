package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void run(String[][] roundsData, String description) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String inputName = new Scanner(System.in).next();
        System.out.printf("Hello, %s! ", inputName);
        System.out.println(description);

        for (String[] roundData : roundsData) {
            String question = roundData[0];
            String correctAnswer = roundData[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String userInput = new Scanner(System.in).nextLine().toLowerCase().trim();

            if (!correctAnswer.equals(userInput)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!",
                        userInput, correctAnswer, inputName);
                return;
            }

            System.out.println("Correct!");
        }

        System.out.printf("Congratulations, %s!", inputName);
    }
}
