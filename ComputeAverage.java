import java.util.Scanner; // Import Scanner for user input

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        int inputNumber;  // Stores user input
        int sum = 0;      // Sum of numbers
        int count = 0;    // Number of inputs
        double average;   // Stores computed average

        // Prompt user for input
        System.out.print("Enter a positive integer (0 to stop): ");
        inputNumber = scanner.nextInt();

        // while loop to process input numbers
        while (inputNumber != 0) {
            sum += inputNumber; // Add input to sum
            count++;            // Increment count

            System.out.print("Enter next positive integer (0 to stop): ");
            inputNumber = scanner.nextInt(); // Read next input
        }

        // Check if numbers were entered before computing average
        if (count == 0) {
            System.out.println("No numbers were entered!");
        } else {
            average = (double) sum / count; // Compute the average
            System.out.println("You entered " + count + " numbers.");
            System.out.printf("Their average is %.3f\n", average);
        }

        scanner.close(); // Close scanner to prevent resource leak
    }
}
