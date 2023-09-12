package hexlet.code.games;

public class EvenGame {

    public static void evenDesc() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String evenCheck() {
        final int RANDOMRANGE = 100;
        int randomNumber = (int) (Math.random() * RANDOMRANGE);
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
