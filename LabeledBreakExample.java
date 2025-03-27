import java.util.Scanner;
/*
 * A program that checks if two words share a common letter.
 * If a common letter is found, the program should immediately stop searching.
 */

public class LabeledBreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = scanner.next();
        System.out.print("Enter second word: ");
        String word2 = scanner.next();
        
        boolean nothingInCommon = true; // Assume no common characters exist
        int i = 0, j;
        
        search: // Label for the outer loop
        while (i < word1.length()) {
            j = 0;
            while (j < word2.length()) {
                if (word1.charAt(i) == word2.charAt(j)) { 
                    nothingInCommon = false;
                    System.out.println("Common letter found: " + word1.charAt(i));
                    break search; // Breaks out of BOTH loops
                }
                j++;
            }
            i++;
        }

        if (nothingInCommon) {
            System.out.println("No common letters found.");
        }

        scanner.close();
    }
}

