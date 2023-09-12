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
            case "1":
                    Cli.hello();
                break;
            case "2":
                String inputNameEven = Cli.hello();
                EvenGame.evenDesc();
                Engine.game(inputGameChoice, inputNameEven);
                break;
            case "3":
                String inputNameCalc = Cli.hello();
                CalcGame.calcDesc();
                Engine.game(inputGameChoice, inputNameCalc);
                break;
            case "4":
                String inputNameGCD = Cli.hello();
                GCDGame.gcdDesc();
                Engine.game(inputGameChoice, inputNameGCD);
                break;
            case "5":
                String inputNameProg = Cli.hello();
                ProgressionGame.progressionDesc();
                Engine.game(inputGameChoice, inputNameProg);
                break;
            case "6":
                String inputNamePrime = Cli.hello();
                PrimeGame.primeDesc();
                Engine.game(inputGameChoice, inputNamePrime);
                break;
            case "0":
                break;
            default:
                break;
        }


    }

}
