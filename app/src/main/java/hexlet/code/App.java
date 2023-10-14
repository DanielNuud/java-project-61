package hexlet.code;

import hexlet.code.games.GCDGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        String[] gamesArray = {"Greet", "Even", "Calc", "GCD", "Progression", "Prime", "Exit"};
        for (int i = 0; i < gamesArray.length; i++) {
            if (i != gamesArray.length - 1) {
                System.out.println(i + 1 + " - " + gamesArray[i]);
            } else {
                System.out.println("0 - " + gamesArray[i]);
            }
        }
        System.out.print("Your choice: ");
        String inputGameChoice = new Scanner(System.in).nextLine();

        switch (inputGameChoice) {
            case "1" -> Cli.hello();
            case "2" -> EvenGame.evenPlay();
            case "3" -> CalcGame.calcPlay();
            case "4" -> GCDGame.gcdPlay();
            case "5" -> ProgressionGame.progressionPlay();
            case "6" -> PrimeGame.primePlay();
            case "0" -> {
            }
            default -> throw new IllegalArgumentException("Unknown value: " + inputGameChoice);
        }


    }

}
