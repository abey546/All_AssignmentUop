import java.util.Scanner;

public class StringMeasurementConverter {
    /*
     * This program converts various units of measurement to inches.
     * It uses a switch statement to determine the conversion based on user input.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String units;
        double measurement;
        double inches;

        System.out.println("What unit of measurement does your input use?");
        units = scanner.nextLine().toLowerCase();

        System.out.print("Enter the number of " + units + ": ");
        measurement = scanner.nextDouble();

        switch (units) {
            case "inch", "inches", "in" -> inches = measurement;
            case "foot", "feet", "ft" -> inches = measurement * 12;
            case "yard", "yards", "yd" -> inches = measurement * 36;
            case "mile", "miles", "mi" -> inches = measurement * 12 * 5280;
            default -> {
                System.out.println("Wait a minute! Illegal unit of measure! Exiting...");
                scanner.close();
                return;
            }
        }

        System.out.println("Converted measurement in inches: " + inches);
        scanner.close();
    }
}
