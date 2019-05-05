package SwingPojazdy;

import javafx.stage.FileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runApp();
    }
    private static void runApp(){
        JFrame frame = new JFrame();
        frame.setTitle("Pojazdy");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        Dimension dimension = new Dimension(600, 500);
        frame.setMinimumSize(dimension);
        frame.pack();
        addMenu(frame);
        frame.setVisible(true);
    }
    private static void addMenu(JFrame frame){
        JMenuBar menuBar = new JMenuBar();
        // Tworzymy menu plik
        JMenu fileMenu = new JMenu("Pliki");
        JMenuItem nowyItem = new JMenuItem("Nowy",'N');
        JMenuItem openItem = new JMenuItem("Otwórz",'O');
        JMenuItem saveItem = new JMenuItem("Zapisz",'Z');
        JMenuItem closeItem = new JMenuItem("Zamknij",'X');
        JTextArea panel = new JTextArea();
        frame.setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        fileMenu.add(nowyItem);
        fileMenu.addSeparator();
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(closeItem);
        // actionListener dla menu Plik
        nowyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addOpen(frame);
            }
        });
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        Scanner scanner = new Scanner(file);
                        while (scanner.hasNext())
                            panel.append(scanner.nextLine()+"\n");
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "Otwarty plik to ... "
                                    + file.getName());
                }
            }
        });
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        PrintWriter writer = new PrintWriter(file);
                        Scanner scanner = new Scanner(panel.getText());
                        while (scanner.hasNext())
                            writer.println(scanner.nextLine() + "\n");
                        writer.close();
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,
                            "Zapisany plik to ... "
                                    + file.getName());
                }
            }
        });
        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int odp= JOptionPane.showConfirmDialog
                        (null, "Czy napewno chcesz opuśćić program??",
                                "Pytanie",JOptionPane.YES_NO_OPTION);
                if (odp==JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        // tworzymy menu Edycja
        JMenu editMenu = new JMenu("Edycja");
        JMenuItem cut = new JMenuItem("Wytnij");
        JMenuItem copy = new JMenuItem("Kopiuj");
        JMenuItem paste = new JMenuItem("Wklej");
        menuBar.add(editMenu);
        editMenu.add(cut);
        editMenu.addSeparator();
        editMenu.add(copy);
        editMenu.addSeparator();
        editMenu.add(paste);

        // tworzymy menu Notatnik
        JMenu notatnikMenu = new JMenu("Notatnik");
        JMenuItem  notatnikItem = new JMenuItem("Otwórz notatnik");
        menuBar.add(notatnikMenu);
        notatnikMenu.add(notatnikItem);
        notatnikItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNotatnik(frame, panel);
            }
        });
        JMenu styleMenu = new JMenu("Style Menu");
        JMenuItem styleMetalItem = new JMenuItem("Styl Metal");
        JMenuItem styleNiMbusItem = new JMenuItem("Styl Nimbus");
        JMenuItem styleWindowsItem = new JMenuItem("Styl Windows");
        menuBar.add(styleMenu);
        styleMenu.add(styleMetalItem);
        styleMenu.addSeparator();
        styleMenu.add(styleNiMbusItem);
        styleMenu.addSeparator();
        styleMenu.add(styleWindowsItem);

        styleMetalItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                } catch (UnsupportedLookAndFeelException e1) {
                    e1.printStackTrace();
                }
                SwingUtilities.updateComponentTreeUI(frame);
            }
        });
        styleNiMbusItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                } catch (UnsupportedLookAndFeelException e1) {
                    e1.printStackTrace();
                }
                SwingUtilities.updateComponentTreeUI(frame);
            }
        });
        styleWindowsItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                } catch (UnsupportedLookAndFeelException e1) {
                    e1.printStackTrace();
                }
                SwingUtilities.updateComponentTreeUI(frame);
            }
        });
    }


    private static void addOpen(JFrame frame) {
        frame.setLayout(new GridLayout(7, 2) {
        });
        JLabel labelMarka = new JLabel("Marka pojazdu");
        JLabel labelTabice = new JLabel("Tablice rejestracyjne");
        JLabel labelNr = new JLabel("Nr sprawy");
        JLabel labelWlasciciel = new JLabel("Właściciel");
        JLabel labelOstatniOdb = new JLabel("Ostatni odbiorca pisma");
        JLabel labelData = new JLabel("Data pisma");

        JTextField markaPojazdu = new JTextField();
        markaPojazdu.getText();
        JTextField tabliceRej = new JTextField();
        JTextField nrSprawy = new JTextField();
        JTextField wlasciciel = new JTextField();
        JTextField ostatniOdbiorca = new JTextField();
        JTextField dataPisma = new JTextField();

        JButton cleanButton = new JButton("Wyczyść");
        JButton saveButton = new JButton("Zapisz");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        frame.add(labelNr);
        frame.add(nrSprawy);
        frame.add(labelMarka);
        frame.add(markaPojazdu);
        frame.add(labelTabice);
        frame.add(tabliceRej);
        frame.add(labelWlasciciel);
        frame.add(wlasciciel);
        frame.add(labelOstatniOdb);
        frame.add(ostatniOdbiorca);
        frame.add(labelData);
        frame.add(dataPisma);
        frame.add(saveButton);
        frame.add(cleanButton);
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nrSprawy.setText("");
                markaPojazdu.setText("");
                tabliceRej.setText("");
                wlasciciel.setText("");
                ostatniOdbiorca.setText("");
                dataPisma.setText("");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
    private static void addNotatnik(JFrame frame, JTextArea panel) {
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(10, 10, 500, 300);
        JTextField textField = new JTextField();
        textField.setBounds(100, 330, 150, 30);
        JButton buttonSzukaj = new JButton("Szukaj");
        buttonSzukaj.setBounds(250, 330, 150, 30);
        JScrollPane scrollPane1 = new JScrollPane();
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(250, 380, 150, 30);
        comboBox.addItem("Czarny");
        comboBox.addItem("Czerwony");
        comboBox.addItem("Zielony");
        comboBox.addItem("Niebieski");
        JButton buttonColor = new JButton("Wybierz kolor");
        buttonColor.setBounds(100, 380, 150, 30);
        frame.add(scrollPane);
        frame.add(buttonSzukaj);
        frame.add(textField);
        frame.add(comboBox);
        frame.add(buttonColor);
        frame.setLayout(null);
        frame.setVisible(true);

        buttonSzukaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = panel.getText();
                String search = textField.getText();
                String wystapienia = "";
                int i = 0;
                int index;
                int startIndex = 0;
                while ((index = text.indexOf(search, startIndex)) != -1) {
                    startIndex = index + search.length();
                    i++;
                    wystapienia = wystapienia + " " + index;
                }
                JOptionPane.showMessageDialog(null, search + " wystąpiło " + i + " razy" + wystapienia);

            }
        });
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = comboBox.getSelectedItem().toString();
                if (color.equals("Czarny"))
                    panel.setForeground(Color.BLACK);
                else if (color.equals("Czerwony"))
                    panel.setForeground(Color.RED);
                else if (color.equals("Zielony"))
                    panel.setForeground(Color.GREEN);
                else if (color.equals("Niebieski"))
                    panel.setForeground(Color.blue);
            }
        });
        buttonColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Wybór koloru", Color.GREEN);
                panel.setForeground(color);
            }
        });
    }
}
