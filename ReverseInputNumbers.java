import java.util.Scanner;

public class ReverseInputNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[100]; 
        int count = 0; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 100 positive integers; enter 0 to end.");
        while (true) {
            System.out.print("? ");
            int num = scanner.nextInt();
            if (num <= 0) break;
            numbers[count] = num; 
            count++;
        }

        System.out.println("\nYour numbers in reverse order:");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
