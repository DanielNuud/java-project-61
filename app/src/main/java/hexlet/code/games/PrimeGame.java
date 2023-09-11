package hexlet.code.games;

public class PrimeGame {
    public static void primeDesc() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String prime() {
        int randomRange = 100;
        int randomNumber = (int) (Math.random() * randomRange);
        System.out.println("Question: " + randomNumber);
        System.out.print("Your answer: ");

        if (randomNumber <= 1) {
            return "no";
        }

        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
