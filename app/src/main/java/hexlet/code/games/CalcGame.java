package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    static final int RANDOM_RANGE = 100;
    static final int OPERATORS_RANGE = 3;
    static final int ROUNDS_LENGTH = 3;
    static final int ROUND_LENGTH = 2;
    static final String CALC_DESCRIPTION = "What is the result of the expression?";
    public static void calcPlay() {

        String[] operators = {"+", "-", "*"};
        String[][] rounds = new String[ROUNDS_LENGTH][ROUND_LENGTH];
        for (int i = 0; i < ROUNDS_LENGTH; i++) {
            var firstNumber = Utils.getRandomNumber(RANDOM_RANGE);
            var secondNumber = Utils.getRandomNumber(RANDOM_RANGE);
            var operator = operators[Utils.getRandomNumber(OPERATORS_RANGE)];

            rounds[i][0] = firstNumber + " " + operator + " " + secondNumber;
            rounds[i][1] = Integer.toString(calculate(firstNumber, operator, secondNumber));

        }
        Engine.run(rounds, CALC_DESCRIPTION);
    }

    public static int calculate(int firstNumber, String operator, int secondNumber) {
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };

    }
}
