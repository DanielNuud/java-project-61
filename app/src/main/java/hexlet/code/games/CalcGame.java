package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    static final int RANDOM_RANGE = 100;
    static final int OPERATORS_RANGE = 3;
    static final int ROUNDS_LENGTH = 3;
    static final int ROUND_LENGTH = 2;
    public static void calcDesc() {
        System.out.println("What is the result of the expression?");
    }
    public static String[][] calcRounds() {

        String[] operators = {"+", "-", "*"};
        String[][] rounds = new String[ROUNDS_LENGTH][ROUND_LENGTH];
        for (int i = 0; i < ROUNDS_LENGTH ; i++) {
            var firstNumber = Engine.getRandomStringNumber(RANDOM_RANGE);
            var secondNumber = Engine.getRandomStringNumber(RANDOM_RANGE);
            var operator = operators[Engine.getRandomNumber(OPERATORS_RANGE)];

            rounds[i][0] = firstNumber + " " + operator + " " + secondNumber;
            rounds[i][1] = Integer.toString(calc(firstNumber, operator, secondNumber));

        }
        return rounds;
    }

    public static int calc(String firstNumber, String operator, String secondNumber) {
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);

        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };

    }
}
