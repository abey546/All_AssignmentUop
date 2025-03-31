/*
 * EnumSwitchExample.java
 * This program demonstrates the use of an enum in a switch statement.
 */
public class EnumSwitchExample {
    enum Season { SPRING, SUMMER, FALL, WINTER }

    public static void main(String[] args) {
        Season currentSeason = Season.FALL;

        System.out.print("The months in " + currentSeason + " are: ");
        
        switch (currentSeason) {
            case WINTER -> System.out.println("December, January, February");
            case SPRING -> System.out.println("March, April, May");
            case SUMMER -> System.out.println("June, July, August");
            case FALL -> System.out.println("September, October, November");
        }
    }
}
