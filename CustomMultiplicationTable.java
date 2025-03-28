
/*
 * This program generates a multiplication table of a specified size.
 * The user is prompted to enter the size of the table,
 */
import java.util.Scanner;

public class CustomMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the table size from the user
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        // Print the multiplication table
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.printf("%4d", row * col); // Print each value with 4 spaces for alignment
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
