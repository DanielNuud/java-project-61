package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        String[] gamesArray = {"Greet", "Even", "Calc", "Exit"};
        for (int i = 0; i < gamesArray.length; i++) {
            if (i != gamesArray.length - 1) {
                System.out.println(i + 1 + " - " + gamesArray[i]);
            } else {
                System.out.println("0 - " + gamesArray[i]);
            }
        }
        System.out.print("Your choice: ");
        int inputGameChoice = new Scanner(System.in).nextInt();

        System.out.println("Welcome to the Brain Games!");
        String inputName = Cli.hello();
        switch (inputGameChoice) {
            case 1:
                break;
            case 2:
                EvenGame.evenDesc();
                Engine.game(inputGameChoice, inputName);
                break;
            case 3:
                CalcGame.calcDesc();
                Engine.game(inputGameChoice, inputName);
            case 0:
                break;
            default:
                break;
        }


    }

}
