package hexlet.code.games;

public class ProgressionGame {
    public static void progressionDesc() {
        System.out.println("What number is missing in the progression?");
    }
    public static String progression() {
        int progLenght = 5 + (int) (Math.random() * 5);
        int progression = 1 + (int) (Math.random() * 10);
        int randomStart = (int) (Math.random() * 100);
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
