package string;

import javax.swing.*;
import java.awt.*;

public class SizedFrameTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new SizedFrame();
                frame.setTitle("SizedFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

