/*
 * a program to to display all numbers from 1 to 10 except multiples of 3.
 */

public class ContinueExample {
    public static void main(String[] args){
        int number = 0;
        while (number < 10){
            number++;
            if (number % 3 == 0){
                continue;
            }
            System.out.println(number);
        }
    }
    
}
