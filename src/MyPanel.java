import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(1560, 700); // Убраны именованные параметры (не поддерживаются в Java)
    }

    private int X = 0;
    private int Y = 0;
    private int width = 100;
    private int height = 100;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(X, Y, width, height);
    }
}
