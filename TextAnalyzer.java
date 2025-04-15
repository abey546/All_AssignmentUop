/*
 * TextAnalyzer.java
 * This program analyzes a paragraph of text provided by the user. It counts the number of characters, words, and unique words, finds the most common character, and checks the frequency of a specific character and word.
 */
import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: User Input
        System.out.println("Enter a paragraph or lengthy text:");
        String inputText = scanner.nextLine();

        // Input Validation
        while (inputText.trim().isEmpty()) {
            System.out.println("Text cannot be empty. Please enter a valid paragraph:");
            inputText = scanner.nextLine();
        }

        // Convert text to lowercase for consistent comparison
        String lowerText = inputText.toLowerCase();

        // Step 2: Character Count
        int charCount = inputText.length();
        System.out.println("Total number of characters: " + charCount);

        // Step 3: Word Count
        String[] words = inputText.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);

        // Step 4: Most Common Character
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : lowerText.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // Only count letters and digits
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        char mostCommonChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Most common character: " + mostCommonChar);

        // Step 5: Character Frequency (case-insensitive)
        System.out.print("Enter a character to check its frequency: ");
        String charInput = scanner.nextLine();
        while (charInput.isEmpty() || charInput.length() != 1) {
            System.out.print("Please enter a single character: ");
            charInput = scanner.nextLine();
        }
        char userChar = Character.toLowerCase(charInput.charAt(0));
        int userCharCount = 0;
        for (char c : lowerText.toCharArray()) {
            if (c == userChar) {
                userCharCount++;
            }
        }
        System.out.println("Frequency of '" + userChar + "': " + userCharCount);

        // Step 6: Word Frequency (case-insensitive)
        System.out.print("Enter a word to check its frequency: ");
        String userWord = scanner.nextLine().trim().toLowerCase();
        while (userWord.isEmpty()) {
            System.out.print("Word cannot be empty. Please enter a word: ");
            userWord = scanner.nextLine().trim().toLowerCase();
        }

        int wordFreq = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(userWord)) {
                wordFreq++;
            }
        }
        System.out.println("Frequency of \"" + userWord + "\": " + wordFreq);

        // Step 7: Unique Words
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println("Number of unique words: " + uniqueWords.size());

        scanner.close();
    }
}
