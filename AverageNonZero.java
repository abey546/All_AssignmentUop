/* 
 * This program calculates the average of non-zero elements in an array.
 * It initializes a total variable to 0 and a count variable to 0.
 */

public class AverageNonZero {

    public static void main(String[] args) {
        double[] A = {3.0, 0, 5.2, 0, 7.8};
        double total = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                total += A[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No non-zero elements.");
        } else {
            double average = total / count;
            System.out.println("Average of non-zero elements: " + average);
        }
    }
}