package hexlet.code.games;

public class ProgressionGame {
    static final int MIN_LENGTH = 5;
    static final int LENGTH_RANGE = 5;
    static final int MIN_PROGRESSION = 1;
    static final int PROGRESSION_RANGE = 10;
    static final int RANDOM_RANGE = 100;

    public static void progressionDesc() {
        System.out.println("What number is missing in the progression?");
    }
    public static String progression() {
        int progLenght = MIN_LENGTH + (int) (Math.random() * LENGTH_RANGE);
        int progression = MIN_PROGRESSION + (int) (Math.random() * PROGRESSION_RANGE);
        int randomStart = (int) (Math.random() * RANDOM_RANGE);
        int hidenNumber = (int) (Math.random() * progLenght);

        String result = randomStart + " ";
        int correctAnswer = 0;

        for (int i = 0; i < progLenght; i++) {
            randomStart += progression;
            if (i == hidenNumber) {
                result += ".. ";
                correctAnswer = randomStart;
            } else {
                result += randomStart + " ";
            }
        }

        System.out.print("Question: ");
        System.out.println(result);
        System.out.print("Your answer: ");
        return Integer.toString(correctAnswer);
    }
}
