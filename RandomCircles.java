/*
 * RandomCircles.java
 * This program demonstrates how to draw random colored circles on a JPanel using Java's Graphics class.
 */
import java.awt.*;
import javax.swing.*;

public class RandomCircles extends JPanel {
    
    public static void main(String[] args) {
        JFrame window = new JFrame("Random Colored Circles");
        RandomCircles content = new RandomCircles();
        window.setContentPane(content);
        window.setSize(800, 600);
        window.setLocation(100, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Get the width and height of the drawing area
        int width = getWidth();
        int height = getHeight();
        
        // Set background to white
        setBackground(Color.WHITE);
        
        // Draw 500 random circles
        for (int i = 0; i < 500; i++) {
            // Randomly select a color
            switch ((int)(4 * Math.random())) {
                case 0 -> g.setColor(Color.RED);
                case 1 -> g.setColor(Color.GREEN);
                case 2 -> g.setColor(Color.BLUE);
                case 3 -> g.setColor(Color.YELLOW);
            }
            
            // Randomly position the center of the circle
            int centerX = (int)(width * Math.random());
            int centerY = (int)(height * Math.random());
            
            // Draw the filled circle
            g.fillOval(centerX - 50, centerY - 50, 100, 100);
            
            // Draw a black outline around the circle
            g.setColor(Color.BLACK);
            g.drawOval(centerX - 50, centerY - 50, 100, 100);
        }
    }
}