package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        String[] gamesArray = {"Greet" , "Even" , "Exit"};
        for (int i = 0; i < gamesArray.length ; i++) {
            if (i != gamesArray.length-1){
                System.out.println(i+1 + " - " + gamesArray[i]);
            } else
                System.out.println("0 - " + gamesArray[i]);
        }
        System.out.print("Your choice: ");
        int inputGameChoice = new Scanner(System.in).nextInt();

        System.out.println("Welcome to the Brain Games!");
        switch (inputGameChoice){
            case 1: Cli.hello();
                break;
            case 2:
                String inputName = Cli.hello();
                EvenGame.evenCheck(inputName);
                break;
            case 0:
                break;
        }


    }

}
