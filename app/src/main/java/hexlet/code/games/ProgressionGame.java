package hexlet.code.games;

public class ProgressionGame {
    public static void progressionDesc() {
        System.out.println("What number is missing in the progression?");
    }
    public static String progression() {
        int minLenght = 5;
        int lenghtRange = 5;
        int progLenght = minLenght + (int) (Math.random() * lenghtRange);

        int minProgression = 1;
        int progressionRange = 10;
        int progression = minProgression + (int) (Math.random() * progressionRange);

        int randomRange = 100;
        int randomStart = (int) (Math.random() * randomRange);
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
