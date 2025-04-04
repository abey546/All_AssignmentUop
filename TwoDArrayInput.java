/*
 * This program demonstrates how to read a 2D array from user input in Java.
 * It initializes a 3x3 array and fills it with user-provided integers.
 */

import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][3];  // A 3x3 array

        // Get input for each element
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter a number for A[" + row + "][" + col + "]: ");
                A[row][col] = scanner.nextInt(); // Read input
            }
        }

        // Print the array
        System.out.println("The 2D array:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
