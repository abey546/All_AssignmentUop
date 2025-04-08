/*
 * This program demonstrates how to draw a line with a random color using Java's Graphics class.
 * It uses a switch expression to select a color based on a random number.
 */

import java.awt.*;
import javax.swing.*;

public class RandomColorLine extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Define the line's start and end points
        int x1 = 50;
        int y1 = 50;
        int x2 = 250;
        int y2 = 100;

        // Generate a random integer between 0 (inclusive) and 4 (exclusive)
        int randomNumber = (int) (4 * Math.random());

        // Set the color based on the random number using a switch expression
        switch (randomNumber) {
            case 0 -> g.setColor(Color.RED);
            case 1 -> g.setColor(Color.GREEN);
            case 2 -> g.setColor(Color.BLUE);
            case 3 -> g.setColor(Color.YELLOW);
            default -> g.setColor(Color.BLACK); // Optional: Default color if the random number is unexpected
        }

        // Draw the line with the randomly selected color
        g.drawLine(x1, y1, x2, y2);

        // You can add more drawing here if you like, with different random colors
        int x3 = 100;
        int y3 = 150;
        int x4 = 300;
        int y4 = 50;

        int anotherRandomNumber = (int) (4 * Math.random());
        switch (anotherRandomNumber) {
            case 0 -> g.setColor(Color.RED);
            case 1 -> g.setColor(Color.GREEN);
            case 2 -> g.setColor(Color.BLUE);
            case 3 -> g.setColor(Color.YELLOW);
            default -> g.setColor(Color.BLACK);
        }
        g.drawOval(x3, y3, 50, 50); // Draw a circle with a random color
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Color Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.add(new RandomColorLine());
        frame.setVisible(true);
    }
}