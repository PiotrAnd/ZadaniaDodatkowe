package kursYT.javaOdPodstaw;

public class zadanie2 {
    public static void main(String[] args) {
        kolo();
        System.out.println();
        wynikDodawania();
        System.out.println();
        zmeiennaDouble();
        System.out.println();
        alfabet();
        System.out.println();
        funkcjeMatematyczne();

        zadanie2 Z2 = new zadanie2();
        Z2.wypiszMnie();

    }

    public void wypiszMnie(){
        System.out.println("fsdfsd");
    }

    private static void kolo() {
        int promien = 47;
        double obwod;
        double pole;
        double pi = 3.14;
        pole = pi * (promien*promien);
        obwod = 2*pi*promien;
        System.out.println("Obwód okręgu wynosi "+ obwod +" natomiast pole oktęgu wynosi "+pole);
    }

    private static void wynikDodawania() {
        String name = "Wynikiem dodawania liczby 2 i 2 jest ";
        int dwa = 2;
        System.out.println(name+(dwa+dwa));
    }

    private static void zmeiennaDouble() {
        double a = 10.123456789;
        a++;
        System.out.println("Liczba 10.123456789 po jednej inkrentacji przyjmie wartość: " + a);
    }

    private static void alfabet() {
        char letter = 'a';
        letter++;
        System.out.println("Litera a po jednej inkrentacji przyjmie wartość: " + letter);
    }

    private static void funkcjeMatematyczne() {
        int l1 = 15;
        int l2 = 5;
        int wynik;
        int wynik1;
        int wynik2;
        int wynik3;
        int wynik4;
        wynik = l1+l2;
        System.out.println("15 + 5 = "+wynik);
        wynik1 = l1-l2;
        System.out.println("15 - 5 = "+wynik1);
        wynik2 = l1*l2;
        System.out.println("15 * 5 = "+wynik2);
        wynik3 = l1/l2;
        System.out.println("15 / 5 = "+wynik3);
        wynik4 = l1%l2;
        System.out.println("15 % 5 = "+wynik4);

    }

}
