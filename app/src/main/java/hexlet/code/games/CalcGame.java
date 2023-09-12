package hexlet.code.games;

public class CalcGame {
    static final int RANDOM_RANGE = 100;
    static final int OPERATORS_RANGE = 3;
    public static void calcDesc() {
        System.out.println("What is the result of the expression?");
    }
    public static String calc() {
        int randomNumber1 = (int) (Math.random() * RANDOM_RANGE);
        int randomNumber2 = (int) (Math.random() * RANDOM_RANGE);
        String[] operators = {"+", "-", "*"};
        int randomOperator = (int) (Math.random() * OPERATORS_RANGE);

        System.out.println("Question: " + randomNumber1 + " " + operators[randomOperator]
                + " " + randomNumber2);
        System.out.print("Your answer: ");

        return switch (operators[randomOperator]) {
            case "+" -> Integer.toString(randomNumber1 + randomNumber2);
            case "-" -> Integer.toString(randomNumber1 - randomNumber2);
            case "*" -> Integer.toString(randomNumber1 * randomNumber2);
            default -> "";
        };

    }
}
