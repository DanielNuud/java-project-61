package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    static final int MIN_LENGTH = 5;
    static final int LENGTH_RANGE = 10;
    static final int MIN_PROGRESSION = 1;
    static final int PROGRESSION_RANGE = 10;
    static final int RANDOM_RANGE = 100;
    static final int ROUNDS_LENGTH = 3;
    static final int ROUND_LENGTH = 2;

    public static void progressionDesc() {
        System.out.println("What number is missing in the progression?");
    }
    public static void progressionPlay(String inputGameChoice) {

        String[][] rounds = new String[ROUNDS_LENGTH][ROUND_LENGTH];
        for (int i = 0; i < ROUNDS_LENGTH; i++) {
            int progLength = Utils.getRandomNumber(MIN_LENGTH, LENGTH_RANGE);
            int progression = Utils.getRandomNumber(MIN_PROGRESSION, PROGRESSION_RANGE);
            int randomStart = Utils.getRandomNumber(RANDOM_RANGE);
            int hidenNumber = Utils.getRandomNumber(progLength);

            int correctAnswer = 0;
            String result = randomStart + " ";

            for (int j = 0; j < progLength; j++) {
                randomStart += progression;
                if (j == hidenNumber) {
                    result += ".. ";
                    correctAnswer = randomStart;
                } else {
                    result += randomStart + " ";
                }
            }

            rounds[i][0] = result;
            rounds[i][1] = Integer.toString(correctAnswer);
        }

        System.out.println(Engine.engine(rounds, inputGameChoice));
    }
}
