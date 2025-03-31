import java.util.Scanner;
/*
 * This program converts various units of measurement to inches.
 * It uses a switch statement to determine the conversion based on user input.
 */

public class MeasurementConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optionNumber;
        double measurement;
        double inches;

        // Display menu
        System.out.println("""
                What unit of measurement does your input use?
                1. inches
                2. feet
                3. yards
                4. miles
                Enter the number of your choice:
                """);
        
        optionNumber = scanner.nextInt();
        
        // Read measurement and convert to inches
        switch (optionNumber) {
            case 1 -> {
                System.out.print("Enter the number of inches: ");
                measurement = scanner.nextDouble();
                inches = measurement;
            }
            case 2 -> {
                System.out.print("Enter the number of feet: ");
                measurement = scanner.nextDouble();
                inches = measurement * 12;
            }
            case 3 -> {
                System.out.print("Enter the number of yards: ");
                measurement = scanner.nextDouble();
                inches = measurement * 36;
            }
            case 4 -> {
                System.out.print("Enter the number of miles: ");
                measurement = scanner.nextDouble();
                inches = measurement * 12 * 5280;
            }
            default -> {
                System.out.println("Error! Illegal option number! Exiting...");
                scanner.close();
                return;
            }
        }

        System.out.println("Converted measurement in inches: " + inches);
        scanner.close();
    }
}
