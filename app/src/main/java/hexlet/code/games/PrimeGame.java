package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    static final int RANDOM_RANGE = 100;
    static final int ROUNDS_LENGTH = 3;
    static final int ROUND_LENGTH = 2;

    static final String PRIME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void primePlay() {

        String[][] rounds = new String[ROUNDS_LENGTH][ROUND_LENGTH];
        for (int i = 0; i < ROUNDS_LENGTH; i++) {
            rounds[i][0] = Integer.toString(Utils.getRandomNumber(RANDOM_RANGE));
            rounds[i][1] = isPrime(Integer.parseInt(rounds[i][0])) ? "yes" : "no";
        }

        Engine.run(rounds, PRIME_DESCRIPTION);
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
