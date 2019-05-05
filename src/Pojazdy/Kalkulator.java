package Pojazdy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Kalkulator {

    public static void main(String[] args) {
        runApp();
    }
    public static void runApp(){
        JFrame frame = new JFrame("Kalkulator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(300,400);
        frame.setMinimumSize(dimension);
        frame.pack();
        panel(frame);

        frame.setVisible(true);

    }
    public static void panel(JFrame frame){
        frame.setLayout(new GridLayout(4, 4));
        JButton button= new JButton("7");
        JButton button1= new JButton("8");
        JButton button2= new JButton("9");
        JButton button3= new JButton("/");
        JButton button4= new JButton("4");
        JButton button5= new JButton("5");
        JButton button6= new JButton("6");
        JButton button7= new JButton("*");
        JButton button8= new JButton("1");
        JButton button9= new JButton("2");
        JButton button10= new JButton("3");
        JButton button11= new JButton("-");
        JButton button12= new JButton("0");
        JButton button13= new JButton(".");
        JButton button14= new JButton("=");
        JButton button15= new JButton("+");
        //add(panel, BorderLayout.CENTER);
    }

}
