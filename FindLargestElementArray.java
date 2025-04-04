/*
 * FindLargestElementArray.java
 * This program finds the largest element in an array of doubles.
 */
public class FindLargestElementArray {
    public static void main(String[] args) {
        double[] A = {4.5, 6.2, 3.8, 7.1};
        double max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Largest number: " + max);
    }
}