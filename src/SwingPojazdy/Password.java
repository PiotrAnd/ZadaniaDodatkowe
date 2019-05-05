package SwingPojazdy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Password {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hasło");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);
        Dimension dimension = new Dimension(300, 200);
        frame.setMinimumSize(dimension);
        JLabel user = new JLabel("Nazwa użytkownika:");
        user.setBounds(10,20,150,20);
        JTextField userFiield = new JTextField();
        userFiield.setBounds(160,20,100,20);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(160,50,100,20);
        JLabel haslo = new JLabel("Hasło:");
        haslo.setBounds(10,50,150,20);
        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, String.valueOf(passwordField.getPassword()));
            }
        });
        frame.add(user);
        frame.add(userFiield);
        frame.add(passwordField);
        frame.add(haslo);
        frame.setVisible(true);
    }
}
