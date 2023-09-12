package hexlet.code.games;

public class GCDGame {
    public static void gcdDesc() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String gcd() {
        final int RANDOMRANGE = 100;
        int randomNumber1 = (int) (Math.random() * RANDOMRANGE);
        int randomNumber2 = (int) (Math.random() * RANDOMRANGE);

        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        System.out.print("Your answer: ");

        while (randomNumber2 != 0) {
            int temp = randomNumber2;
            randomNumber2 = randomNumber1 % randomNumber2;
            randomNumber1 = temp;
        }
        return Integer.toString(randomNumber1);
    }
}
