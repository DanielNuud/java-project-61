package hexlet.code.games;

public class EvenGame {

    public static void evenDesc() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String evenCheck() {
        int randomNumber = (int) (Math.random() * 100);
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
