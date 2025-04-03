import java.util.Scanner;

public class ValidNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a valid number: ");
            String userInput = scanner.nextLine();

            try {
                number = Integer.parseInt(userInput); // Convert input
                break; // Exit loop if conversion is successful
            } 
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Try again.");
            }
        }

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
