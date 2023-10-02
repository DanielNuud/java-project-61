package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    static final int RANDOM_RANGE = 100;
    static final int ROUNDS_LENGTH = 3;
    static final int ROUND_LENGTH = 2;
    public static void gcdDesc() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String[][] gcdRounds() {
        String randomNumber1 = Engine.getRandomStringNumber(RANDOM_RANGE);
        String randomNumber2 = Engine.getRandomStringNumber(RANDOM_RANGE);

        String[][] rounds = new String[ROUNDS_LENGTH][ROUND_LENGTH];
        for (int i = 0; i < ROUNDS_LENGTH; i++) {
            rounds[i][0] = randomNumber1 + " " + randomNumber2;
            rounds[i][1] = GCD(randomNumber1, randomNumber2);
        }

        return rounds;
    }

    public static String GCD(String randomNumber1, String randomNumber2) {
        int num1 = Integer.parseInt(randomNumber1);
        int num2 = Integer.parseInt(randomNumber2);

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return Integer.toString(num1);
    }
}
