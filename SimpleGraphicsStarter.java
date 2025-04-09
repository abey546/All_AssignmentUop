/*
 * SimpleGraphicsStarter.java
 * This program demonstrates how to draw random colored circles on a JPanel using Java's Graphics class.
 */

import java.awt.*;
import javax.swing.*;

public class SimpleGraphicsStarter extends JPanel {

    // This method is called automatically when the panel needs to be drawn
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Clears previous drawing

        int width = getWidth();   // Width of the panel
        int height = getHeight(); // Height of the panel

        // Fill background with white
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        int centerX;
        int centerY;
        int colorChoice;

        for (int count = 0; count < 500; count++) {
            centerX = (int)(Math.random() * width);
            centerY = (int)(Math.random() * height);
            colorChoice = (int)(4 * Math.random());

            switch (colorChoice) {
                case 0 -> g.setColor(Color.RED);
                case 1 -> g.setColor(Color.GREEN);
                case 2 -> g.setColor(Color.BLUE);
                case 3 -> g.setColor(Color.YELLOW);
            }

            // Draw filled circle
            g.fillOval(centerX - 50, centerY - 50, 100, 100);

            // Draw black outline
            g.setColor(Color.BLACK);
            g.drawOval(centerX - 50, centerY - 50, 100, 100);
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Graphics");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setContentPane(new SimpleGraphicsStarter());
        window.setVisible(true);
    }
}
