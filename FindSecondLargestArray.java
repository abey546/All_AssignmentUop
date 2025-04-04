/*
 * FindSecondLargestArray.java
 * This program finds the second largest element in an array of doubles.
 */
public class FindSecondLargestArray {

    public static void main(String[] args) {
        double[] A = {4.5, 6.2, 3.8, 7.1};
        double max = A[0];
        double secondMax = Double.MIN_VALUE; // Initialize to smallest possible value

        // Check if we need to adjust initial secondMax value
        if (A.length > 1) {
            secondMax = (A[1] > A[0]) ? A[0] : A[1];
            max = Math.max(A[0], A[1]);

            // Loop starting from index 2
            for (int i = 2; i < A.length; i++) {
                if (A[i] > max) {
                    secondMax = max; // Current max becomes second max
                    max = A[i];      // New value becomes max
                } else if (A[i] > secondMax && A[i] < max) {
                    secondMax = A[i]; // Update second max
                }
            }
        } else {
            System.out.println("Array needs at least 2 elements to find second largest");
            return;
        }

        System.out.println("Second largest number: " + secondMax);
    }
}