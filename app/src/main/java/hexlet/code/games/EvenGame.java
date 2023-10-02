package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    static final int ROUNDS_LENGTH = 3;
    static final int ROUND_LENGTH = 2;
    public static void evenDesc() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String[][] evenRounds() {

        String[][] rounds = new String[ROUNDS_LENGTH][ROUND_LENGTH];
        for (int i = 0; i < ROUNDS_LENGTH; i++) {
            var randomNumber = Engine.getRandomNumber(100);
            rounds[i][0] = Integer.toString(randomNumber);
            rounds[i][1] = isEven(randomNumber) ? "yes" : "no";
        }

        return rounds;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
