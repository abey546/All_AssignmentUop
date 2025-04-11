/*
 * This program implements a simple guessing game where the computer picks a random number
 * between 1 and 100, and the user has to guess it. The user has 6 attempts to guess the number.
 * If the user guesses correctly, the program congratulates them and tells them how many guesses it took.
 * If the user fails to guess the number within 6 attempts, the program reveals the number and ends the game.
 * The program also allows the user to play again or exit after each game.
 * The program uses a Scanner object to read user input and includes error handling for invalid inputs.
 */

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game. I'll pick a number between");
        System.out.println("1 and 100, and you try to guess it.");
        boolean playAgain;

        do {
            playGame(scanner); // Call the subroutine to play one game, passing the scanner
            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("yes");
        } while (playAgain);

        System.out.println("Thanks for playing. Goodbye.");
        scanner.close(); // Close the Scanner in the main method
    } // end of main()

    static void playGame(Scanner scanner) {
        int computersNumber; // A random number picked by the computer.
        int usersGuess;     // A number entered by the user as a guess.
        int guessCount;     // Number of guesses the user has made.

        computersNumber = (int)(100 * Math.random()) + 1;
        // The value assigned to computersNumber is a randomly
        // chosen integer between 1 and 100, inclusive.

        guessCount = 0;

        System.out.println();
        System.out.print("What is your first guess? ");

        while (true) {
            if (scanner.hasNextInt()) {
                usersGuess = scanner.nextInt(); // Get the user's guess.
                scanner.nextLine(); // Consume the newline character left by nextInt()
                guessCount++;

                if (usersGuess == computersNumber) {
                    System.out.println("You got it in " + guessCount
                            + " guesses! My number was " + computersNumber);
                    break; // The game is over; the user has won.
                }

                if (guessCount == 6) {
                    System.out.println("You didn't get the number in 6 guesses.");
                    System.out.println("You lose. My number was " + computersNumber);
                    break; // The game is over; the user has lost.
                }

                // If we reach this point, the game continues.
                // Tell the user if the guess was too high or too low.
                if (usersGuess < computersNumber) {
                    System.out.print("That's too low. Try again: ");
                } else if (usersGuess > computersNumber) {
                    System.out.print("That's too high. Try again: ");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                System.out.print("Try again: ");
            }
        }

        System.out.println();
        // Note: We are now passing the Scanner object, so we should not close it here
        // as it's still being used in the main method for asking if the user wants to play again.
        // Closing it here would cause an error in the main method.
    } // end of playGame()
} // end of class GuessingGame