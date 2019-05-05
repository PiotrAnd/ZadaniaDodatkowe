package kursYT.javaOdPodstaw;

import java.util.Arrays;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        //tekst();
        wizytowki();
        //obliczaniePunktow();
        //kolejnoscRosnaca();
        //liczbyPierwsze();

    }

    private static void tekst() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Podaj dowolny tekst: ");
        String tekst = sr.nextLine();
        System.out.println("Czy wydrukowac podany tekst??");
        System.out.println("Podaj liczbę: ");
        int liczba = sr.nextInt();
        if (liczba>2) {
            System.out.println("Nie zrozumiałem, wybierz odpowiedź jeszcze raz");
            return;
        }
        switch (liczba){
            case 1:
                System.out.println(tekst);
                break;
            case 2:
                System.out.println();
                if (liczba<2){
                    System.out.println("nie zrozumiałem, wybierz odpowiedź jeszcze raz");
                }
        }
    }

    private static void wizytowki() {
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = liczba.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = liczba.nextLine();
        System.out.println("Podaj punkty za rezultat: ");
        int numberPhone = liczba.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Surname: "+surname);
        System.out.println("Number Phone: "+numberPhone);

    }

    private static void obliczaniePunktow() {
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj punkty za styl: ");
        int styl = liczba.nextInt();
        System.out.println("Podaj punkty za efekt: ");
        int efekt = liczba.nextInt();
        System.out.println("Podaj punkty za rezultat: ");
        int rezultat = liczba.nextInt();
        int wynikStyl= (int) (styl * 0.2);
        int wynikEfekt = (int) (efekt * 0.3);
        int wynikRezultat = (int) (rezultat * 0.5);
        System.out.println("Łączna ilość punktów wynosi: " + (wynikStyl+wynikEfekt+wynikRezultat));

    }

    private static void liczbyPierwsze() {
            Scanner sr = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            int podanaLiczba = sr.nextInt();

            boolean pierwsza = true;
            if (podanaLiczba<2) {
                return;
        }
            for(int i=2;i<=podanaLiczba/2;i++)//for(int i=2;i*i<=podanaLiczba
                if(podanaLiczba%i==0)
                    pierwsza = false;

            if(pierwsza)
                System.out.println("Liczba " + podanaLiczba + " jest liczbą pierwszą.");
            else
                System.out.println("Liczba " + podanaLiczba + " nie jest liczbą pierwszą.");
        }
    private static void kolejnoscRosnaca() {
        int[] tab = new int[3];
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę: ");
        tab [0] = liczba.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        tab[1]= liczba.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        tab[2] = liczba.nextInt();
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

    }
    }

