package string;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SwingMenu {
    private JPanel mainPanel;
    private JLabel myLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingMenu");

        SwingMenu main = new SwingMenu();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMenu(frame, main.myLabel);
        frame.pack();
        frame.setSize(500, 300);
        frame.setBounds(200, 150, frame.getWidth(), frame.getHeight());
        frame.setVisible(true);
    }

    private static void addMenu(final JFrame frame, final JLabel myLabel2) {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");


    }
}

