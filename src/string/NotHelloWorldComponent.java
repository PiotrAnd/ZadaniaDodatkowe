package string;

import javax.swing.*;
import java.awt.*;

public class NotHelloWorldComponent extends JComponent {
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    public void paintComponent(Graphics g) {
        g.drawString("To nie jest program „Witaj, świecie”", MESSAGE_X, MESSAGE_Y);
    }
}
