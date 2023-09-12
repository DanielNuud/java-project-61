package hexlet.code.games;

public class EvenGame {
    static final int RANDOM_RANGE = 100;
    public static void evenDesc() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String evenCheck() {
        int randomNumber = (int) (Math.random() * RANDOM_RANGE);
        System.out.println("Question: " + randomNumber);
        System.out.print("Your answer: ");

        String correctAnswer = "";
        if (randomNumber % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }

        return correctAnswer;
    }
}
