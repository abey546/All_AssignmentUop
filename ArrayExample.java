/*
 * This is a simple Java program that demonstrates how to create an array,
 * take user input to fill the array, and then print the contents of the array.
 */

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5]; // Array of 5 integers
        
        // Taking input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt(); // Store user input
        }

        // Printing the numbers
        System.out.println("You entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        scanner.close();
    }
}
