import java.awt.*;
import javax.swing.*;

public class LineDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int y; // y-coordinate for the line
        int i; // loop control variable

        y = 50; // y starts at 50 for the first line
        for (i = 1; i <= 10; i++) {
            g.drawLine(100, y, 300, y);
            y = y + 10; // increase y by 10 before drawing the next line.
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200); // Adjust size as needed
        frame.getContentPane().add(new LineDrawing());
        frame.setVisible(true);
    }
}