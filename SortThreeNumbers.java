import java.util.Scanner;
/*
 * This program sorts three numbers entered by the user.
 * It uses conditional statements to determine the order of the numbers.
 */

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x < y && x < z) {  // x is the smallest
            if (y < z)
                System.out.println(x + " " + y + " " + z);
            else
                System.out.println(x + " " + z + " " + y);
        } else if (x > y && x > z) {  // x is the largest
            if (y < z)
                System.out.println(y + " " + z + " " + x);
            else
                System.out.println(z + " " + y + " " + x);
        } else {  // x is in the middle
            if (y < z)
                System.out.println(y + " " + x + " " + z);
            else
                System.out.println(z + " " + x + " " + y);
        }

        scanner.close();
    }
}
