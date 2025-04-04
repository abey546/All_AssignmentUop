/*
 * BirthdayProblem.java
 * This program simulates the birthday problem, where we randomly assign birthdays to people
 */

import java.util.Random;

public class BirthdayProblem {
    public static void main(String[] args) {
        boolean[] used = new boolean[365]; // Track birthdays seen
        int count = 0;
        Random rand = new Random();

        while (true) {
            int birthday = rand.nextInt(365); // Random birthday (0-364)
            count++;
            System.out.printf("Person %d has birthday number %d%n", count, birthday);
            
            if (used[birthday]) { // If birthday already exists, stop
                break;
            }
            used[birthday] = true; // Mark birthday as seen
        }
        System.out.println("\nA duplicate birthday was found after " + count + " tries.");
    }
}
