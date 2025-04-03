import java.util.Scanner;
/*
 * * This program calculates the average of numbers entered by the user.
 * * It continues to accept numbers until the user presses Enter without entering a number.
 * * It handles invalid inputs gracefully and provides feedback to the user.
 */

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double number, total = 0;
        int count = 0;

        System.out.println("Enter numbers (press Enter to finish):");

        while (true) {
            System.out.print("? ");
            input = scanner.nextLine();

            if (input.equals("")) {  // Stop if the user presses Enter
                break;
            }

            try {
                number = Double.parseDouble(input);
                total += number;
                count++;
            } 
            catch (NumberFormatException e) {
                System.out.println("Not a valid number! Try again.");
            }
        }

        if (count > 0) {
            double avg = total / count;
            System.out.printf("The average of %d numbers is %.6g%n", count, avg);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
