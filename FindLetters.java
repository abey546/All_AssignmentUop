import java.util.Scanner;

public class FindLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toUpperCase(); // Convert to uppercase for easy comparison
        
        int count = 0; // Count of unique letters found

        // Outer loop: Iterate over each letter in A-Z
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            // Inner loop: Check if the letter is in the input string
            boolean found = false;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == letter) {
                    found = true;
                    break; // Stop checking once found
                }
            }

            // If the letter was found, print it and increase the count
            if (found) {
                System.out.print(letter + " ");
                count++;
            }
        }

        // Output the total number of unique letters found
        System.out.println("\nTotal different letters found: " + count);
        
        scanner.close();
    }
}
