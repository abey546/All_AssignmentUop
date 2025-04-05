/*
 * This program tracks the monthly profit of 25 stores over a year.
 * It initializes a 2D array with 25 rows (stores) and 12 columns (months).
 */
import java.util.Scanner;


public class ProfitTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] profit = new double[25][12];

        for (int store = 0; store < 25; store++) {
            for (int month = 0; month < 12; month++) {
                System.out.print("Enter profit for store " + store + " in month " + (month + 1) + ": ");
                profit[store][month] = scanner.nextDouble();
            }
        }
        scanner.close();
    }
}