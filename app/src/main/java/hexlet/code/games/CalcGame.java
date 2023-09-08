package hexlet.code.games;

public class CalcGame {
    public static void calcDesc() {
        System.out.println("What is the result of the expression?");
    }
    public static String calc() {

        int randomNumber1 = (int) (Math.random() * 100);
        int randomNumber2 = (int) (Math.random() * 100);
        String[] operators = {"+", "-", "*"};
        int randomOperator = (int) (Math.random() * 3);

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
