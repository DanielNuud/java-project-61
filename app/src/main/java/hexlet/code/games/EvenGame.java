package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    static final int ROUNDS_LENGTH = 3;
    static final int ROUND_LENGTH = 2;
    static final int RANDOM_RANGE = 100;
    static final String EVEN_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenPlay() {

        String[][] rounds = new String[ROUNDS_LENGTH][ROUND_LENGTH];
        for (int i = 0; i < ROUNDS_LENGTH; i++) {
            var randomNumber = Utils.getRandomNumber(RANDOM_RANGE);
            rounds[i][0] = Integer.toString(randomNumber);
            rounds[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.run(rounds, EVEN_DESCRIPTION);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
