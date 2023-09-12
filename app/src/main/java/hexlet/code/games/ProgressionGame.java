package hexlet.code.games;

public class ProgressionGame {
    public static void progressionDesc() {
        System.out.println("What number is missing in the progression?");
    }
    public static String progression() {
        final int MINLENGHT = 5;
        final int LENGHTRANGE = 5;
        int progLenght = MINLENGHT + (int) (Math.random() * LENGHTRANGE);

        final int MINPROGRESSION = 1;
        final int PROGRESSIONRANGE = 10;
        int progression = MINPROGRESSION + (int) (Math.random() * PROGRESSIONRANGE);

        final int RANDOMRANGE = 100;
        int randomStart = (int) (Math.random() * RANDOMRANGE);
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
