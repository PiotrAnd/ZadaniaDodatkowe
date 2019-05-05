package dodatkoweZadania;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CelsiusConvert {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Celcius Convert");
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
        frame1.setSize(500, 200);
        Dimension dimension = new Dimension(400, 200);
        frame1.setMinimumSize(dimension);
        frame1.setLayout(new GridLayout(2,2));
        JTextField textField = new JTextField("Podaj wartośc tempertury w C");
        frame1.add(textField);
        JLabel label = new JLabel("Celsiusz");
        frame1.add(label);
        JButton button = new JButton("Convert");
        frame1.add(button);
        JLabel label1 = new JLabel("Wartość w Fahrenheit");
        frame1.add(label1);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(textField.getText()))
                        * 1.8 + 32);
                label1.setText(tempFahr + " Fahrenheit");
            }
        });
        frame1.pack();
        frame1.setVisible(true);

    }

}
