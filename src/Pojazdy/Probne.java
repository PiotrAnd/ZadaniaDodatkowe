package Pojazdy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Probne {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Próbne okienko");
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setLocation(500,300);
        frame.setLayout(new GridLayout(5,1));
        JTextField textField = new JTextField();
        textField.setBounds(30,20,150,20);
        frame.add(textField);
        JLabel label = new JLabel();
        label.setBounds(30,20,150,20);
        JButton button = new JButton("Przycisk");
        button.setBounds(30,20,150,20);
        JButton button1 = new JButton("Click me");
        button1.setBounds(30,20,150,20);
        JButton button2 = new JButton(new ImageIcon("D:\\clickme.jpg"));
        button2.setBounds(30,20,150,20);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Przycisnąłes przycisk - Przycisk");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Przycisnąłeś przycisk - Click me");
            }
        });

        frame.add(label);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String host=textField.getText();
                    String ip=java.net.InetAddress.getByName(host).getHostAddress();
                    label.setText("IP of "+host+" is: "+ip);
                }catch(Exception ex){System.out.println(ex);}
            }
        });
        frame.pack();
        frame.setVisible(true);

    }
}
