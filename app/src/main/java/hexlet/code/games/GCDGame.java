package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDGame {
    static final int RANDOM_RANGE = 100;
    static final int ROUNDS_LENGTH = 3;
    static final int ROUND_LENGTH = 2;
    public static void gcdDesc() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void gcdPlay(String inputGameChoice) {
        var randomNumber1 = Utils.getRandomNumber(RANDOM_RANGE);
        var randomNumber2 = Utils.getRandomNumber(RANDOM_RANGE);

        String[][] rounds = new String[ROUNDS_LENGTH][ROUND_LENGTH];
        for (int i = 0; i < ROUNDS_LENGTH; i++) {
            rounds[i][0] = randomNumber1 + " " + randomNumber2;
            rounds[i][1] = gcd(randomNumber1, randomNumber2);
        }

        System.out.println(Engine.engine(rounds, inputGameChoice));
    }

    public static String gcd(int randomNumber1, int randomNumber2) {
        int num1 = randomNumber1;
        int num2 = randomNumber2;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return Integer.toString(num1);
    }
}
