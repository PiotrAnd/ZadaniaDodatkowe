package Pojazdy;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        runApp();
    }
    public static void runApp() {
        JFrame frame = new JFrame();
        frame.setTitle("Zestawienie pojazdów");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        Dimension dimension = new Dimension(400, 200);
        frame.setMinimumSize(dimension);

        //frame.add(scrollPane);
        frame.pack();
        menuApp(frame);

        frame.setVisible(true);
        popMenu(frame);
    }

    public static void menuApp(JFrame frame) {
        JLabel myLabel2 = new JLabel();
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Plik");
        JMenu editMenu = new JMenu("Edycja");
        JMenu find = new JMenu("Szukaj");
        JMenu array = new JMenu("Tabela");
        JMenuItem newItem = new JMenuItem("Nowy",'N');
        JMenuItem openItem = new JMenuItem("Otwórz",'O');
        JMenuItem saveItem = new JMenuItem("Zapisz",'Z');
        JMenuItem closeItem = new JMenuItem("Zakończ");
        JMenuItem cut = new JMenuItem("Wytnij");
        JMenuItem copy = new JMenuItem("Kopiuj");
        JMenuItem paste = new JMenuItem("Wklej");
        JMenuItem findNr = new JMenuItem("Szukaj po nr sprawy");
        JMenuItem findRej = new JMenuItem("Szukaj po nr rejestracyjnych");
        JMenuItem findCar = new JMenuItem("Szukaj po marce pojazdu");
        JMenuItem arrays2 = new JMenuItem("Tabela");
        frame.setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(find);
        menuBar.add(array);
        fileMenu.add(newItem);
        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    addSet(frame);
                }
        });
        newItem.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
        fileMenu.addSeparator();
        fileMenu.add(openItem);
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
                    File file = fc.getSelectedFile();
                    JOptionPane.showMessageDialog(null,
                            "Wybrany plik to ... "
                                    +file.getName());

                }
//                int returnVal = fc.showOpenDialog(null);
//
//                if (returnVal == JFileChooser.APPROVE_OPTION) {
//                    File file = fc.getSelectedFile();
//                    myLabel2.setText(file.getName());
//                }
            }
        });
        openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        fileMenu.addSeparator();
        fileMenu.add(saveItem);
        saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl Z"));
        //saveItem.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFileChooser fc = new JFileChooser();
//                if (fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
//                    File file = fc.getSelectedFile();
//                    try {
//
//            }PrintWriter writer = new PrintWriter(file);
////                        Scanner scanner = new Scanner(notatnik3.getText());
////                        while (scanner.hasNext())
////                            writer.println(scanner.nextLine()+"\n");
////                        writer.close();
////                    } catch (FileNotFoundException e1) {
////                        e1.printStackTrace();
////                    }
////                    JOptionPane.showMessageDialog(null,
////                            "Zapisany plik to ... "
////                                    +file.getName());
////                }
//        });
        fileMenu.addSeparator();
        fileMenu.add(closeItem);
        closeItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int odp= JOptionPane.showConfirmDialog
                        (null, "Czy napewno chcesz opuśćić program??",
                                "Pytanie",JOptionPane.YES_NO_OPTION);
        if (odp==JOptionPane.YES_OPTION)
                System.exit(0);
            }
        });
        closeItem.setAccelerator(KeyStroke.getKeyStroke("ctrl W"));
        editMenu.add(cut);
        editMenu.addSeparator();
        editMenu.add(copy);
        editMenu.addSeparator();
        editMenu.add(paste);
        find.add(findNr);
        find.addSeparator();
        find.add(findCar);
        find.addSeparator();
        find.add(findRej);
        array.add(arrays2);
    }

    private static void addSet(JFrame frame) {
        frame.setLayout(new GridLayout(7, 2) {
        });
        JLabel labelMarka = new JLabel("Marka pojazdu");
        JLabel labelTabice = new JLabel("Tablice rejestracyjne");
        JLabel labelNr = new JLabel("Nr sprawy");
        JLabel labelWlasciciel = new JLabel("Właściciel");
        JLabel labelOstatniOdb = new JLabel("Ostatni odbiorca pisma");
        JLabel labelData = new JLabel("Data pisma");

        JTextField markaPojazdu = new JTextField();
        JTextField tabliceRej = new JTextField();
        JTextField nrSprawy = new JTextField();
        JTextField wlasciciel = new JTextField();
        JTextField ostatniOdbiorca = new JTextField();
        JTextField dataPisma = new JTextField();

        JButton cleanButton = new JButton("Wyczyść");
        JButton saveButton = new JButton("Zapisz");

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

    private static void popMenu(JFrame frame) {
        JPopupMenu popupmenu = new JPopupMenu("Edycja");
        JMenuItem cut = new JMenuItem("Wytnij");
        JMenuItem copy = new JMenuItem("Kopiuj");
        JMenuItem paste = new JMenuItem("Wklej");
        popupmenu.add(cut);
        popupmenu.addSeparator();
        popupmenu.add(copy);
        popupmenu.addSeparator();
        popupmenu.add(paste);
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(frame, e.getX(), e.getY());
            }
        });
        frame.add(popupmenu);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    private static void notatnik(JFrame frame){

    }
}


