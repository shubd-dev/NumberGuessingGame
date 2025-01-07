package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main game = new Main();
        game.startGame();
    }

    public void startGame() {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100.\n" +
                "You have 5 chances to guess the correct number.\n" +
                "\n" +
                "Please select the difficulty level:\n" +
                "1. Easy (10 chances)\n" +
                "2. Medium (5 chances)\n" +
                "3. Hard (3 chances)\n"+
                "4. Exit");
        System.out.print("Enter your choice:");

        int chances = setDifficulty(s.nextLine(), s);

        if (chances == 0) return;

        int min = 1;
        int max = 100;
        int chosenNumber = (int) (Math.random() * (max - min + 1)) + min;

        playGame(chances, chosenNumber, s);
    }

    public int setDifficulty(String input, Scanner s) {
        int chances = 0;
        boolean validChoice = false;

        while (!validChoice) {
            switch (input) {
                case "1" -> {
                    chances = 10;
                    System.out.println("Great, you have selected Easy difficulty level");
                    validChoice = true;
                }
                case "2" -> {
                    chances = 5;
                    System.out.println("Great, you have selected Medium difficulty level");
                    validChoice = true;
                }
                case "3" -> {
                    chances = 3;
                    System.out.println("Great, you have selected Hard difficulty level");
                    validChoice = true;
                }
                case "4" -> {
                    System.out.println("GoodBye!");
                    return 0;
                }
                default -> {
                    System.out.println("Invalid selection, Please select a valid difficulty level");
                    input = s.nextLine();
                }
            }
        }
        return chances;
    }

    public void playGame(int chances, int chosenNumber, Scanner s) {
        System.out.println("Let's start the game!\n\n");

        int oriChances = chances;

        while (chances != 0) {
            System.out.print("Enter your choice: ");
            String guess = s.nextLine();

            if (guess.matches("^(100|[1-9]?[0-9])$")) {
                int guessInt = Integer.parseInt(guess);
                if (guessInt == chosenNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + (oriChances - chances + 1) + " attempts.");
                    return;
                } else if (guessInt > chosenNumber) {
                    System.out.println("Incorrect! The number is less than " + guess);
                } else if (guessInt < chosenNumber) {
                    System.out.println("Incorrect! The number is greater than " + guess);
                }
            } else {
                System.out.println("Please Enter valid input (int)");
                continue;
            }
            chances--;
        }
        System.out.println("Sorry, your chances are over, Come back soon!");
    }
}
